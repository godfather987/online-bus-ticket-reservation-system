package com.henry.obtrs.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Schedule {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	 private String busNo;
}
