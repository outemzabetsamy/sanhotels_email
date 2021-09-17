package com.sanhotels.email.entity;

public class Chambre {
	
private Long id;
	
private int numChambre;
	
private int numEtage;
	
private String etatChambre;

private TypeChambre typeChambre;
public TypeChambre getTypeChambre() {
		return typeChambre;
	}
	public void setTypeChambre(TypeChambre typeChambre) {
		this.typeChambre = typeChambre;
	}
public Chambre() {
	super();
	// TODO Auto-generated constructor stub
}
public Chambre(Long id, int numChambre, int numEtage, String etatChambre,TypeChambre typeChambre) {
	super();
	this.id = id;
	this.numChambre = numChambre;
	this.numEtage = numEtage;
	this.etatChambre = etatChambre;
	this.typeChambre=typeChambre;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public int getNumChambre() {
	return numChambre;
}
public void setNumChambre(int numChambre) {
	this.numChambre = numChambre;
}
public int getNumEtage() {
	return numEtage;
}
public void setNumEtage(int numEtage) {
	this.numEtage = numEtage;
}
public String getEtatChambre() {
	return etatChambre;
}
public void setEtatChambre(String etatChambre) {
	this.etatChambre = etatChambre;
}
}
