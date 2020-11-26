package com.app.RX_Demo;

import io.reactivex.Observable;

public class ConstructorDemo {
	
	private int id, age, pincode;
	private String name;
	private String city;
	
	public ConstructorDemo() {
		
		System.out.println("calling default constructor");
	}
	
//	public ConstructorDemo(int id) {
//		
//		System.out.println("calling first parameterize and overloaded constructor");
//		this.id = id;
//	}
//	
//	public ConstructorDemo(String name, String city) {
//		
//		System.out.println("calling second parameterize and overloaded constructor");
//		this.name = name;
//		this.city = city;
//	}
//	
//	public ConstructorDemo(int age, int pincode) {
//		
//		System.out.println("calling third parameterize and overloaded constructor");
//		this.age = age;
//		this.pincode = pincode;
//	}
	
	private ConstructorDemo(int id, String name, String city, int age, int pincode) {
		
		this();
		this.id = id;
		this.name = name;
		this.city = city;
		this.age = age;
		this.pincode = pincode;
	}
	
	private void getAllValues() {
		
		Observable<? extends Object> reactive = Observable.just(this.id, this.name, this.age, this.city, this.pincode);
		reactive.subscribe(System.out::println);		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ConstructorDemo obj1 = new ConstructorDemo(1001);
//		obj1.getAllValues();
//		
//		ConstructorDemo obj2 = new ConstructorDemo("tarun", "delhi");
//		obj2.getAllValues();
//		
//		ConstructorDemo obj3 = new ConstructorDemo(32, 110089);
//		obj3.getAllValues();
		
		ConstructorDemo obj = new ConstructorDemo(1001, "tarun", "delhi", 32, 110089);
		obj.getAllValues();
	}

}
