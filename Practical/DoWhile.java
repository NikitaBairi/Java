import java.util.Scanner;
class DoWhile{

       public void calcTable(int number){
        int i=1;
        do{
       
        System.out.println(number +"X"+i+"="+(number*i));
        i++;
        
}
      while(i<=10);

}
     public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter number");
     int number=sc.nextInt();
     DoWhile dw =new DoWhile();
     dw.calcTable(number);



}




}