package com.tnsif.Excep;

public class ArithmeticExceptionDemo {

	public static void main(String[] args) {
		int a = 4, b = 0;
		try {
			int c = a/b;
			System.out.println(c);
			
		}catch(NullPointerException e)
		{
			System.out.println("Block1");
		}
		catch(ArithmeticException e)
		{
			System.out.println("block2");
		}
	}

	}


