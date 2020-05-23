package com.psksoft.core.constructor;

public class ClassWithCons {

private ClassWithCons(){
	System.out.println("default Constrcutor ");
	}

public 	ClassWithCons(String java){
	System.out.println("default Constrcutor- "+java);
	}

	public static void main(String[] args) {
		ClassWithCons testOject = new ClassWithCons();
	}
}
