package com.springcore.entities;

public class Student {
	private int id;
	private String name;
	private String address;
	public Student() {
		super();
	}
	public Student(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
}
