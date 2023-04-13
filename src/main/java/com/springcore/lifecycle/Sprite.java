package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Sprite implements InitializingBean, DisposableBean{
	private double price;

	public Sprite() {
		super();
		System.out.println("Sprite : default Constructor");
	}

	public Sprite(double price) {
		super();
		this.price = price;
		System.out.println("Sprite : Constructor (double)");
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
		System.out.println("Sprite : Set price property");
	}

	@Override
	public String toString() {
		return "Sprite [price=" + price + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// Init method
		System.out.println("Init method : Ready Sprite ");
	}

	@Override
	public void destroy() throws Exception {
		// destroy method
		System.out.println("Destroy method : Destroy or Empty Sprite");
	}
	
}
