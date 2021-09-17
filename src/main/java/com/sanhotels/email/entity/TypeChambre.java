package com.sanhotels.email.entity;

public class TypeChambre {
	
private Long id;
	
public TypeChambre() {
		super();
		// TODO Auto-generated constructor stub
	}
public TypeChambre(Long id, String nomType, int nbMaxPers, float prixAdulte, float prixEnfant) {
		super();
		this.id = id;
		this.nomType = nomType;
		this.nbMaxPers = nbMaxPers;
		this.prixAdulte = prixAdulte;
		this.prixEnfant = prixEnfant;
	}
public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomType() {
		return nomType;
	}
	public void setNomType(String nomType) {
		this.nomType = nomType;
	}
	public int getNbMaxPers() {
		return nbMaxPers;
	}
	public void setNbMaxPers(int nbMaxPers) {
		this.nbMaxPers = nbMaxPers;
	}
	public float getPrixAdulte() {
		return prixAdulte;
	}
	public void setPrixAdulte(float prixAdulte) {
		this.prixAdulte = prixAdulte;
	}
	public float getPrixEnfant() {
		return prixEnfant;
	}
	public void setPrixEnfant(float prixEnfant) {
		this.prixEnfant = prixEnfant;
	}
private String nomType;
private int nbMaxPers;
private float prixAdulte;
private float prixEnfant;
	
}

