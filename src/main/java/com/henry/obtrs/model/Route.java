package com.henry.obtrs.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Route {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	//mapping
	private int sourceId;
	//mapping
	private int destinationId;
	private String source;
	private String destination;
	private boolean isAvailable;
	private String busNo;
}
