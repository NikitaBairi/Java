package My;

import java.util.Scanner;

public class AdultUser implements LibraryUser{

	int age;
	String bookType;
	String Fiction;
	public void registerAccount() {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Age");
		 age=sc.nextInt();
		
		// TODO Auto-generated method stub
		if(age>12) {
			
			System.out.println("You have successfully registered under Adult Account");
		}
		else
		{
			System.out.println("Sorry, Age must be greater than 12 to register as a audlt");
		}
		
	}

	public void requestBook() {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter BookType");
		 bookType=sc.next();
		if(bookType.equals("Fiction")) {
			System.out.println("Book Issued successfully, please return the book within 7 days");
		}
		else
		{
			System.out.println("Oops, you are allowed to take only adult Fiction books");
		}
		
	}

}
