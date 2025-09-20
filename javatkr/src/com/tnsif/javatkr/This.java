package com.tnsif.javatkr;
class key{
	int a=50;
}
class keys extends key{
	int a=10;
	public void show()
{
	 int a=20;
     System.out.println("a");
	 System.out.println("This.a");
	 System.out.println("Super.a");
	 }
}

public class This {

	public static void main(String[] args) {
		keys obj=new keys();
		obj.show();
		
	}

}
