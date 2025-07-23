package Assignment.day2;
import java.util.*;
public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		Product pr=new Product();
		pr.setProductName("HAMAM SOAP");
		pr.setPrice(25);
		pr.setQuantity("50gram");
		
		//getter 
	String a=	pr.getProductName();
		String b=pr.getQuantity();
		int c=pr.getPrice();
		System.out.println("Product Name : "+a);
		System.out.println("Product Price : "+b);
		System.out.println("Product Quantity : "+c);
		
		System.out.println(pr);

	}

}
