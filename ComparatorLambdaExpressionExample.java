package com.example.corejava;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Employee2{
	int id;
	String name;
	double salary;
	public Employee2(int id,String name,double salary) {
		super();
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
}
public class ComparatorLambdaExpressionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee2>list=new ArrayList<Employee2>();
		list.add( new Employee2(115,"Aditya",25000));
		list.add( new Employee2(125,"Jai",30000));
		list.add( new Employee2(135,"Chaitanya",40000));
		System.out.println("Sorting the employee list based on the name ");
		Collections.sort(list,(p1,p2)->{
			return p1.name.compareTo(p2.name);
		});
		for(Employee2 e:list) {
		  System.out.println(e.id+" "+e.name+" "+e.salary);	
		}
	}
}
