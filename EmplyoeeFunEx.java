package com.example.corejava;
import java.util.Scanner;
import java.util.function.Function;
class Employee
{
	String name;
	String desg;
	int salary;
	public Employee(String name, String desg, int salary)
	{
		super();
		this.name = name;
		this.desg = desg;
		this.salary = salary ;
		
	}
	public void printEmpInfo()
	{
		System.out.println("Name: "+name+" Desg: "+desg+" Salary: "+salary);
	}
	}

public class EmplyoeeFunEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Function<Employee,Employee> f = emp->{
			
			if( emp.desg.equals("manager"))
				emp.salary=emp.salary+1000;
				else if(emp.desg.equals("clerk"))
				emp.salary=emp.salary+500;
				return emp;

		};
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("Enter designation");
		String desg = sc.next();
		System.out.println("Enter salary...");
		int sal= sc.nextInt();
		Employee temp = new Employee(name,desg,sal);
		temp.printEmpInfo();
		Employee e = f.apply(temp);
		System.out.println("After update...");
		e.printEmpInfo();

	}

}
