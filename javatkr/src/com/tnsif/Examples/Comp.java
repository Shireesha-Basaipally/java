package com.tnsif.Examples;

public class Comp implements Comparable <Comp>{
	private String Brand;
	private int price;
	private int Ram;
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		this.Brand = Brand;
	}
	public void setprice(int price) {
		this.price = price;
	}
	public void setRam(int Ram) {
		this.Ram = Ram;
	}
	public String toString() {
		return "comp[Brand = "+Brand+",price = "+price+",Ram = "+Ram+"]";
	}
	public Comp(String Brand,int price, int Ram) {
		super();
		this.Brand = Brand;
		this.price = price;
		this.Ram = Ram;
	}

	public int compareTo(Comp o) {
	if(this.price > o.price)
	{
		return 1;
	}else if (this.price < o.price) {
		return -1;
	}
	else {
		return 0;
	}
	}
	
	
	

}



