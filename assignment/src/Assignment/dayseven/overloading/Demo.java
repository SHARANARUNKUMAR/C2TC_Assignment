package Assignment.dayseven.overloading;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//CONSTRUCTOR OVERLOADING
		
		
		
		Point p=new Point();
		System.out.println(p);
		
		Point p1=new Point(0.023f);
		System.out.println(p1);
		
		Point p2=new Point(0.234f,0.1234f);
		System.out.println(p2);
		
		
		System.out.println("------------------------ Method Overloading -----------------------");
		System.out.println("Addition of two integers : " + MethodOverloading.addition(10, 20));
		System.out.println("Addition of two floating numbers :" + MethodOverloading.addition(10.0f, 20.f));
		System.out.println("Addition of one integer and one float :" + MethodOverloading.addition(10, 20.0f));
		System.out.println("Addition of one float and one integer :" + MethodOverloading.addition(10.0f, 20));
		System.out.println("Addition of two Strings : " + MethodOverloading.addition("Hello ", "World"));
	}

}
