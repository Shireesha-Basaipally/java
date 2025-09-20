package com.tnsif.interfacedemo;

public interface Phone {
	void call();
	void msg();

}
class jio implements Phone{
	public void call() {
	System.out.println("This is jio call");
	
}
	public void msg()
{
		System.out.println("This is jio msg");
		}
}
class Samsung implements Phone {
	public void call() {
		System.out.println("This is samsung call");
		
	}
	public void msg()
	{
			System.out.println("This is samsung msg");
			}
	
}


