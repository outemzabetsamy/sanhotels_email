package com.sanhotels.email.entity;


import java.util.Date;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Reservation {
	
	private Long idReservation;
	private String typeReservation;
	
	private String dateDebut;
	
	private String datefin;
	private String etatReservation;
	private int nbJours;
	private Float montantSejour;
	private UUID idFacture;
	private Long idHotel;
	private String username;
	private Client client;
	private Chambre chambre;
	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Reservation(Long idReservation, String typeReservation, String dateDebut, String datefin,
			String etatReservation, int nbJours, Float montantSejour, UUID idFacture, Long idHotel, String username,
			Client client, Chambre chambre) {
		super();
		this.idReservation = idReservation;
		this.typeReservation = typeReservation;
		this.dateDebut = dateDebut;
		this.datefin = datefin;
		this.etatReservation = etatReservation;
		this.nbJours = nbJours;
		this.montantSejour = montantSejour;
		this.idFacture = idFacture;
		this.idHotel = idHotel;
		this.username = username;
		this.client = client;
		this.chambre = chambre;
	}
	public Long getIdReservation() {
		return idReservation;
	}
	public void setIdReservation(Long idReservation) {
		this.idReservation = idReservation;
	}
	public String getTypeReservation() {
		return typeReservation;
	}
	public void setTypeReservation(String typeReservation) {
		this.typeReservation = typeReservation;
	}
	public String getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}
	public String getDatefin() {
		return datefin;
	}
	public void setDatefin(String datefin) {
		this.datefin = datefin;
	}
	public String getEtatReservation() {
		return etatReservation;
	}
	public void setEtatReservation(String etatReservation) {
		this.etatReservation = etatReservation;
	}
	public int getNbJours() {
		return nbJours;
	}
	public void setNbJours(int nbJours) {
		this.nbJours = nbJours;
	}
	public Float getMontantSejour() {
		return montantSejour;
	}
	public void setMontantSejour(Float montantSejour) {
		this.montantSejour = montantSejour;
	}
	public UUID getIdFacture() {
		return idFacture;
	}
	public void setIdFacture(UUID idFacture) {
		this.idFacture = idFacture;
	}
	public Long getIdHotel() {
		return idHotel;
	}
	public void setIdHotel(Long idHotel) {
		this.idHotel = idHotel;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Chambre getChambre() {
		return chambre;
	}
	public void setChambre(Chambre chambre) {
		this.chambre = chambre;
	}
	
	
	
	
	
}
