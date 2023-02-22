package com.practical;

public class SingleArrayEg {
	 public static void main(String[] args)
	 {
		 int myarray[]=new int[4];
		 myarray[0]=78;
		 myarray[1]=97;
		 myarray[2]=76;
		 myarray[3]=30;
		 
		 System.out.println(myarray[2]);
		 for(int i=0;i<myarray.length;i++) {
			 
			 System.out.println(myarray[i]);
			 
	}
		 float num[]={3.3f,5.5f,8.3f,9.8f};
		 
		 System.out.println("Array elements:");
			
		 for(float j:num) {
			 System.out.print(j+" ,");
		 }
		 
	 }

}
