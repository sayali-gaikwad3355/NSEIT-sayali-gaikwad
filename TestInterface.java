package com.example.corejava;
interface  Polygon 
{
	void getArea(int length,int breadth);
	
	}
class RectangleShape implements Polygon
{ 
	public void getArea(int length,int breadth)
	{
	 System.out.println("The area of rectangle is:"+(length*breadth));
	}
	}

public class TestInterface {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RectangleShape r1=new RectangleShape();
		r1.getArea(5, 6);

	}


}
