
class NestedForExample{

     public void calc(){
        //for(int i=1;i<=rows;i++){
          //for(int j=1;j<=i;++j){
               //  System.out.print(j+" ");
     //}
      //System.out.println("");

         for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" * " + " ");
            }
            System.out.println(" ");
      
   }
       
}

    public static void main(String args[]){
    //Scanner sc=new Scanner(System.in);
    //System.out.println("Enter rows");
   // int rows=sc.nextInt();
    NestedForExample obj=new NestedForExample();
    obj.calc();
    

 


}
}
