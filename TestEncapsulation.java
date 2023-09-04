package com.tns.encpsulation;

public class TestEncapsulation {

	public static void main(String[] args) {
		Account acc = new Account();
		acc.setAcc_no(123456789);
		acc.setName("Aniruddha");
		acc.setEmail("Aniruddhalatkar5@gmail.com");
		acc.setAmount(10000.5f);
		
		acc.getAcc_no();
		acc.getName();
		acc.getEmail();
		acc.getAmount();
		
		System.out.println(acc.getAcc_no()+ "\n"+acc.getName()+ "\n" +acc.getEmail()+ "\n" +acc.getAmount());
		

	}

}
