package com.springcore.lifecycle;

public class Kachori {
	private double price;

	public Kachori(double price) {
		super();
		this.price = price;
		System.out.println("Kachori : Constructor (double)");
	}

	public Kachori() {
		super();
		System.out.println("Kachori : default Constructor");
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
		System.out.println("Kachori : Set price property");

	}

	@Override
	public String toString() {
		return "Kachori [price=" + price + "]";
	}
	
	public void init_1() {
		System.out.println("Init method called");
	}
	
	public void destroy_1() {
		System.out.println("Destroy method called");
	}

}
