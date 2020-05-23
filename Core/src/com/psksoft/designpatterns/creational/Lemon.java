package com.psksoft.designpatterns.creational;

public class Lemon extends Crop {
	public Lemon() {
		cropType= "Lemon";
	}
	
	void cropStatus() {
		System.out.println("crop is doing so great");	
	}

}
