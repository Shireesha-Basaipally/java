package com.tnsif.javatkr;

public class StringmethodsExample {

	public static void main(String[] args) {
		String str1 = "Hello";
        String str2 = "World";
        
        System.out.println("Length of str1: " + str1.length());

        System.out.println("Character at index 1 of str1: " + str1.charAt(1));

        System.out.println("str1 equals str2? " + str1.equals(str2));

        String str3 = str1.concat(" ").concat(str2);
        System.out.println("Concatenated String: " + str3);

        System.out.println("Does str3 contain 'Hello'? " + str3.contains("Hello"));

        System.out.println("str1 to upper case: " + str1.toUpperCase());
        System.out.println("str2 to lower case: " + str2.toLowerCase());

        String replaced = str3.replace("World", "Java");
        System.out.println("After replace: " + replaced);
        
        String[] words = str3.split(" ");
        System.out.println("Split words:");
        for(String word : words) {
            System.out.println(word);
        }

        System.out.println("str3 starts with 'H'? " + str3.startsWith("H"));
        System.out.println("str3 ends with 'd'? " + str3.endsWith("d"));
    }


	}


