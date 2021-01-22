package com.henry.obtrs.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bus {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String busNo;
	private int Capacity;
	private boolean isAvailable;
	//Mapping
	private int busTypeId;
	
	//Mapping
	private int busCategoryId;
	//Mapping
	private int busDepoId;
	private String busDepo;
	private String busType;
	private String busCategory;
}
