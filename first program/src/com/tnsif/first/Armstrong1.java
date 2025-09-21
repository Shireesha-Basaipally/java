package com.tnsif.first;

public class Armstrong1 {

	public static void main(String[] args) {
		System.out.println("Armstrong numbers between 100 and 999:");

	       
        for (int num = 100; num <= 999; num++) {
            int n = num;
            int sum = 0;

            
            int digit1 = n % 10;       
            int digit2 = (n / 10) % 10; 
            int digit3 = n / 100;      

            
            sum = (digit1 * digit1 * digit1)
                + (digit2 * digit2 * digit2)
                + (digit3 * digit3 * digit3);

            
            if (sum == num) {
                System.out.println(num);
            }
        }


	
	}

}
