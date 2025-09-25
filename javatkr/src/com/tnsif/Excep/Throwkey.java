package com.tnsif.Excep;

public class Throwkey {

	public static void main(String[] args) throws Exception {
		int age = 4;
		if(age<18) throw new Exception("not eligible");
		else
			System.out.println("Eligible");
	}

}
