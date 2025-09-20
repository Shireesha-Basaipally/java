package com.tnsif.javatkr;

class Sample1 {
	Sample1(int a){
		System.out.println("this is constructor1");
		
	}

 public void show()
 {
	 System.out.println("this is method1");
	 
 }
}

public class parameterizedconstructor {

	public static void main(String[] args) {
		Sample1 obj = new Sample1(10);
		obj.show();
		

	}

}
