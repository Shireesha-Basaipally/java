package com.tnsif.javatkr;

public class Wrapperexample {

	public static void main(String[] args) {
		 int i = 10;
	        Integer intObj = i; 

	        float f = 12.5f;
	        Float floatObj = f; 

	        short s = 5;
	        Short shortObj = s; 

	        byte b = 2;
	        Byte byteObj = b; 

	        System.out.println("Integer object: " + intObj);
	        System.out.println("Float object: " + floatObj);
	        System.out.println("Short object: " + shortObj);
	        System.out.println("Byte object: " + byteObj);
	        
	        int intValue = intObj;
	        float floatValue = floatObj;
	        short shortValue = shortObj;
	        byte byteValue = byteObj;
	     
	        System.out.println("\nAfter Unboxing:");
	        System.out.println("int value: " + intValue);
	        System.out.println("float value: " + floatValue);
	        System.out.println("short value: " + shortValue);
	        System.out.println("byte value: " + byteValue);



	}

}
