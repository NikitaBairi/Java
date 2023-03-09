package My;

public class StringPs2 {

	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("This is StringBuffer");
		System.out.println(s1.append(" This is a sample program"));//adding the new string to  existing string
		System.out.println(s1.insert(21, "Object ")); //inserting the object into the existing string at 21st postion 
		//System.out.println(s1.replace(14,20 ,"Builder"));//before reverse if we replace the word “Buffer” with “Builder” 
		System.out.println(s1.reverse());//reversing the entrie string
		System.out.println(s1.replace(32,39 ,"redliuB"));//after reversing if we replace  the word “Buffer” with “Builder” 
	}
	
}
