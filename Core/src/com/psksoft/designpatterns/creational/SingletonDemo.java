package com.psksoft.designpatterns.creational;

public class SingletonDemo {

	public static void main(String[] args) {
		
		PrinterInHouse printerInHouseObject = PrinterInHouse.getPrinterInHouseObject();
		printerInHouseObject.printing();
		System.out.println("printerInHouseObject:"+printerInHouseObject.hashCode());
		PrinterInHouse printerInHouseObject1 = PrinterInHouse.getPrinterInHouseObject();
		System.out.println("printerInHouseObject1:"+printerInHouseObject1.hashCode());
	}

}
