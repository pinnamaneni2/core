package com.psksoft.designpatterns.creational;

public abstract class Crop implements Cloneable {
protected String cropType;

abstract void cropStatus();

public String getCropType() {
	return cropType;
}

public void setCropType(String cropType) {
	this.cropType = cropType;
}

public Object clone() {
	Object clone = null;
	try {
	clone = super.clone();
	}catch (CloneNotSupportedException e) {
		e.getStackTrace();
	}
	return clone ;
}

}
