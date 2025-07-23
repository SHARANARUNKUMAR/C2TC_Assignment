package Assignment.day2;
import java.util.Scanner;
public class Student {
	
	
		private int id;
		private String name,dept;
		private int year;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDept() {
			return dept;
		}
		public void setDept(String dept) {
			this.dept = dept;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", dept=" + dept + ", year=" + year + "]";
		}
		
		
}