package Assignment;
import java.util.Scanner;
public class Product {

	String product;
	int price;
	
	void product() 
	{
	
		for(int i=1;i<=4;i++) 
		{
		Scanner sc=new Scanner(System.in);
	product=sc.nextLine();
	price=sc.nextInt();
	
		System.out.println("PRODUCT :"+product);
		System.out.println("PRICE : "+ price);
		}
    }
	}


