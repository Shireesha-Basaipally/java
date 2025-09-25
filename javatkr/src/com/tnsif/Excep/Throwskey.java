package com.tnsif.Excep;
class sample{
	public void show() throws Exception{
		String s = null;
		throw new NullPointerException("no null values");
	}
}

public class Throwskey {

	public static void main(String[] args)throws Exception {
		sample s1 = new sample();
		s1.show();
		
		
		}

}
