package com.tnsif.arrayDemo;

public class JaggedDemo {

	public static void main(String[] args) {
		int[][] nums = {{1,2,3},{4,5},{6},{7,8,9,0}};
		
		for(int[] x:nums)
		{
			for(int y:x)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}
	}

}
