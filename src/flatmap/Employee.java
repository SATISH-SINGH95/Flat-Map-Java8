package flatmap;

import java.util.List;

public class Employee {
	
	private String name;
	private List<Integer> phoneNumbers;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Integer> getPhoneNumbers() {
		return phoneNumbers;
	}
	public void setPhoneNumbers(List<Integer> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	public Employee(String name, List<Integer> phoneNumbers) {
		super();
		this.name = name;
		this.phoneNumbers = phoneNumbers;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", phoneNumbers=" + phoneNumbers + "]";
	}
	
	

}
