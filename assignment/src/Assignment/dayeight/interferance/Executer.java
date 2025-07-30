package Assignment.dayeight.interferance;

public class Executer {
public static void main(String[] args) {
	Phone p1 = PhoneFactory.createPhone("Samsung"); 
	p1.call();
	p1.sms();
	
	p1 = PhoneFactory.createPhone("Jio"); 
	p1.call();
	p1.sms();
}	
}

