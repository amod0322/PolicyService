package com.example.policy.dto;

import java.util.Date;

import lombok.Data;

@Data
public class PersonalDetails {
	private Long personalId;
	private String name;
	private Date dob;
	private String state;
	private String city;

}
