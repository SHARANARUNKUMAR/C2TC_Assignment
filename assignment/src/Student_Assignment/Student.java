package Student_Assignment;

public class Student
{
	private int serialNo;
	private int age;
	private String name;
	public int getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [serialNo=" + serialNo + ", age=" + age + ", name=" + name + "]";
	}
	
	
	
	

}
