package com.tnsif.javatkr;

class Sample {
	Sample(){
		System.out.println("this is constructor");
		
	}

 public void show()
 {
	 System.out.println("this is method");
	 
 }
}


public class Defaultconstructor {

	public static void main(String[] args) {
		Sample obj = new Sample();
		obj.show();
		
	}

}
