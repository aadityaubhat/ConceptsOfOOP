package assignment3business;

public class Student extends Person {
	private double gpa;
	private int age;
	private String parentFirstName;
	private String parentLastName;
	/**
	 * Constructor for Student
	 * @param fname Student first name
	 * @param lname Student last name
	 * @param gpa Student GPA
	 */
	public Student(String fname, String lname, int age, double gpa, String pfname, String plname) {
		super(fname, lname);
		this.gpa = gpa;
		this.age = age;
		this.parentFirstName = pfname;
		this.parentLastName = plname;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getParentFirstName() {
		return parentFirstName;
	}
	public void setParentFirstName(String parentFirstName) {
		this.parentFirstName = parentFirstName;
	}
	public String getParentLastName() {
		return parentLastName;
	}
	public void setParentLastName(String parentLastName) {
		this.parentLastName = parentLastName;
	}

}
