package com.tnsif.interfacedemo;

public interface Animal {
void eat();
}


interface pet{
	void play();
	
}
class Dog implements Animal,pet{
	public void eat() {
		System.out.println("dog eats food");
	}
	public void play() {
		System.out.println("dog plays with ball");
		
	}
}
