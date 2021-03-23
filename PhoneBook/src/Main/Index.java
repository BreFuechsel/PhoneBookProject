package Main;

import java.util.Scanner;
import Contact.Contact;
import PhoneBook.PhoneBook;


public class Index {

	public static void main(String[] args) {
		 
		System.out.println("|     W E L C O M E    T O    M Y    P H O N E B O O K     |\n");
		
		@SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);
		int i=0;
		
		PhoneBook objmain = new PhoneBook();
		
		while(i==0)
		{
			
		System.out.println("M E N U: Select one of the options below\n\n1. New Contact | 2. Delete Contact | 3. Search Contact | 4. Exit");
		int n=Integer.parseInt(userInput.nextLine());
			
		if(n==1){
		//NEW CONTACT
			Contact contact = new Contact();
			System.out.println("New record: ");
			
			System.out.println("Enter first name: ");
			contact.setFirstName(userInput.nextLine());
			
			System.out.println("Enter middle initial: ");
			contact.setMiddleInitial(userInput.nextLine());;
				
			System.out.println("Enter last name: ");
			contact.setLastName(userInput.nextLine());
				
			System.out.println("Enter phone number: ex. xxxxxxxxxx");
			contact.setPhoneNumber(Long.parseLong(userInput.nextLine()));
				
			System.out.println("Enter Street address: ex. 123 Maple Street");
			contact.setStreetAddress(userInput.nextLine());
				
			System.out.println("Enter City: ");
			contact.setCity(userInput.nextLine());
				
			System.out.println("Enter State: ");
			contact.setState(userInput.nextLine());
				
			System.out.println("Enter zip code: ");
			contact.setZipCode(Long.parseLong(userInput.nextLine()));
				
			}
			
			
		if(n==2){
		//DELETE CONTACT
			System.out.println("How would you like to search for the contact to delete? A. First Name | B. Last Name | C. Email | D. Phone Number | E. City | F. State");
				
			@SuppressWarnings("resource")
			Scanner yN = new Scanner(System.in);
			char searchPref = yN.nextLine().charAt(0);
				
				if(searchPref == 'A'){
					System.out.println("Search by first name: ");
				}
				
				if(searchPref == 'a'){
					System.out.println("Search by first name: ");
				}
				
				if(searchPref == 'B'){
					System.out.println("Search by last name: ");
				}
			
				if(searchPref == 'b'){
					System.out.println("Search by last name: ");
				}
					
				if(searchPref == 'C'){
					System.out.println("Search by email address: ");
				}
					
				if(searchPref == 'c'){
					System.out.println("Search by email address: ");
					Scanner emailDelete = new Scanner(System.in);
					String deleteEmail = emailDelete.nextLine();
					System.out.println("Do you want to delete this email address? (Y/N)");
					char ch3 = emailDelete.nextLine().charAt(0);
				
					if(ch3 == 'Y') {
						System.out.println("The contact is successfully deleted.");
					}
					if(ch3 == 'y') {
						System.out.println("The contact is successfully deleted.");
					}
			
					if(ch3 == 'N'){
						System.out.println("Okay");
					}
						
					if(ch3 == 'n'){
						System.out.println("Okay");
					}
				
					else {
						System.out.println("Contact is not found");
					}
				}
					
			if(searchPref == 'D') {
			System.out.println("Search by phone number: ");
			Long deletePhoneNumber = Long.parseLong(yN.nextLine());
			System.out.println("Do you want to remove this contact? (Y/N)");
				char ch = yN.nextLine().charAt(0);
					
				if(ch == 'Y') {
					System.out.println("The contact is successfully deleted.");
				}
				if(ch == 'y') {
					System.out.println("The contact is successfully deleted.");
				}
			
				if(ch == 'N'){
					System.out.println("Okay");
				}
						
				if(ch == 'n'){
					System.out.println("Okay");
				}
				
				else {
					System.out.println("Contact is not found");
				}
					
			if(searchPref == 'd') {
			System.out.println("Search by phone number: ");
			Long deletePhoneNumber1 = Long.parseLong(yN.nextLine());
			System.out.println("Do you want to remove this record? (Y/N)");
				
			char ch1 = yN.nextLine().charAt(0);
						
				if(ch1 == 'Y') {
					System.out.println("The contact is successfully deleted.");
				}
				if(ch1 == 'y') {
					System.out.println("The contact is successfully deleted.");
				}
			
				if(ch1 == 'N'){
					System.out.println("Okay");
				}
						
				if(ch1 == 'n'){
					System.out.println("Okay");
				}
				
				else {
					System.out.println("Contact is not found");
				}
					
			}
			
			
			
			
		if(n==3) {
		//SEARCH CONTACT
			System.out.println("How would you like to search for the contact? A."
					+ "First Name | B. Last Name | C. Email | D. Phone Number | E. City | F. State");
			
		}
			

				
		
		
		
		
		
		if(n==4){
		//EXIT
			
			System.exit(0);;
			}
				
			
			
			
			
			
			
			
		
			
				}		
			}
		}
	}
}
