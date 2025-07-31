package Assignment.dayeleven.trycatch;

public class TryCatchDemo 
{
	
	public static void main(String[] args)
	{
	System.out.println("I AM IN THE MAIN METHOD");
	int result;
	result=TryCatchExample.performDivision(12, 0);
	if (result!=0)
		System.out.println("Diviosin is "+result);
	
	System.out.println("------------------------------");
	
	result=TryCatchExample.performDivision(12,3);
	if (result!=0)
		System.out.println("Division is "+result);
	
	System.out.println("------------------------------");
	System.out.println(TryCatchExample.performDivision(12f, 5f));
	
	System.out.println("------------------------------");
	System.out.println(TryCatchExample.performDivision(12f, 0f));
	
	
	}

}
