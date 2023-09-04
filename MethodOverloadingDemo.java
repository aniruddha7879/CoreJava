package com.tns.polymorphism;

public class MethodOverloadingDemo {
	void add() {
		int a = 10, b = 20, c;
		c = a+b;
		System.out.println(c);
	}
	    
	void add(int x, int y) {
		int c = x + y;
		System.out.println(c);
	}
	
	void add(int x, double y) {
		double c = x + y;
		System.out.println(c);
	}



public static void main(String [] args) {
	MethodOverloadingDemo obj = new MethodOverloadingDemo();
	obj.add();
	obj.add(100, 300);
	obj.add(233, 345.78);
	
	
}
}
