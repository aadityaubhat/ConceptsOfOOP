package customerAppleStore;

public class Customer {
	private String FirstName = "John";
	private String LastName = "Doe";
	//Using Boolean for Gender, true for Male, false for Female
	private boolean Gender = true;
	
	/**
	 * Default constructor for Customer
	 */
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Constructor for Customer
	 * @param Fname = First name of the customer
	 * @param Lname = Last name of the customer
	 * @param Gen = Gender of the customer; true for Male, false for Female
	 */
	public Customer(String Fname, String Lname, boolean Gen){
		this.FirstName = Fname;
		this.LastName = Lname;
		this.Gender = Gen;
	}
	
	/**
	 * Method to print out the customer information; First Name, Last Name - Gender
	 */
	public void CustomerInfo(){
		if(this.Gender){
			System.out.println(this.LastName+", "+this.FirstName+" - Male");
		}else{
			System.out.println(this.LastName+", "+this.FirstName+" - Female");
		}
	}
	
	
	public String CustomerName(){
		return this.FirstName+" "+this.LastName;
	}

}
