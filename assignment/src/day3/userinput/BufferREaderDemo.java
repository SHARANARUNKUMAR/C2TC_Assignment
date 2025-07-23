package day3.userinput;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BufferREaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String name;
		System.out.println("Enter name: ");
		name =br.readLine();
		int id;
		System.out.println("Enter your Id :");
		id = Integer.parseInt(br.readLine());
		
		float marks;
		System.out.println("Enter marks : ");
		marks =Float.parseFloat(br.readLine());
		
		System.out.println("name : "+name+"id : " +id+"marks : "+marks);
		
		

	}

}
