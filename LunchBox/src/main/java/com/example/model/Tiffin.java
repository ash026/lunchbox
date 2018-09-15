package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "Tiffin")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Tiffin {
	
	@Id
	@GeneratedValue
	@Column(name = "Id")
	int id;
	
	@Column(name = "Type")
	String type;
	
	@Column(name = "PersonName")
	String personName;
	
	@Column(name = "Place")
	String place;
	
	@Column(name = "Special")
	char special;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public char getSpecial() {
		return special;
	}

	public void setSpecial(char special) {
		this.special = special;
	}

}
