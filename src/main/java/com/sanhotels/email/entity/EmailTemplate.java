package com.sanhotels.email.entity;

public class EmailTemplate {
private String toEmailForTemplate;
private EmailToPost emailInfo;
private Reservation reservation;
private Hotel hotel;
public EmailTemplate() {
	super();
	// TODO Auto-generated constructor stub
}

public EmailTemplate(String toEmailForTemplate, EmailToPost emailInfo, Reservation reservation, Hotel hotel) {
	super();
	this.toEmailForTemplate = toEmailForTemplate;
	this.emailInfo = emailInfo;
	this.reservation = reservation;
	this.hotel = hotel;
}

public String getToEmailForTemplate() {
	return toEmailForTemplate;
}

public void setToEmailForTemplate(String toEmailForTemplate) {
	this.toEmailForTemplate = toEmailForTemplate;
}

public EmailToPost getEmailInfo() {
	return emailInfo;
}
public void setEmailInfo(EmailToPost emailInfo) {
	this.emailInfo = emailInfo;
}
public Reservation getReservation() {
	return reservation;
}
public void setReservation(Reservation reservation) {
	this.reservation = reservation;
}
public Hotel getHotel() {
	return hotel;
}
public void setHotel(Hotel hotel) {
	this.hotel = hotel;
}


}
