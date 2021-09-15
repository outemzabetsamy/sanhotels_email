package com.sanhotels.email.controller;

import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.sanhotels.email.entity.EmailTemplate;
import com.sanhotels.email.entity.EmailToPost;
import com.sanhotels.email.entity.MailResponse;
import com.sanhotels.email.exception.EmailNotFoundException;
import com.sanhotels.email.service.EmailService;
import com.sanhotels.email.service.EmailServiceSender;


@RestController
@RequestMapping("/api/mail")
public class EmailController {
EmailService emailService;
@Autowired
EmailServiceSender emailSender;
@Autowired
public EmailController(EmailService emailService) {
	this.emailService=emailService;
}

@GetMapping("/all")
public List<EmailToPost> getEmails(@RequestParam("idhotel") Long idhotel){
	return emailService.getAllEmails(idhotel);
}

@GetMapping("/all/{id}")
public EmailToPost getEmailById(@PathVariable Long id,@RequestParam("idhotel") Long idhotel){

	
	return emailService.getEmailById(id,idhotel).orElseThrow(()->new EmailNotFoundException("Email with"+id+"not found"));
}
@GetMapping("/all/{modelname}")
public EmailToPost getEmailBymodelName(@PathVariable String modelname,@RequestParam("idhotel") Long idhotel){
	return emailService.getEmailByModelName(modelname,idhotel).orElseThrow(()->new EmailNotFoundException("Email with"+modelname+"not found"));
}

@PostMapping("/add")
public ResponseEntity<EmailToPost> addEmail(@RequestBody EmailToPost email){
	EmailToPost em= emailService.addTheEmail(email);
	if(em==null) {
		return ResponseEntity.noContent().build();
		}
	URI location =ServletUriComponentsBuilder.fromCurrentRequest().path("{id}").buildAndExpand(em.getIdEmail()).toUri();
	return ResponseEntity.created(location).build();
	}
@PutMapping(value="/edit")
public void editTypeChambre(@RequestBody EmailToPost tc) {
	emailService.editEmail(tc);
}

@DeleteMapping(value="/delete/{id}")
public void deleteTypeChambreById(@PathVariable Long id,@RequestParam("idhotel") Long idhotel) {
	emailService.deleteById(id,idhotel);
}


@PostMapping("/sendingEmail")
public MailResponse sendEmail(@RequestBody EmailTemplate request) {
	request.setEmailInfo(this.getEmailBymodelName(request.getEmailInfo().getModelName(), request.getReservation().getIdHotel()));
	Map<String, Object> model = new HashMap<>();
	model.put("guestName", request.getReservation().getClient().getNomClient()+" "+request.getReservation().getClient().getPrenomClient());
	model.put("arrivalDate", request.getReservation().getDateDebut());
	model.put("departureDate", request.getReservation().getDatefin());
	model.put("nbNight", request.getReservation().getNbJours());
	model.put("nameForEmail", request.getReservation().getClient().getPrenomClient());
	model.put("bodyEmail", request.getEmailInfo().getBodyEmail());
	model.put("nomGerant", request.getHotel().getNomGerant()+" "+request.getHotel().getPrenomGerant());
	model.put("adresseHotel", request.getHotel().getAdresseHotel());
	model.put("hotelName", request.getHotel().getNomHotel());
	model.put("mailHotel", request.getHotel().getEmail());
	model.put("idReservation", request.getReservation().getIdReservation());
	model.put("mailHotel", request.getHotel().getEmail());
	
	return emailSender.sendEmail(request, model);

}



}

