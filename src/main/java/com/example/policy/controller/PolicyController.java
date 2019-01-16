package com.example.policy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.policy.dto.Policy;

@RestController
public class PolicyController {

	@PostMapping("/policy")
	public Long createPolicy(Policy policy) {
		return null;
	}

	@GetMapping("/policy/{id}")
	public Policy getPolicy(@PathVariable("id") Long policyId) {
		return null;
	}

}
