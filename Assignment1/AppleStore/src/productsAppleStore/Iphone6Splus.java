package productsAppleStore;

public class Iphone6Splus extends Iphone {
	//Initializing the data
		//Initializing the count as static and private
		private static int count = 0;
		private static int defaultCost = 749;
		private int cost = defaultCost;
	
	/**
	 * Default Constructor
	 */
	public Iphone6Splus() {
	//using the default cost for Iphone6S as $
		super(defaultCost, "Iphone6S Plus");
		Iphone6Splus.incrementCount();
	}
	
	/**
	 * Constructor with cost
	 */
	public Iphone6Splus(int costval){
		super(costval, "Iphone6S Plus");
		this.cost = costval;
		Iphone6Splus.incrementCount();
	}
	
	/**
	 * Method to increment the Iphone6S count
	 */
	private static void incrementCount(){
		Iphone6Splus.count++;
	}
	
	/**
	 * Method to print Iphone 6S Plus count
	 */
	public static void getCount(){
		System.out.println(Iphone6Splus.count);
	}
	
	/**
	 * Method to change the default cost 
	 */
	public static void setCost(int costval){
		Iphone6Splus.defaultCost = costval;
	}

	/**
	 * Method to return cost of the Iphone 6S Plus Object
	 * @return cost of the Iphone6S Plus object
	 */
	public int getCost(){
		return this.cost;
	}
}
