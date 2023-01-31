import java.util.Scanner;
class ForExample{

       public void calcTable(int number){
       
        //for(int i=1;i<=10;i++){
          int i=1;
          while(i<=10){ 
          System.out.println(number +"X"+i+"="+(number*i));
          i++;


  }
}
     public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter number");
     int number=sc.nextInt();
     ForExample fe=new ForExample();
     fe.calcTable(number);



}




}