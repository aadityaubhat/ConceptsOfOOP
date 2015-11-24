package productsAppleStore;

public class Iphone6S extends Iphone {
	//Initializing the data
	//Initializing the count as static and private
	private static int count = 0;
	static int defaultCost = 649;
	private int cost = 649;
	/**
	 * Default Constructor
	 */
	public Iphone6S() {
		//using the default cost for Iphone6S as $
		super(defaultCost, "Iphone6S");
		Iphone6S.incrementCount();
	}
	
	/**
	 * Constructor with cost
	 */
	public Iphone6S(int costval){
		super(costval, "Iphone6S");
		this.cost = costval;
		Iphone6S.incrementCount();
	}
	
	/**
	 * Method to increment the Iphone6S count
	 */
	private static void incrementCount(){
		Iphone6S.count++;
	}

	/**
	 * Method to set the Iphone6S cost
	 */
	public static void setCost(int costval){
		Iphone6S.defaultCost = costval;
	}

	/**
	 * Method to get the Iphone6S count
	 */
	public static void getCount(){
		System.out.println(Iphone6S.count);
	}
	
	/**
	 * Method to return the cost of Iphone 6S object
	 * @return
	 */
	public int getCost(){
		return this.cost;
	}
}
