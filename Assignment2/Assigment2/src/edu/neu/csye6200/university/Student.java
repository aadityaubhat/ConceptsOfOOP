package edu.neu.csye6200.university;

public class Student extends Person {
	private double gpa;
	/**
	 * Constructor for Student
	 * @param fname Student first name
	 * @param lname Student last name
	 * @param gpa Student GPA
	 */
	public Student(String fname, String lname, double gpa) {
		super(fname, lname);
		this.gpa = gpa;
		// TODO Auto-generated constructor stub
	}
	/**
	 * Student GPA getter
	 * @return Student GPA
	 */
	public double getGpa() {
		return gpa;
	}
	/**
	 * Student GPA setter
	 * @param gpa Student GPA
	 */
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

}
