package com.example.corejava;

import java.util.Scanner;

public class PrimeExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n,i=2,j=2;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter number");
       try {
    	   n=sc.nextInt();
    	   if(n>0)
    	   {
    		   System.out.println("Prime numbers are:");
    		   prime(n);
    		   System.out.println(" ");
    	   }
    	   else
    	   {
    		   System.out.println("please enter only positive integer");
    	   }
       }catch(Exception e)
       {
    	   System.out.println(e);
    	   System.out.println("pleas enter only integer");
       }
	}
	static void prime(int a)
	{
		int i=2,j=2;
		while(a>i)
		{
			while(true)
			{
				if(i%2==0)
				{
					break;
				}
				if(i%j==0)
				{
					break;
				}
				else
				{
					j++;
				}
			}
			if(j==i)
			{
				System.out.println(""+i);
				j=2;
			}
			i++;
		}
	}

}
