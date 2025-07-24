package dayfour;
import java.util.Scanner;
public class PersonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person("sharan",21,"pondicherry");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		sc.nextLine();
		String name=sc.nextLine();
		sc.nextLine();
		String city=sc.nextLine();
		sc.close();
		
		
		p1.setPersonName(name);
		p1.setPersonCity(city);
		p1.setPersonAge(age);
		System.out.println("Person Details Name : " + p1.getPersonName() + "\tAge : " + p1.getPersonAge() + "\tCity : "
				+ p1.getPersonCity());

		System.out.println("Enter Person details : Name, age and city");
		name = sc.nextLine();
		age = sc.nextInt();
		sc.nextLine();
		city = sc.nextLine();
		p1 = new Person(name, age, city); // parameterized constructor invoked);
		System.out.println("Person Details Name : " + p1.getPersonName() + "\tAge : " + p1.getPersonAge() + "\tCity : "
				+ p1.getPersonCity());
		sc.close();

	}

}
