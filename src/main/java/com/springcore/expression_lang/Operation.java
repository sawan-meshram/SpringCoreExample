package com.springcore.expression_lang;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Operation {
	@Value("#{10+12}")
	private int x;
	
	@Value("#{1>2? 1: 2}")
	private int y;

	@Value("#{ T(java.lang.Math).sqrt(64) }") //static method called using SpEL
	private int z;
	
	@Value("#{ T(Math).PI }") //static variable called sing SpEL
	private double pi;
	
	@Value("#{ new java.lang.String('Sawan')}") //creating a object of class using SpEL
	private String name;
	
	@Value("#{28>18}") //boolean expression using SpEL or set value to true
	private boolean isAdult;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPi() {
		return pi;
	}
	public void setPi(double pi) {
		this.pi = pi;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Operation [x=" + x + ", y=" + y + ", z=" + z + ", pi=" + pi + ", name=" + name + ", isAdult=" + isAdult
				+ "]";
	}
	
	
}
