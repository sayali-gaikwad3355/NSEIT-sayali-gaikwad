package com.example.corejava;
import java.util.Scanner;
import java.util.function.Function;
class Student
{
	String name;
	double marks;
	public Student(String name,double marks)
	{
		super();
		this.name=name;
		this.marks=marks;
	}
	public void studentInfo()
	{
		System.out.println("Name:"+name+"Marks:"+marks);
	}
	}

public class StudentFunEx {

	public static String result1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Function<Student,Student>f=stud->{
			if(stud.marks>=80)
			{
			result1="Distinction";
			}
			else if(stud.marks>80 && stud.marks<=60)
			{
				result1="First class";
			}
			else if(stud.marks>60 &&stud.marks<=50)
			{
				result1="Second class";
			}
			else if(stud.marks<50)
			{
				result1="Fail";
			}
			return stud;
		};
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("Enter Marks");
		double marks=sc.nextDouble();
		Student s=new Student(name,marks);
		Student result1= f.apply(s);
		System.out.println("The Result is : "+result1);
		s.studentInfo();




	}

}