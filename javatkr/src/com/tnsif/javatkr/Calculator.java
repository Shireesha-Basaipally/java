package com.tnsif.javatkr;
abstract class Shape {
    double area;

    
    abstract void calArea();

    
    void show() {
        System.out.println("Area = " + area);
    }
}


class Square extends Shape {
    double side;

    
    Square(double side) {
        this.side = side;
    }

    
    void calArea() {
        area = side * side;
    }
}

class Rectangle extends Shape {
    double length, breadth;

  
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

   
    void calArea() {
        area = length * breadth;
    }
}



public class Calculator {

	public static void main(String[] args) {
		 Square sq = new Square(5);
	        sq.calArea();
	        sq.show();

	       
	        Rectangle rec = new Rectangle(4, 6);
	        rec.calArea();
	        rec.show();
	    }

		
		
	}


