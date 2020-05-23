package com.psksoft.designpatterns.creational;

import java.util.Hashtable;

public class CropCache {

	private static Hashtable<String,Crop> cropMap = new Hashtable<String,Crop>();
	public static Crop getCrop(String cropType) {
		Crop cachedCrop =cropMap.get(cropType);
		return (Crop)cachedCrop.clone();
		}
	
	//cache loading objects from DB
	public static void loadcache() {
		Paddy paddy = new Paddy();
		paddy.setCropType("Paddy");
		cropMap.put("Paddy", paddy);
		Cotton ct = new Cotton();
		ct.setCropType("Cotton");
		cropMap.put("Cotton", ct);
		Lemon lmn = new Lemon();
		lmn.setCropType("Lemon");
		cropMap.put("Cotton", lmn);	
	}
}
