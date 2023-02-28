package com.practical;

import java.util.Scanner;
public class String2 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String A");
        String A = sc.nextLine();
        System.out.println("Enter String b");
        String B = sc.nextLine();

        // Sum the lengths of A and B
        int sumLength = A.length() + B.length();
        System.out.println(sumLength);

        // Determine if A is lexicographically larger than B
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // Capitalize the first letter in A and B and print them on a single line
        A = A.substring(0, 1).toUpperCase() + A.substring(1);
        B = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(A + " " + B);
    }
}
