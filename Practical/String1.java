package com.practical;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a1="Anudip";
		String a2="anudip";
		String a3="Anudip Foundation Vashi";
		String a4="Anudip";
		
				
		//equals compare values of string
		System.out.println(a1.equals(a2));
		System.out.println(a1.equals(a3));
		System.out.println(a1.equalsIgnoreCase(a2));
		
		//==compares references not values
		System.out.println(a1==a2);
		System.out.println(a1==a4);
		
		//lexicopraghically
		String a5="apple";
		String a6="america";
		System.out.println(a6.compareTo(a5));
		System.out.println(a1.compareTo(a4));
		System.out.println(a2.compareTo(a1));
		
		//concatenation
		System.out.println(a5+" "+a6);
		System.out.println(60+79+"my"+90+7.4);
		System.out.println(a5.concat(a6));
		
		
		
		
		
			

	}

}
