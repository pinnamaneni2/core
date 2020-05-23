package com.psksoft.core.staticvarmethclass;

public class TestClassStatic {

	int countInstance;
	static int countSatic;
	{
		countInstance=3333000;
		//System.out.println("countSatic"+countInstance);	
	}
	static {
		//countInstance=1000;
		countSatic=2000;
		System.out.println("countSatic"+countSatic);
	}
	public static void main(String[] args) {
		countSatic=5000;
		System.out.println("countSatic"+countSatic);
		TestClassStatic t1= new TestClassStatic();
		TestClassStatic t2= new TestClassStatic();
		TestClassStatic t3= new TestClassStatic();
		t1.countInstance =10;
		t2.countInstance =20;
		t3.countInstance =30;
		/*
//countSatic =10;
//		countSatic =20;
//		countSatic =30;*/
		System.out.println("countInstance"+t1.countInstance);
		System.out.println("countInstance"+t2.countInstance);
		System.out.println("countInstance"+t3.countInstance);
	}

}
