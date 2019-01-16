package com.example.policy.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "personal_details")
public class PersonalDetailsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "personal_id")
	private Long personalId;

	@Column(name = "name")
	private String name;

	@Column(name = "dob")
	private Date dob;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id")
	private AddressEntity addressEntity;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "personal_id")
	private List<IncomeDetailsEntity> incomeDetailsEntity;

}
