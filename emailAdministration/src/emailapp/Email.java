package emailapp;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String alternateEmail;
	private int defaultPasswordLength;
	private int mailboxCapacity;
	
	// Constructor to receive the first name and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email created: " + this.firstName + " "+ this.lastName);
		
		this.department = setDepartment();
		System.out.println("Department: "+ this.department);
		
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("your password is");
	}
	
	// Ask for department
	private String setDepartment(){
		System.out.println("Departmet code\n1 for Sales \n2 for Development\n3 for Accounting\n0 for none \nEnter department code);
		Scanne input = new Scanner(System.in);
		int depChoice = input.nextInt();
		else if(depChoice == 1) {return "SALES";}
		else if(depChoice == 2) {return "dev";}
		else if(depChoice == 1) {return "acct";}
		else(depChoice == 1) {return "";}
	}
	// Generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$%^&*";
		char[] password = new char[length];
		for(int i=0;i<length, i++) {
			int random = (int) (Math.random() * passwordSet.length());
		}
		return new String(password);
	}
	// Set the mailbox capacity 
	
	//Change the password
}
