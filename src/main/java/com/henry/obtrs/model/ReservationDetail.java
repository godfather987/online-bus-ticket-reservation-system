package com.henry.obtrs.model;

import java.util.Date;

import javax.persistence.Entity;
@Entity
public class ReservationDetail {

	private int reservationId;
	private String seatNo[]=new String[5];
	private int seatNum;
	//mapping
	private int seatTypeId;
	private int amount;
	private int distance;
	private int noOfSeat;
	private String firstName;
	private String middleName;
	private String lastName;
	private String email;
	private String source;
	private String destination;
	private String busNo;
	private Date journeyDate;
}
