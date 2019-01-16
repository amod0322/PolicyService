package com.example.policy.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "nominee_details")
public class NomineeDetailsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "nominee_id")
	private Long nomineeId;

	@Column(name = "name")
	private String name;

	@Column(name = "dob")
	private Date dob;

	@Column(name = "relationship")
	private String relationshipWithPolicyHolder;

	@Column(name = "percentage_stake")
	private Long percentageStake;
}
