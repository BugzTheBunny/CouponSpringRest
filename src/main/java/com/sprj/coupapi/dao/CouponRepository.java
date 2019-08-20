package com.sprj.coupapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sprj.coupapi.models.Coupon;

public interface CouponRepository extends JpaRepository<Coupon, Integer> {

}
