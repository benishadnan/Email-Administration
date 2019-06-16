package emailapp;

public class EmailApp {

public static void main(String[] args) {
		
		Email email1 = new Email("John", "SnoW");
		 //email1.setAlternateEmail("js@gmail.com");
		 //System.out.println("Alternate email is " + email1.getAlternateEmail());
		
		System.out.println(email1.showInformation());
	}
}
