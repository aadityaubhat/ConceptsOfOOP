package edu.neu.csye6200.university;

public class Person {
	protected String first_name;
	protected String last_name;
	/**
	 * Person constructor	
	 * @param fname First Name of the person
	 * @param lname Last Name of the person
	 */
	public Person(String fname, String lname) {
		this.first_name = fname;
		this.last_name = lname;
		// TODO Auto-generated constructor stub
	}
	/**
	 * Person First Name Getter
	 * @return First Name
	 */
	public String getFirst_name() {
		return first_name;
	}
	/**
	 * Person First Name setter
	 * @param first_name First name of the person
	 */
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	/**
	 * Person Last Name Getter
	 * @return Last Name
	 */
	public String getLast_name() {
		return last_name;
	}
	/**
	 * Person Last Name Setter
	 * @param last_name : Person Last Name
	 */
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

}
