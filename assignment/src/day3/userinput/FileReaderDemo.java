package day3.userinput;

import java.net.URL;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		
		
		URL resourse = FileReaderDemo.class.getResource("MVIT_TNS.txt");
		if(resourse == null) 
		{
			System.out.println("File mnot found");
		}
		
		//converting URl int file oblject
		File f= new File(resourse.getFile());
		
		//oblect creation of the file reader
		FileReader fr =new FileReader(f);
		
		//object creation for buffer reader
		BufferedReader br=new BufferedReader(fr);
		String line=br.readLine();
		System.out.println(line);
		
		while((line =br.readLine()) !=null)
		{
			System.out.println(line);
		}
		
		
		

		
	}

}
