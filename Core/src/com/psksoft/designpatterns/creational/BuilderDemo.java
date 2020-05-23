package com.psksoft.designpatterns.creational;

public class BuilderDemo {

	public static void main(String[] args) {
		BankAccount ba = new BankAccount.BankAccountBuilder("SIRI", "8347472373", "6822275515").addEamil("no eamil").build();
		System.out.println("account Nmae:"+ba.getName());
	}

}
