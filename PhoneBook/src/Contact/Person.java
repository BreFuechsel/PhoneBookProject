package Contact;

public class Person {
	
	private String firstName;
	private String lastName;
	private String phoneNumber;
	
	public Person(String first, String last, String phone) {
		this.firstName = first;
		this.lastName = last;
		this.phoneNumber = phone;
	}

	public String getFirst() {
		return firstName;
	}

	public String getLast() {
		return lastName;
	}

	public String getPhone() {
		return phoneNumber;
	}

	public void setFirst(String firstName) {
		this.firstName = firstName;
	}

	public void setLast(String lastName) {
		this.lastName = lastName;
	}

	public void setPhone(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
