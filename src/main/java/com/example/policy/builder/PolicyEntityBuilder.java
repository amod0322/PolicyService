package com.example.policy.builder;

import com.example.policy.dto.PersonalDetails;
import com.example.policy.dto.Policy;
import com.example.policy.entity.AddressEntity;
import com.example.policy.entity.IncomeDetailsEntity;
import com.example.policy.entity.PersonalDetailsEntity;
import com.example.policy.entity.PolicyDetailsEntity;

public class PolicyEntityBuilder {

	public PolicyDetailsEntity build(Policy policy) {
		return null;
	}

	private PersonalDetailsEntity buildPersonalDetailsEntity(Policy policy) {
		PersonalDetailsEntity personalDetailsEntity = new PersonalDetailsEntity();
		PersonalDetails personalDetails = policy.getPersonalDetails();
		personalDetailsEntity.setName(personalDetails.getName());
		personalDetailsEntity.setDob(personalDetails.getDob());
		personalDetailsEntity.setAddressEntity(buildAddressEntity(policy));

		return personalDetailsEntity;
	}

	private AddressEntity buildAddressEntity(Policy policy) {
		AddressEntity addressEntity = new AddressEntity();
		addressEntity.setState(policy.getPersonalDetails().getCity());
		addressEntity.setCity(policy.getPersonalDetails().getState());
		return addressEntity;
	}

	private IncomeDetailsEntity buildIncomeDetailsEntity(Policy policy) {
		IncomeDetailsEntity incomeDetailsEntity = new IncomeDetailsEntity();
		return null;
	}

}
