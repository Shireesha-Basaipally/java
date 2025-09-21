package com.tnsif.first;

public class primenumbers1 {

	public static void main(String[] args) {
		System.out.println("Prime numbers from 1 to 100:");

        for (int num = 2; num <= 100; num++) {
            int i;
            for (i = 2; i < num; i++) {
                if (num % i == 0) {
                    break;
                }
            }
            if (i == num) { 
                System.out.print(num + " ");
            }
        }

	}

}
