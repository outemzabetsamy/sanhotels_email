package com.sanhotels.email.entity;




public class Hotel {

private Long idHotel;
private String nomHotel;
private String adresseHotel;
private String logo;
private int nbEtoiles;
private String nomGerant;
private String prenomGerant;
private String emailHotel;
public Long getIdHotel() {
	return idHotel;
}
public void setIdHotel(Long idHotel) {
	this.idHotel = idHotel;
}
public String getNomHotel() {
	return nomHotel;
}
public void setNomHotel(String nomHotel) {
	this.nomHotel = nomHotel;
}
public String getAdresseHotel() {
	return adresseHotel;
}
public void setAdresseHotel(String adresseHotel) {
	this.adresseHotel = adresseHotel;
}
public String getLogo() {
	return logo;
}
public void setLogo(String logo) {
	this.logo = logo;
}
public int getNbEtoiles() {
	return nbEtoiles;
}
public void setNbEtoiles(int nbEtoiles) {
	this.nbEtoiles = nbEtoiles;
}
public String getNomGerant() {
	return nomGerant;
}
public void setNomGerant(String nomGerant) {
	this.nomGerant = nomGerant;
}
public String getPrenomGerant() {
	return prenomGerant;
}
public void setPrenomGerant(String prenomGerant) {
	this.prenomGerant = prenomGerant;
}


public String getEmail() {
	return emailHotel;
}
public void setEmail(String email) {
	this.emailHotel = email;
}

public Hotel() {
	super();
	// TODO Auto-generated constructor stub
}
public Hotel(Long idHotel, String nomHotel, String adresseHotel, String logo, int nbEtoiles, String nomGerant,
		String prenomGerant, String emailHotel) {
	super();
	this.idHotel = idHotel;
	this.nomHotel = nomHotel;
	this.adresseHotel = adresseHotel;
	this.logo = logo;
	this.nbEtoiles = nbEtoiles;
	this.nomGerant = nomGerant;
	this.prenomGerant = prenomGerant;
	
	this.emailHotel = emailHotel;
}

}
