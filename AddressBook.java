import java.util.*;
import java.util.List;
import java.util.Scanner;
public class AddressBook
{
	static final int ADDRESS = 1, CITY = 2, STATE = 3, ZIP = 4, PHONENUMBER = 5;
	public static List<ContactPerson> persons = new ArrayList<>();
	public static ArrayList<String> personCities = new ArrayList<>();
	public static ArrayList<String> personStates = new ArrayList<>();
	static Scanner scan = new Scanner(System.in);
	public void addPerson()
	{

		System.out.println("Enter person details: ");
		System.out.println("\n Enter FirstName : ");
		String firstName = scan.next();
		if(checkPersonExistence(firstName))
		{
			System.out.println("person already exist, Enter different name");

		}
		else
		{
			System.out.println("\n Enter lastName : ");
                	String lastName = scan.next();
			System.out.println("\n Enter Address : ");
                	String address = scan.next();
			System.out.println("\n Enter city : ");
                	String city = scan.next();
			System.out.println("\n Enter state : ");
                	String state = scan.next();
			System.out.println("\n Enter zip : ");
                	long zip = scan.nextLong();
			System.out.println("\n Enter phone number : ");
                	long phoneNumber = scan.nextLong();
			ContactPerson person1 = new ContactPerson(firstName, lastName, address, city, state, zip, phoneNumber);
			persons.add(person1);
			System.out.println("person details added successfully \n");
		}
	}
	public void printPersonDetails()
	{
        	if (persons.isEmpty())
		{
            		System.out.println("There are no contact to print ");
        	}
		else
		{
            		for (ContactPerson contact : persons)
			{
                		System.out.println(contact);
            		}
        	}
    	}

	public void editPersonDetails() 
	{
        	if (persons.isEmpty()) 
		{
        		System.out.println("There are no contacts to edit ");
        	}
		else
		{
        		String address, city, state;
            		long phone, zip;
            		int id;
            		for (ContactPerson contact : persons)
			{
                		System.out.println("ID: #" + persons.indexOf(contact) + " : " + contact);
            		}
            			System.out.println(" Enter ID of contact to Edit : ");
            			id = scan.nextInt();
            			System.out.println(persons.get(id));
            			System.out.println("please select the option to edit...\n \n 1. Address \n 2.city \n 3.state \n 4.zip \n 5.phone number ");
            			int choice = scan.nextInt();
            			switch (choice)
				{
                			case ADDRESS:
                    				System.out.println("Enter Address: ");
                    				address = scan.next();
                    				persons.get(id).setAddress(address);
					break;
					case CITY:
                 	   			System.out.println("Enter City");
                    				city = scan.next();
                    				persons.get(id).setCity(city);
					break;
					case STATE:
                    				System.out.println("Enter State");
                    				state = scan.next();
                    				persons.get(id).setState(state);
					case ZIP:
                    				System.out.println("Enter Zip");
                    				zip = scan.nextLong();
                    				persons.get(id).setzip(zip);
                    			break;
                			case PHONENUMBER:
                    				System.out.println("Enter Mobile number");
                    				phone = scan.nextLong();
                    				persons.get(id).setphoneNumber(phone);
                    			break;
                			default:
                    				System.out.println("Please Enter Valid Option");
                    				editPersonDetails();
            			}
        }
    }

		 public void deletePerson()
		{
        		if (persons.isEmpty())
			{
            			System.out.println("There are no persons to delete in addressbook ");
        		}
			else
			{
        	        	System.out.println("Enter First name to delete the person ");
            			String firstName = scan.next();
            			for (int count = 0; count < persons.size(); count++)
				{
                			if (persons.get(count).getfirstName().equals(firstName))
					{
                    				persons.remove(persons.get(count));
                			}
            			}
        		}
    		}


		public boolean checkPersonExistence(String name)
		{
			int flag = 0;
			for(ContactPerson person : persons)
			{
				if(person.getfirstName().equals(name))
				{
					flag = 1;
					break;
				}
			}
			return flag == 1;
		}
		public void sortByName()
		{
			persons.sort(ContactPerson.firstNameSorting);
			persons.forEach(System.out::println);
		}
		public void sortByCity()
		{
			persons.sort(ContactPerson.citySorting);
			persons.forEach(System.out::println);
		}

		public void viewByCityState()
		{
        		for (ContactPerson person : persons)
		 	{
            			personCities.add(person.getCity());
        		}
        		for (ContactPerson person : persons)
			{
        		 	personStates.add(person.getState());
        		}
        		System.out.print("Cities of a persons : \t ");
        		System.out.println(personCities);

        		System.out.print("States of a persons: \t ");
        		System.out.println(personStates);
    
		}

 		public void searchPerson()
		{
        		int choice;
        		String city, state;
        		System.out.println("\n\t 1.Search persons in cities :" +
                "\n\t 2. Search persons in State ");
        		choice = scan.nextInt();
        		if (choice == 1)
			{
            			System.out.printf("Enter Cities : ");
            			city = scan.next();
            			for (int count = 0; count < persons.size(); count++)
				{
                			if (persons.get(count).getCity().equals(city)) 
					{
                    				System.out.println(count + ". " + persons.get(count).toString());
                			}
            			}
        		}
			else if (choice == 2) 
			{
           			System.out.printf("Enter State : ");
            			state = scan.next();
            			for (int count = 0; count < persons.size(); count++)
				{
                			if (persons.get(count).getState().equals(state))	
					{
                    				System.out.println(count + ". " + persons.get(count).toString());
                			}
            			}
        		}
    		}




	public static void main(String[] args)
	{
		int choice = 0;
		AddressBook contact = new AddressBook(); 
		System.out.println(" WelCome to Address Book Program ");
		while(choice < 9)
		{
			System.out.println("    Menu Details    ");
			System.out.println("\n Enter your choice :: " +
			"\n 1.Add persondetails " +
			"\n 2.print persons details" +
			"\n 3.Edit person details "+
			"\n 4.Delete the person " +
			"\n 5.Sort by firstName" +
			"\n 6.Sort By cityname" +
			"\n 7.sort View By city & state" +
			"\n 8.Search person by city & state" +
			"\n 9.Exit" );
				choice = scan.nextInt();
			switch(choice)
			{
				case 1:
					contact.addPerson();
				break;
				case 2:
					System.out.println("All the person details in the address book :::");
					contact.printPersonDetails();
				break;
				case 3:
					contact.editPersonDetails();
				break;
				case 4:
					contact.deletePerson();
				break;
				case 5:
					contact.sortByName();
				break;
				case 6:
					contact.sortByCity();
				break;
				case 7:
					contact.viewByCityState();
				break;
				case 8:
					contact.searchPerson();
				break;
			}
		}
	}
}
