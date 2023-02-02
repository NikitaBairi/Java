//Write a program to design an Calculator using switch case
import java.util.Scanner;
class CalculatorDesign{

   
    public void calc(String input,float a, float b){
      

      switch(input){
         case "Addition":
         System.out.println("Addition of two numbers is" +(a+b));
         break;

        case "Subtraction":
         System.out.println("Subtraction of two numbers is" + (a-b));
         break;
 
       case "Division":
         System.out.println("Division of two numbers is" +(a/b));
         break;

      case "Multiplication":
         System.out.println("Multiplication of two numbers is" +(a*b));
         break;

        
         

      default:
           System.out.println("Invalid Operation Selected");
         
 }
     


   }



   public static void main(String args[]){
  
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter Operation");
   String input=sc.next();
   System.out.println("Enter First Number");
   float a=sc.nextFloat();
   System.out.println("Enter Second Number");
   float b=sc.nextFloat();
   
 
  
   CalculatorDesign obj=new CalculatorDesign();
   obj.calc(input,a,b);





}

}
 