package com.example.demo.entities;



import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="prod")

public class Produit implements Serializable {
	@Id
	private long id;
	private String designation;
	private double prix;
	
	public Produit(String designation) {
		super();
		this.designation = designation;
	}
	
	
	public Produit() {}
	
	
	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}


	public Produit(String designation, double prix) {
		super();
		this.designation = designation;
		this.prix = prix;
	}
	




}
