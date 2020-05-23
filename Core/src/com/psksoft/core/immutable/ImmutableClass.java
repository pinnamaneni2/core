package com.psksoft.core.immutable;

public final class ImmutableClass {
	private final String nameStudent;
	private final Integer rollNo;
	
	public ImmutableClass(String nameStudent, Integer rollNo) {
		super();
		this.nameStudent = nameStudent;
		this.rollNo = rollNo;
		System.out.println("Name:-"+this.nameStudent+"  "+"Roll:-"+this.rollNo);
	}
	
	public String getNameStudent() {
		return nameStudent;
	}

	public Integer getRollNo() {
		return rollNo;
	}


	public static void main(String[] args) {

		ImmutableClass ic = new ImmutableClass("Satish",91);
	}

}
