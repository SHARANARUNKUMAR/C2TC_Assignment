package EntityClassAssignment;

public class Customer {
	
	public Customer() {
		this.cid=200;
		this.cname="Unknown";
		this.city="puducherry";
	}

	private int cid;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	private String cname;
	private String city;
	@Override
	public String toString() 
	{
		return "entity [cid=" + cid + ", cname=" + cname + ", city=" + city + "]";
	}


}
