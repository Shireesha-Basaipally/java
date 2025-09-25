package com.tnsif.Excep;

public class Excep1 {

	public static void main(String[] args) {
		try {
			String s = null;
			System.out.println(s.length());
			
		}catch(NullPointerException e)
		{
			System.out.println("the Null values cannot be read");
		}
	}

}
