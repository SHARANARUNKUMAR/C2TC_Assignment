package dayfive.multilevel_inhertance.employee_program;
import java.util.*;

public class Person {
	private String name;
	private long conatctNo;
	@Override
	public String toString() {
		return "Person [name=" + name + ", conatctNo=" + conatctNo + ", dateOfBirth=" + dateOfBirth + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getConatctNo() {
		return conatctNo;
	}

	public void setConatctNo(long conatctNo) {
		this.conatctNo = conatctNo;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	private Date dateOfBirth;
	
	public Person(String name, long conatctNo, Date dateOfBirth) {
		super();
		this.name = name;
		this.conatctNo = conatctNo;
		this.dateOfBirth = dateOfBirth;
	}

}
