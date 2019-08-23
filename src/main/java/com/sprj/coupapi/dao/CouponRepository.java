package com.sprj.coupapi.dao;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sprj.coupapi.models.Coupon;

public interface CouponRepository extends JpaRepository<Coupon, Integer> {

	Coupon findById(long id);

	Collection<Coupon> findByPriceGreaterThan(double price);

	Collection<Coupon> findByPriceLessThan(double price);

	Coupon findByTitle(String title);
}
