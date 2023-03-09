package com.practical;

public class TestCustomException {
	
	static void CheckAge(int age) throws VerficationException{
		if(age<18||age>25) {
			throw new VerficationException("Student age should be 18-25 for admission");
		}
		else {
			System.out.println("Student is eligible for admission");
			
		}
	}

	public static void main(String[] args) {
         try {
        	 CheckAge(20);
        	 
         }catch(VerficationException e) {
        	 System.out.println(e);
        	 
         }


	}

}
