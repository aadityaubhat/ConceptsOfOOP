package assignment3business;

public class Teacher extends Person {
	private int credits;
	/**
	 * Constructor for Teacher
	 * @param fname First name of the teacher
	 * @param lname Last name of the teacher
	 * @param credits Teacher Credits
	 */
	public Teacher(String fname, String lname, int credits) {
		super(fname, lname);
		// TODO Auto-generated constructor stub
		this.credits = credits;
	}
	/**
	 * Teacher credits getter
	 * @return Teacher credits
	 */
	public int getCredits() {
		return credits;
	}
	
	/**
	 * Teacher credits setter
	 * @param credits Teacher credits
	 */
	public void setCredits(int credits) {
		this.credits = credits;
	}

}
