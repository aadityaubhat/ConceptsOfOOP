package main;
import java.util.Vector;

import edu.neu.csye6200.university.*;
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instantiating Teachers
		Teacher t1 = new Teacher("Dan", "Peters", 10);
		Teacher t2 = new Teacher("Chai", "Mutsalklisana", 10);
		Teacher t3 = new Teacher("Simon", "Dao", 10);
		
		//Instantiating Students
		Student s1 = new Student("Aaditya", "Bhat", 3.92);
		Student s2 = new Student("Siddh", "Doshi", 3.96);
		Student s3 = new Student("Surabhi", "Soni", 4.00);
		Student s4 = new Student("Ramya", "Singh", 3.96);
		Student s5 = new Student("Trisha", "Moro", 4.00);
		
		//Teacher Vector
		Vector<Teacher> teacherVector = new Vector<Teacher>();
		teacherVector.addElement(t1);
		teacherVector.addElement(t2);
		
		//Student Vector
		Vector<Student> studentVector = new Vector<Student>();
		studentVector.addElement(s1);
		studentVector.addElement(s2);
		studentVector.addElement(s3);
		studentVector.addElement(s4);
		studentVector.addElement(s5);
		
		//Instantiating Course
		Course java = new Course("Java", teacherVector, studentVector);
		Course dbms = new Course("DBMS", teacherVector, studentVector);
		
		//Instantiating ClassRoom
		ClassRoom snell320 = new ClassRoom(20, teacherVector, studentVector);
		ClassRoom forsyth210 = new ClassRoom(5, teacherVector, studentVector);
		
		//Printing output
		System.out.println("Snell320 has a capacity of "+snell320.getCapacity()+"\nTeacher list:\n");
		snell320.getTeachers();
		System.out.println("\nStudent list");
		snell320.getStudents();
		System.out.println("");
		snell320.isOverCrowded();
		
		System.out.println("\n\nCourse name - "+java.getName()+"\nTeacher List:");
		java.getTeachers();
		System.out.println("\nStudent List:");
		java.getStudents();
		
		System.out.println("\n\nChecking if Forsyth 210 is overcrowded\n");
		forsyth210.isOverCrowded();
	}

}
