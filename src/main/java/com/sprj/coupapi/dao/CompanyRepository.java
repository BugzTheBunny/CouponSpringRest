package com.sprj.coupapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sprj.coupapi.models.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer> {

}
