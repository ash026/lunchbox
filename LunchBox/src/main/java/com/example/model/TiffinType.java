package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "TiffinType")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class TiffinType {
	@Id
	@GeneratedValue
	@Column(name = "Id")
	int id;
	
	@Column(name = "Type")
	String type;

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
	
	
	
}
