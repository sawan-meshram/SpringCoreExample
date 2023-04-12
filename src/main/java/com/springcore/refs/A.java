package com.springcore.refs;

public class A {
	private int x;
	private B b;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public B getB() {
		return b;
	}
	public void setB(B b) {
		this.b = b;
	}
	private A() {
		super();
		// TODO Auto-generated constructor stub
	}
	private A(int x, B b) {
		super();
		this.x = x;
		this.b = b;
	}
	@Override
	public String toString() {
		return "A [x=" + x + ", b=" + b + "]";
	}
	
}
