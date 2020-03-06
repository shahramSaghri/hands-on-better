package com.cognizant.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.cognizant.calculation.Speed;

@Entity
@Table(name="SpeedResult")
public class SpeedResult {
	
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@Column(name="subjectName")
	private String subjectName;
	
	@Embedded
	@Column(name="speed")
	private Speed speed;
	
	@Column(name="experimentTime")
	private Timestamp experimentTime;
	
	
}
