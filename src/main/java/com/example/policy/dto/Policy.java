package com.example.policy.dto;

import java.util.List;

import lombok.Data;

@Data
public class Policy {
	private PersonalDetails personalDetails;
	private List<IncomeDetails> incomeDetails;
	private NomineeDetails nomineeDetails;
	private PolicyDetails policyDetails;
}
