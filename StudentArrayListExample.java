package com.example.corejava;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
class Student1 extends Object
{
	 int rollNo;
     String name;
     String dept;
     public  Student1() {
    	 
     }
     public Student1(int rollNo, String name, String dept) {
    	 super();
    	 this.rollNo =rollNo;
    	 this.name = name;
    	 this.dept = dept; 	 
     }
     @Override
     public String toString() {
    	 return "Student1 [rollNo=" + rollNo + ", name=" + name + ", dept=" + dept + "]";

    	 
     }
     
	}
public class StudentArrayListExample {
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student1> ar = new LinkedList();
		Student1 stud1 = new Student1(01,"Kumar","IT");
		Student1 stud2= new Student1(02,"nilesh","civil");

			ar.add(stud1);
		ar.add(stud2);
		System.out.println(ar);
		Iterator itr = ar.iterator();
		while(itr.hasNext()) {
			Student1 stud = (Student1) itr.next();
			System.out.println(stud.rollNo+" "+stud.name+" "+stud.dept);	
		}

		ar.forEach(System.out::println);

	}

}
