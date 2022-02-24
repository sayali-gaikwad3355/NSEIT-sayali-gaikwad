package com.example.corejava;
import java.util.function.Consumer;
public class ConsumerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Employee> con = e->{
			System.out.println("Name: "+e.name);
			System.out.println("Desgination: "+e.desg);
			System.out.println("Salary: "+e.salary);

		};
		Employee emp1 = new Employee("sneha","Manager", 10000);
		Employee emp2 = new Employee("Rohan","Clerk", 35000);
		con.accept(emp1);
		con.accept(emp2);


	}

}
