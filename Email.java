package Email;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity=500;
	private String alternateEmail;
	private int defaultPasswordlength=10;
	private String email;
	private String companySuffix="srcompany.com";
	
	//constructor to recieve first name and last name
	
	public Email(String firstName, String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
		//System.out.println("Email created "+ this.firstName+" "+this.lastName+" ");
		// call a method asking for dept return dept
	this.department=setDepartment();
	System.out.println("Department: "+this.department);
	this.password=randomPassword(defaultPasswordlength);
	System.out.println("\nYour password is "+ this.password);
	
	//combine elemnts to generate email
	email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
//	System.out.println("Your Email is "+ email);
	//call a method return random password
	}
	
	
	//ask for the department
	private String setDepartment() {
		System.out.println("New Worker: "+firstName+"\n**Department Codes\n1 for sales\n2 for Development\n3 for Accounting\n0 for non\nEnter Department Code");
		Scanner in= new Scanner(System.in);
		int depChoice=in.nextInt();
		if(depChoice==1) {return "sales";}
		else if(depChoice==2) {return "Development";}
		else if (depChoice==3) {return "Accounting";}
		else {return "";}
		
	}
	
	
	//generate random passsword
	private String randomPassword(int length) {
		String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()";
		char[] password=new char[length];
		for(int i=0;i<length;i++) {
			int rand=(int)(Math.random()* passwordSet.length());
			password[i]=passwordSet.charAt(rand);
			
		}
		return new String (password);
	}
	
	
	
	//set mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity=capacity;
	}
	public void setAlternetEmail(String altEmail)
	{
		this.alternateEmail=altEmail;
	}
	public void changePassword(String password) {
		this.password=password;
	}
	public int getMailboxCapacity(){return mailboxCapacity;}
	public String getAlternateEmail() {return alternateEmail;}
	public String getPassword() {return password;}
	
	public String showInfo() {
		return "Display_Name: "+firstName+" "+lastName +
		
				"\nCompany Email: " + email +
		
				"\nMailbox_Capacity: " + mailboxCapacity + "mb";
		
			   
	}
	//set the alternet email
	
	//change the password
	

}
