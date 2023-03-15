package com.str.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.str.model.CustomerBill;
@Repository
public interface CustomerBillDaoI extends JpaRepository<CustomerBill, Integer> {
	/* List<CustomerBill>findCustomerBillByname(); */
}
