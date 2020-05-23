package com.psksoft.core.collections;

public class ComparableClass implements Comparable<ComparableClass> {

	 Integer rollNo = 1000;
	 String name = "Satish";

	public ComparableClass() {
		System.out.println(this.name+"<-->"+this.rollNo);
	}

	public ComparableClass(Integer rollNo, String name) {
		
		super();
		this.rollNo = rollNo;
		this.name = name;
		
		System.out.println(name+"<--->"+rollNo);
	}

	@Override
	public String toString() {
		return "ComparableClass [rollNo=" + rollNo + ", name=" + name + "]";
	}

	public int compareTo(ComparableClass that) {
		if (this.rollNo < that.rollNo)
			return -1;
		else if (this.rollNo > that.rollNo)
			return 1;
		else
			return 0;

	}

}
