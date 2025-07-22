package Assignment;
import java.util.Scanner;
public class Student {
	
	void stud()
	{
		int id;
		String name,dept;
		int year;
		for(int i=1;i<=3;i++)
		{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id Number :");
		id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Student Name : ");
		name=sc.nextLine();
		System.out.println("Enter the department :");
		dept=sc.nextLine();
		System.out.println("Enter the year :");
		year=sc.nextInt();
		
		//EXECUTION STATEMENT
		
			System.out.println("NAME OF STUDENT : "+name);
			System.out.println("ID NUMBER : "+id);
			System.out.println("DEPATMENT : "+ dept);
			System.out.println("YEAR : "+year); 
		}
		
		
		
		
		
	}
	
}
