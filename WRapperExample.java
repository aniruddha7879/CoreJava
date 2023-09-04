package com.tns.wrapperClass;

public class WRapperExample {
	public static void main(String [] args) {
		int a = 20;
		//Converting int a into Integer
		Integer i = a;
		Integer j = Integer.valueOf(a);
		System.out.println(a);
		System.out.println(i);
		System.out.println(j);
	}
}
