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
@Table(name = "policy_details")
public class PolicyDetailsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "policy_id")
	private Long policyId;

	@Column(name = "plan_name")
	private String planName;

	@Column(name = "plan_type")
	private String planType;

	@Column(name = "tenure")
	private Long tenure;

	@Column(name = "premium_frequency")
	private String premiumFrequency;

	@Column(name = "issured_Amount")
	private Long issuredAmount;

	@Column(name = "issurance_date")
	private Date issuranceDate;

	@Column(name = "policy_maturity_date")
	private Date policyMaturityDate;

	@Column(name = "policy_premium")
	private Long policyPremium;

	@Column(name = "maturity_date")
	private Date maturityDate;

	@Column(name = "maturity_amount")
	private Long maturityAmount;

}
