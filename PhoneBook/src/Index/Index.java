package Index;

import java.util.Scanner;

import Contact.Address;
import Contact.Person;

public class Index {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String[] users = {"Null"};
		
		for (;;) {
			System.out.println("\nPleast select from the menu below: \n1) create new user" +
				"\n2) search user \n3) update user \n4) exit program");
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
				System.out.println("Enter first/last name or number: ");
				String search = input.next();
				for(int i = 0;i < users.length;i++) {  
					if(users[i].contains(search)) {
						System.out.println("\n" + users[i]);
					} 
				}
			}
			if(option == 3) {
				System.out.println("Enter users phonenumber: ");
				String search = input.next();
				for(int i = 0;i < users.length;i++) {  
					if(users[i].contains(search)) {
						System.out.println("\n" + users[i] + "\nSelect an option: \n1) Return to main menu \n2) Update information \n3) Delete entry");
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
		System.out.println("Enter first name: ");
		String firstName = input.nextLine();
		System.out.println("Enter last name: ");
		String lastName = input.nextLine();
		System.out.println("Enter phone number: ");
		String phoneNumber = input.nextLine();
		
		System.out.println("Enter house number and street: ");
		String street = input.nextLine();
		System.out.println("Enter city: ");
		String city = input.nextLine();
		System.out.println("Enter state: ");
		String state = input.nextLine();
		System.out.println("Enter zip code: ");
		String zip = input.nextLine();
		
		Person person = new Person(firstName, lastName, phoneNumber);
		String user = person.getFirst()+" "+person.getLast()+" "+person.getPhone()+"\n";
		
		Address address = new Address(street, city, state, zip);
		String residence = address.getStreet()+" "+address.getCity()+", "+address.getState()+" "+address.getZip();
		
		System.out.println("\nNew user added to phonebook:\n" + user + residence);
		
		return user + residence;	
	}
	
	public static String updateUser(String search) {
		
		
		return null;
	}

}
