package com.sanhotels.email.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EmailToPost {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idEmail;
	private String modelName;
	private String bodyEmail;
	private String subjectEmail;
	private String toEmail;
	private Long idhotel;
	private String username;
	
	public Long getIdhotel() {
		return idhotel;
	}
	public void setIdhotel(Long idhotel) {
		this.idhotel = idhotel;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public EmailToPost() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public EmailToPost(Long idEmail, String modelName, String bodyEmail, String subjectEmail, String toEmail,
			Long idhotel, String username) {
		super();
		this.idEmail = idEmail;
		this.modelName = modelName;
		this.bodyEmail = bodyEmail;
		this.subjectEmail = subjectEmail;
		this.toEmail = toEmail;
		this.idhotel = idhotel;
		this.username = username;
	}
	public Long getIdEmail() {
		return idEmail;
	}
	public void setIdEmail(Long idEmail) {
		this.idEmail = idEmail;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getBodyEmail() {
		return bodyEmail;
	}
	public void setBodyEmail(String bodyEmail) {
		this.bodyEmail = bodyEmail;
	}
	public String getSubjectEmail() {
		return subjectEmail;
	}
	public void setSubjectEmail(String subjectEmail) {
		this.subjectEmail = subjectEmail;
	}
	public String getToEmail() {
		return toEmail;
	}
	public void setToEmail(String toEmail) {
		this.toEmail = toEmail;
	}
	
}
