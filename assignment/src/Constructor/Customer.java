package Constructor;

public class Customer {
	
	private String customerName;
	private int customerId;
	private String customerCity;

//	public Customer() {
//		System.out.println("default Customer");
//	}
	
	public Customer()
	{
		this.customerName="Sharan";
		this.customerId=20112004;
		this.customerCity="Pondicherry";
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
