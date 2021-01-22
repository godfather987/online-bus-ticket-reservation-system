package com.henry.obtrs.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ScheduleDetail {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	//maping
	private int scheduleId;
	//maping
	private int sourceId;
	//maping
	
	private int destinationId;
	private String source;
	private String destination;
	private int weekOfDay;
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
