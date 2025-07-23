package encapsulation;

public class StudentDemo {

	public static void main(String[] args) {
		Student st=new Student();
		st.setSerialNo(1);
		st.setName("Sharan");
		st.setAge(18);
		
		
		System.out.println(st.getAge());
		System.out.println(st.getSerialNo());
		System.out.println(st.getName());
		
	}

}
