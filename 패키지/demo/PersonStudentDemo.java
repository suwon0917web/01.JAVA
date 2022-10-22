package demo;

import PA.ABC.Test;

public class PersonStudentDemo {

	public static void main(String[] args) {
		Student s = new Student();
		Person p = s;
		
		((Student)p).whoami();
		
		System.out.println(p instanceof Object);
		System.out.println(p instanceof Person);
		System.out.println(p instanceof Student);
		System.out.println();
		
		Person p2 = new Person();
		System.out.println(p2 instanceof Object);
		System.out.println(p2 instanceof Person);
		System.out.println(p2 instanceof Student);

	}

}
