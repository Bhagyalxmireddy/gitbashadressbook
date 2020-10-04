public class ContactPerson
{
	private String firstName;
    	private String lastName;
    	private String address;
    	private String city;
    	private String state;
    	private long phoneNumber;
    	private long zip;

	public ContactPerson(String firstName, String lastName, String address, String city, String state, long phoneNumber, long zip )
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.phoneNumber = phoneNumber;
		this.zip = zip;
	}
}

