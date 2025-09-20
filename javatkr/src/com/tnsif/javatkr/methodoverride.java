package com.tnsif.javatkr;

public class methodoverride {
	public void show() {
		System.out.println("this is parent class");
		
	}

}
class child extends methodoverride{
	public void show() {
		System.out.println("this is child class");
		
	}
}