package com.sanhotels.email.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanhotels.email.entity.EmailToPost;
import com.sanhotels.email.repository.EmailRepository;

@Service
public class EmailService {
	@Autowired
	EmailRepository emailRepo;

	public List<EmailToPost> getAllEmails(Long idhotel) {
		// TODO Auto-generated method stub
		return emailRepo.findAllByIdhotel(idhotel);
	}

	public Optional<EmailToPost>  getEmailById(Long id, Long idhotel) {
		// TODO Auto-generated method stub
		return emailRepo.findAllByIdEmailAndIdhotel(id,idhotel);
	}

	public Optional<EmailToPost> getEmailByModelName(String modelname, Long idhotel) {
		// TODO Auto-generated method stub
		return emailRepo.findAllByModelNameAndIdhotel(modelname,idhotel);
	}

	public EmailToPost addTheEmail(EmailToPost email) {
		// TODO Auto-generated method stub
		return emailRepo.save(email);
	}

	public void editEmail(EmailToPost tc) {
		emailRepo.save(tc);
		
	}

	public void deleteById(Long id, Long idhotel) {
		emailRepo.deleteByIdEmailAndIdhotel(id,idhotel);
		
	}
	

}
