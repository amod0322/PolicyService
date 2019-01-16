package com.example.policy.dto;

import java.util.Date;

import lombok.Data;

@Data
public class NomineeDetails {
	private Long nomineeId;
	private String name;
	private Date dob;
	private String relationshipWithPolicyHolder;
	private Long percentageStake;
}
