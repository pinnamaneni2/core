package com.psksoft.designpatterns.creational;

public class PrinterInHouse {
private static PrinterInHouse pt = new PrinterInHouse(); 
	private PrinterInHouse(){	
	}
	
	@SuppressWarnings("unused")
	public static PrinterInHouse getPrinterInHouseObject(){
		if (pt == null) {
			pt = new PrinterInHouse();
			return  pt;
		}
		return pt;
	}
	
	protected void printing() {
	System.out.println("printing");
	}
}
