package org.student;

import org.department.Department;

public class Student extends Department{

	
	public void studentName() {
		
		System.out.println("The studentName is Sre Yamini");

	}
	public void studentDept() {
		
		System.out.println("The studentDept is CSE");

	}
	public void studentId() {
		
		System.out.println("The studentId is 96");

	}
	public static void main(String[] args) {
		
		Student stu = new Student();
		
		stu.collegeName();
		stu.collegeCode();
		stu.collegeRank();
		
		stu.deptName();
		
		stu.studentName();
		stu.studentId();
		stu.studentDept();

	}

}
