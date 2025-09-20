package com.tnsif.interfacedemo;

public interface infodemo {
	int a = 10;
	void display();
	
}
class Imple implements infodemo {
	public void display(){
		System.out.println("this is interface");
		
	}
	
}
