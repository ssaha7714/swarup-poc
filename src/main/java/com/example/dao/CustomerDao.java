package com.example.dao;

import java.util.List;

import com.example.model.Customer;

public interface CustomerDao {
	public void insert(Customer cus);

	public void inserBatch(List<Customer> customers);
	public  List<Customer> loadAllCustomer();

    public Customer findCustomerById(long cust_id);

    public String findNameById(long cust_id);

    public int getTotalNumberCustomer();
}
