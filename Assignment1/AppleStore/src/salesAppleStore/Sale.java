package salesAppleStore;
import productsAppleStore.*;
import customerAppleStore.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Sale {
	private Customer cust = new Customer();
	private Product prod = new Product();
	private Date saleDate = new Date();
	
	/**
	 * Default constructor
	 */
	public Sale() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Method to create a sale transaction
	 * @param c = Customer involved in the sale
	 * @param p = Product involved in the sale
	 * @param d = Date of the sale
	 */
	public Sale(Customer c, Product p, String d){
		this.cust = c;
		this.prod = p;
		DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			this.saleDate = sdf.parse(d);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void SaleInfo(){
		System.out.println(this.cust.CustomerName()+" bought "+this.prod.getProduct()+" @ "+this.prod.getCost()+"$ "+" on "+this.saleDate.toString());
	}
}
