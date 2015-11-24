package mainAppleStore;
import productsAppleStore.*;
import customerAppleStore.*;
import salesAppleStore.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Iphone6S a = new Iphone6S();
		Iphone6Splus b = new Iphone6Splus(759);
		Iphone6Splus c = new Iphone6Splus();
		Iphone6S d = new Iphone6S(659);
		Iphone6S e = new Iphone6S();
		Iphone6S f = new Iphone6S();
		Iphone6S g = new Iphone6S();
		Iphone6Splus h = new Iphone6Splus();
		Iphone6Splus i = new Iphone6Splus();
		Iphone6Splus j = new Iphone6Splus();
		
		//Checking Customer Class
		
//		System.out.println("Creating sales :-");
//		Customer aa = new Customer();
//		Customer bb = new Customer("Aaditya", "Bhat", true);
//		Customer cc = new Customer("Akshay", "Bhat", true);
//		Customer dd = new Customer("Siddh", "Doshi", true);
//		Customer ee = new Customer("Pallav", "Asija", true);
//		Customer ff = new Customer("Ashwin", "Dhade", true);
//		Customer gg = new Customer("Surabhi", "Soni", false);
//		Customer hh = new Customer("Ramya", "Singh", false);
//		Customer ii = new Customer("Trisha", "Moro", false);
//		Customer jj = new Customer("Rishabh", "Jain", true);
//		
//		String dateString = "2014-02-11";
//		String dateString2 = "2015-03-11";
//		String dateString3 = "2015-03-15";
//		String dateString4 = "2015-05-11";
//		String dateString5 = "2015-04-11";
//		
//		Sale sale = new Sale(aa, a, dateString);
//		Sale sale2 = new Sale(bb, b, dateString);
//		Sale sale3 = new Sale(cc, c, dateString2);
//		Sale sale4 = new Sale(dd, d, dateString2);
//		Sale sale5 = new Sale(ee, e, dateString3);
//		Sale sale6 = new Sale(ff, f, dateString3);
//		Sale sale7 = new Sale(gg, g, dateString4);
//		Sale sale8 = new Sale(hh, h, dateString4);
//		Sale sale9 = new Sale(ii, i, dateString5);
//		Sale sale10 = new Sale(jj, j, dateString5);
//		
//		System.out.println("Printing Sales Information : \n");
//		sale.SaleInfo();
//		sale2.SaleInfo();
//		sale3.SaleInfo();
//		sale4.SaleInfo();
//		sale5.SaleInfo();
//		sale6.SaleInfo();
//		sale7.SaleInfo();
//		sale8.SaleInfo();
//		sale9.SaleInfo();
//		sale10.SaleInfo();
//		
//		System.out.println("\n \nPrinting various counts");
//		System.out.println("Iphone6S plus count :-");
//		Iphone6Splus.getCount();
//		System.out.println("Iphone6S count :-");
//		Iphone6S.getCount();
//		System.out.println("Total count :-");
//		Product.getCount();
		Product A = new Product();
		Product B = new Iphone();
		
		A.temp();
		B.temp();
	}
}
