package com.practical;
import java.util.Scanner;

public class TryScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);       
       try {
    	   
    	   System.out.println("Enter two numbers");
           int num1=sc.nextInt();
           int num2=sc.nextInt();
           int result=num1/num2;
           System.out.println(result);
       }
       catch(Exception e) {
    	   
    	   System.out.println(e);
       }
	}

}
