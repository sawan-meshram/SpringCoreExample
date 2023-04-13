package com.springcore.stereotype_annotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*
 * If defined Component without name then it used class variable naming convention to get bean name.
 * But if we give the name to component then must used this name to get class bean
 */
@Component("stud1")
@Scope("prototype")
public class Student {
	@Value("101")
	private int id;
	
	@Value("Sawan")
	private String name;
	
	@Value("Nagpur")
	private String address;
	
	@Value("#{city_1}")
	private List<String> cities; //used standalone list collection on config xml
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public List<String> getCities() {
		return cities;
	}
	public void setCities(List<String> cities) {
		this.cities = cities;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", cities=" + cities + "]";
	}

}
