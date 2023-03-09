package My;

public class StringMethod {

	public static void main(String[] args) {
		String s1="Welcome to Java World";
		System.out.println(s1.charAt(5));  //Displays the character at 5th position .
		System.out.println(s1.equalsIgnoreCase("Welcome"));  //Compares with new string by ingnoring cases
		System.out.println(s1.concat(" Let us learn"));//Concatenates with the above String
		System.out.println(s1.indexOf("a"));//Displays the position of the first occurrence of character ‘a’ 
		System.out.println(s1.replace("a","e")); //Replaces all "a" with new "e" 
		System.out.println(s1.substring(4, 10)); //Displays the string between 4th position and 10th position
		System.out.println(s1.toLowerCase());//Display the above string with lowercase
		
		
		

	}

}
