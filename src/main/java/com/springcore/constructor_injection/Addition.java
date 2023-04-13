package com.springcore.constructor_injection;

public class Addition {
	private int a;
	private int b;

	

	public Addition(double a, double b) {
		this.a = (int)a;
		this.b = (int)b;
		System.out.println("constructor (double, double)");
	}

	public Addition(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("constructor (int, int)");
	}


	public Addition(String a, String b) {
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("constructor (String, String)");
	}

	
	public void printSum() {
		System.out.println("A :"+a+"\tB :"+b);
		System.out.println("Addition of a + b : "+(a+b));
	}
}
