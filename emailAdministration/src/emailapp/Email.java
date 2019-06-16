package emailapp;


public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private String alternateEmail;
	private String companySuffix = "xyzcompany.com";
	private int defaultPasswordLength = 10;
	private int mailboxCapacity = 500;
	
	// Constructor to receive the first name and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		this.department = setDepartment();
		
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("your password is "+ this.password);
		
		//Combine elements to generate password
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "."+ companySuffix;
	}
	
	// Ask for department
	private String setDepartment(){
		System.out.println("New worker: " + firstName + " .Departmet code\n1 for Sales \n2 for Development\n3 for Accounting\n0 for none \nEnter department code: ");
		Scanner input = new Scanner(System.in);
		int depChoice = input.nextInt();
		if(depChoice == 1) {return "SALES";}
		else if(depChoice == 2) {return "dev";}
		else if(depChoice == 1) {return "acct";}
		else {return "";}
	}
	// Generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$%^&*";
		char[] password = new char[length];
		for(int i=0; i<length; i++) {
			int random = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(random);
		}
		return new String(password);
	}
	
	// Set the mailbox capacity
	public void setMailBoxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	// Set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	//Change the password
	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getMailBoxCapacity() {return mailboxCapacity; }
	public String getAlternateEmail() {return alternateEmail; }
	public String getPassword() {return password; }
	
	//show all information related to employee, email and mail box capacity
	public String showInformation() {
		return "DISPLAY NAME: " + firstName + " " + lastName + 
				"\nCOMPANY EMAIL: " + email +
				"\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
	}
	
}
