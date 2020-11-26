package com.app.RX_Demo;

class MySingleton {
	
	
}

public class PrivateConstructor {
	
	public static PrivateConstructor instance = null;
	
	private int length, height, width;
	
	private PrivateConstructor() {
		
		System.out.println("calling private constructor");
		this.length = 10;
		this.height = 20;
		this.width = 40;
	}
	
	private static PrivateConstructor getInstance() {
		
		if(instance == null) {
			
			instance = new PrivateConstructor();
		}
		return instance;
	}
	
	private void getArea() {
		System.out.println("area of triangle is => "+ (length * height * width));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrivateConstructor getObj = PrivateConstructor.getInstance();
		getObj.getArea();

	}

}
