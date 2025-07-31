package Assignment.dayeleven.trycatch;

public class TryCatchExample {
	
	static int performDivision(int x,int y)
	{
		System.out.println("I AM IN METHOD");
		int z=0;
		 try {
			 System.out.println("i am the try block");
		 }
		 catch(ArithmeticException e)
		 {
			 System.out.println("i am the catch block " +e.getMessage());
		 }
		 
		 return z;
	}
		 
		static  float performDivision(float a, float b)
			{
				return a/b;
			}
		


}
