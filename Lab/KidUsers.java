package My;

import java.util.Scanner;

public class KidUsers  implements LibraryUser{

	
	int age;
	String bookType;
	String Kids;
	
	public void registerAccount() {
		
		 Scanner sc = new Scanner(System.in);//Taking user input
		 System.out.println("Enter Age");
		 age=sc.nextInt();
		// TODO Auto-generated method stub
		if(age<12) {//if statement
			
			System.out.println("You have successfully registered under a Kids Account");
		}
		else
		{//else statement
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
		}
		
		
		
	}
	
	
	public void requestBook() {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter BookType");
		 bookType=sc.next();
		if(bookType.equals("Kids")) {
			System.out.println("Book Issued successfully, please return the book within 10 days");
		}
		else
		{
			System.out.println("Oops, you are allowed to take only kids books");
		}
	}

	
	
	
}
