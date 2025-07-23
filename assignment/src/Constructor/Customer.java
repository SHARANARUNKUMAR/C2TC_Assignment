package Constructor;

public class Customer {
	
	private String customerName;
	private int customerId;
	private String customerCity;
//parameterize constructor


	
	public Customer()
	{
		System.out.println("default constructor");
	}
public Customer(int customerId,String customerName)
{
		System.out.println("2parameter");
		this.customerId=customerId;
		this.customerName=customerName;
}
	//parameterized constructor
public Customer(int customerId,String customerName,String customerCity) {
	this(103,"Sharan"); //invoke or call the default constructor
	this.customerId=customerId;
	this.customerName=customerName;
	this.customerCity=customerCity;
	
}
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerId=" + customerId + ", customerCity="
				+ customerCity + "]";
	}


	public void setcustomerName(String customerName) 
	{
		this.customerName=customerName;
	}
   public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerCity() {
		return customerCity;
	}
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
   public String getcustomerName()
   {
	   return customerName;
   }
}
