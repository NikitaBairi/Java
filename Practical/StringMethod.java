package com.practical;

public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Nikki";
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println(a.startsWith("Ni"));
		System.out.println(a.endsWith("i"));
		System.out.println(a.charAt(2));
		System.out.println(a.length());
		System.out.println(a.replace("Nikki","Nikita"));
		
	    int num=5;
	    String c=String.valueOf(num);
		System.out.println(c+55);
		

	}

}
