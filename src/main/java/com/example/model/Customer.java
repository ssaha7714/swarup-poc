package com.example.model;

import java.io.Serializable;

public class Customer implements Serializable{

	private static final long serialVersionUID = 1L;

	private long custId;
	private String name;
	private int age;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public Customer(long custId,String name,int age) {
		this.custId=custId;
		this.name=name;
		this.age= age;
	}
	
	public long getCustId() {
		return custId;
	}
	public void setCustId(long custId) {
		this.custId = custId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
