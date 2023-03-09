package com.practical;

public class TryCatchEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int num=88/0;
		System.out.println(num);
		
		}
		catch(Exception e) {
			System.out.println("Cannot divide by zero");
		}
		finally {//exceute regardless of exception occurs or not
			System.out.println("Hiiii");			
			
		}

	}

}
