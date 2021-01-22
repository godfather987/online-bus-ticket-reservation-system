package com.henry.obtrs.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Reservation {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	//mapping
	private int userId;
	//mapping
	private int sourceId;
	//mapping
	private int destinationId;
	private int totalAmount;
	private String busNo;
	private boolean isCancel;
	private String source;
	private String destination;
	private int distance;
	private int noOfSeat;
	private Date journeyDate;
	private String firstName;
	private String middleName;
	private String lastName;
	private String email;
}
