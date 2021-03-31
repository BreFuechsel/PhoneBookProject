package Index;

import java.util.Scanner;

import Contact.Address;
import Contact.Person;

public class Index {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String[] users = {"Null"};
		
		for (;;) {
			System.out.println("\nPleast select from the menu below: \n1) Add New Contact" +
				"\n2) Search Contacts \n3) Update Contact \n4) Exit");
			int option = input.nextInt();
	
			if(option == 1) {
				String[] newArray = new String[users.length + 1];
				for(int i=0; i<users.length;i++) {
					newArray[i] = users[i];
				}
				newArray[newArray.length - 1] = addUser();
				users = newArray;
			}		
			if(option == 2) {
				System.out.println("Enter First/Last Name or Number: ");
				String search = input.next();
				for(int i = 0;i < users.length;i++) {  
					if(users[i].contains(search)) {
						System.out.println("\n" + users[i]);
					} 
				}
			}
			if(option == 3) {
				System.out.println("Enter Phone Number: ");
				String search = input.next();
				for(int i = 0;i < users.length;i++) {  
					if(users[i].contains(search)) {
						System.out.println("\n" + users[i] + "\nSelect an Option: \n1) Return to Main Menu \n2) Update Information \n3) Delete Contact");
						int option3 = input.nextInt();
						if(option3 == 1) {
							break;
						}
						if(option3 == 2) {
							updateUser(users[i]);
						}
						if(option3 == 3) {
							users[i] = "Null";
						}
					} 
				}
				
			}
			if(option == 4) {
				System.out.println("\nProgram Terminated");
				System.exit(0);
			}
		}
	}
	
	
	
	
	public static String addUser() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("\n");
		System.out.println("Enter First Name: ");
		String firstName = input.nextLine();
		System.out.println("Enter Last Name: ");
		String lastName = input.nextLine();
		System.out.println("Enter Phone Number: ");
		String phoneNumber = input.nextLine();
		
		System.out.println("Enter Street Address: ");
		String street = input.nextLine();
		System.out.println("Enter City: ");
		String city = input.nextLine();
		System.out.println("Enter State: ");
		String state = input.nextLine();
		System.out.println("Enter Zip Code: ");
		String zip = input.nextLine();
		
		Person person = new Person(firstName, lastName, phoneNumber);
		String user = person.getFirstName()+" "+person.getLastName()+" "+person.getPhoneNumber()+"\n";
		
		Address address = new Address(street, city, state, zip);
		String residence = address.getStreet()+" "+address.getCity()+", "+address.getState()+" "+address.getZip();
		
		System.out.println("\nNew Contact Added to Phonebook:\n" + user + residence);
		
		return user + residence;	
	}
	
	public static String updateUser(String search) {
		
		
		return null;
	}

}
