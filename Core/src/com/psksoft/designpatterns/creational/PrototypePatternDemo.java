package com.psksoft.designpatterns.creational;

public class PrototypePatternDemo {

	public static void main(String[] args) {
		CropCache.loadcache();
		Paddy clonedPaddy = (Paddy) CropCache.getCrop("Paddy");
		Paddy clonedPaddy1 = (Paddy) CropCache.getCrop("Paddy");
		clonedPaddy.cropStatus();
		System.out.println("Crop Type :"+clonedPaddy.getCropType());
	
	System.out.println(clonedPaddy.hashCode()+"---"+clonedPaddy1.hashCode());}

}
