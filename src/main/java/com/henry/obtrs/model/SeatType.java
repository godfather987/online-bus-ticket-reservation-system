package com.henry.obtrs.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SeatType {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	//mapping
	private int scheduleId;
	//mapping
	private int sourceId;
	//mapping
	private int destinationId;
	private String source;
	private String destination;
	private Integer weekOfDay;
	private String offDate;
	private int distance;
	private String BusNo;
	private String arrivalTime;
	private String departureTime;
	private String reachTime;
	private int timeTaken;
	//mapping
	private int busDetailId;
}
