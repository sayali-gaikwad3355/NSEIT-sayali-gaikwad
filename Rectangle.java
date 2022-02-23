package com.example.corejava;

public class Rectangle {
	int ar,length,breadth;
	Rectangle(){
		length=20;
		breadth=10;
	}
	Rectangle(int l,int b){
		length=l;
		breadth=b;	
		
	}
	void calculateArea() {
		ar=length*breadth;
		System.out.println(""+ar);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle(15,15);
		System.out.println("Area of Rectangle with default Constructor is:");
		r1.calculateArea();
		System.out.println("Area of Rectangle with parameterized Constructor is:");
		r2.calculateArea();

	}

}
