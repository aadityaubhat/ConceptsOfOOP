package productsAppleStore;

public class Product {
	//Initiate the counter as static and assign 0 
	static private int count = 0;
	protected String name = "";
	protected int cost = 0;
	
	
	/**
	 * Default constructor
	 */
	public Product(){
		Product.incrementCount();
	}
	
	/**
	 * Constructor with cost
	 */
	public Product(int costval, String prodName){
		this.cost = costval;
		this.name = prodName;
	}
	
	/**
	 * Method to increment the product count
	 */
	private static void incrementCount(){
		Product.count++;
	}
	
	
	/**
	 * Method to get the product count
	 */
	public static void getCount(){
		System.out.println(Product.count);
	}
	
	public void temp(){
		System.out.println("Original method from product");
	}
	
	/**
	 * Method to return the product name
	 * @return Product Name
	 */
	public String getProduct(){
		return this.name;
	}
	
	/**
	 * Method to get default cost
	 */
	public void getDefaultCost(){
		System.out.println(this.cost);
		}
	
	public int getCost(){
		return this.cost;
	}
	
}
