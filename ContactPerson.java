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
	public String getfirstName()
	{
        	return firstName;
    	}
	public void setfirstName(String firstName) 
	{
        	this.firstName = firstName;
    	}
    	public String getlastName() 
	{
        	return lastName;
    	}
	public void setlastName(String lastName) 
	{
        	this.lastName = lastName;
    	}
    	public String getAddress() 
	{
        	return address;
    	}

    	public void setAddress(String address) 
	{
        	this.address = address;
    	}

    	public String getCity() 
	{
        	return city;
    	}

    	public void setCity(String city) 
	{
        	this.city = city;
    	}

    	public String getState() 
	{
        	return state;
    	}

    	public void setState(String state) 
	{
        	this.state = state;
    	}

    	public long getzip() 
	{
        	return zip;
    	}

    	public void setzip(long zip) {
        	this.zip = zip;
    	}
	public long getphoneNumber() 
	{
        	return phoneNumber;
    	}
 	 public void setphoneNumber(long phoneNumber) 
	{
        	this.phoneNumber = phoneNumber;
    	}
	public String toString() {
        return "-------------------------" + "\n Name: " + firstName + " " + lastName + "\n Address: " + address + "\n City: " + city + "\n State: " + state +  " \n pin code " + zip +"\n Phonenumber: " + phoneNumber + " \n ------------------------------ ";
    }
}

