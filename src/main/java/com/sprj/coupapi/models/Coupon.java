package com.sprj.coupapi.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import com.sprj.coupapi.enums.CouponStatus;
import com.sprj.coupapi.enums.CouponType;

import javafx.beans.DefaultProperty;
import lombok.AllArgsConstructor;
import lombok.Builder.Default;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Coupon {

	@Id
	@GeneratedValue
	@Column
	private long id;
	private String title;
	private String message;
	private double price;
	private int amount;

	@Enumerated(EnumType.STRING)
	@Column(columnDefinition = "varchar(32) default 'OTHER'")
	private CouponType type = CouponType.OTHER;
	@Enumerated(EnumType.STRING)
	@Column(columnDefinition = "varchar(32) default 'SALE'")
	private CouponStatus status = CouponStatus.SALE;
	// Date start_date;
	// Date end_date;

}
