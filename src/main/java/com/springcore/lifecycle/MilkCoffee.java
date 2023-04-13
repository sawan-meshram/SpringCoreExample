package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class MilkCoffee {
	private double price;

	public MilkCoffee() {
		super();
		System.out.println("MilkCoffee : default constructor");
	}

	public MilkCoffee(double price) {
		super();
		this.price = price;
		System.out.println("MilkCoffee : constructor (double)");
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
		System.out.println("MilkCoffee : set property");
	}

	@Override
	public String toString() {
		return "MilkCoffee [price=" + price + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("declare init method as start method");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("declare destroy method as end");
	}

}
