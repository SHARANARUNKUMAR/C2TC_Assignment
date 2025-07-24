package dayfour.firstpackage;

public class Base
{
	
	int varDefault=10;
	public int varPublic=20;
	private int varPrivate=30;
	protected int varProtected=40;
	
	
	
	void methodDefault() {
		System.out.println("Default access base class");
		System.out.println("Default variable :" +varDefault);
	}
	
	void methodPublic() {
		System.out.println("Public access base class");
		System.out.println("public variable :"+varPublic);
		
	}
	void methodPrivate() {
		System.out.println("Private access base class");
		System.out.println("Private variable : "+varPrivate);
		
	}
	
	void methodProtected() {
		System.out.println("Protected access base class");
		System.out.println("Protected variable :" +varProtected);
	}
	
	
	
	
	
	

}
