package com.henry.obtrs.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BusDetail {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	//mapping with bus id
	private String busNo;
	//mapping
	private int routeId;
	private boolean isAvailable;
	private String source;
	private String destination;
}
