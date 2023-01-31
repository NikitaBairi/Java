import java.util.Scanner;
class NestedForExample{

     public void calc(int rows){
       for(int i=1;i<=rows;i++){
          for(int j=1;j<=i;++j){
                System.out.print(j+" ");
     }
      System.out.println("");

         
      
   }
       
}

    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter rows");
    int rows=sc.nextInt();
    NestedForExample obj=new NestedForExample();
    obj.calc(rows);
    

 


}
}
