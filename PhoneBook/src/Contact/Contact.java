package Contact;

public class Contact {
	
	private String firstName;
	private String middleInitial;
	private String lastName;
	private long phoneNumber;
	private String streetAddress;
	private String City;
	private String State;
	private long zipCode;
	
	
 
	public Contact() {
		this.firstName = "First Name";
		this.middleInitial = "Middle Initial";
		this.lastName = "Last Name";
		this.phoneNumber = 1238675309;
		this.streetAddress = "123 Maple Street";
		this.City = "City";
		this.State = "State";
		this.zipCode = 12345;
	}



	@Override
	public String toString() {
		return "Contact [firstName=" + firstName + " middleInitial=" + middleInitial + " lastName=" + lastName + ", phoneNumber=" + phoneNumber
				+ ", streetAddress=" + streetAddress + ", City=" + City + ", State=" + State 
				+ ", zipCode=" + zipCode + "]";
	}




	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getMiddleInitial() {
		return middleInitial;
	}

	public void setMiddleInitial(String middleInitial) {
		this.middleInitial = middleInitial;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public long getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public long getZipCode() {
		return zipCode;
	}

	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
	}


	public Contact(String firstName, String middleInitial, String lastName, long phoneNumber,
			String streetAddress, String city, String state, long zipCode) {
		super();
		this.firstName = firstName;
		this.middleInitial = middleInitial;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.streetAddress = streetAddress;
		this.City = city;
		this.State = state;
		this.zipCode = zipCode;
	}



}