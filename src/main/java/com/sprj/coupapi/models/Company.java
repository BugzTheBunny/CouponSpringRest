package com.sprj.coupapi.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Company {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	long id;
	@ManyToMany
	private List<Coupon> coupons;
	String name;
	String email, password;

}
