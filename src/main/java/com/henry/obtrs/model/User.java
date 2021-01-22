package com.henry.obtrs.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	//maping
	private int cityId;
	private String city;
	private String firstName;
	private String middleName;
	private String lastName;
	private String gender;
	private String password;
	private String address;
	private String mobile;
	private String email;
	private boolean isActive;
	
}