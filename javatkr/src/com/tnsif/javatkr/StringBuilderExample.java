package com.tnsif.javatkr;

public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");

        sb.append(" World");
        System.out.println("After append: " + sb);
        
        char ch = sb.charAt(1);
        System.out.println("Character at index 1: " + ch);

        sb.delete(5, 11);  
        System.out.println("After delete: " + sb);
        
        System.out.println("Length of sb: " + sb.length());
        
        sb.reverse();
        System.out.println("After reverse: " + sb);
        
        sb.reverse();  
        String sub = sb.substring(0, 4);  
        System.out.println("Substring(0,4): " + sub);
    }



	}


