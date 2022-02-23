package com.example.corejava;

interface Addition
{
	int add(int a,int b);
	}


public class LambdaExpressionEx {

			public static void main(String[] args) {
			// TODO Auto-generated method stub
			//lambda expression without return
	     Addition ad1=(a,b)->(a+b);
	     System.out.println(ad1.add(10, 20));
	     //lambda expression with return
	     Addition ad2=(int a,int b)->{
	    	 return(a+b);
	     };
	     System.out.println(ad2.add(100, 200));
	     
		}
		
	}


