package com.example.policy.dto;

import java.util.Date;

import lombok.Data;

@Data
public class PolicyDetails {

	private Long policyId;
	private String planName;
	private String planType;
	private Long tenure;
	private String premiumFrequency;
	private Long issuredAmount;
	private Date issuranceDate;
	private Date policyMaturityDate;
	private Long policyPremium;
	private Date maturityDate;
	private Long maturityAmount;
}
