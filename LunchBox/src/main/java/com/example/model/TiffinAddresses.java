package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "TiffinAddresses")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class TiffinAddresses {
	@Id
	@GeneratedValue
	@Column(name = "Id")
	int id;
	
	@Column(name = "Address")
	String address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
