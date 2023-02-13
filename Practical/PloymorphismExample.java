import java.util.Scanner;
class PolymorphismExample{

      public void add(int a, int b){
        int c=a+b;
        System.out.println(c);

}

    public void add(double a,double b){
     double c=a+b;
       System.out.println(c);

}

   public static void main(String args[]){
        PolymorphismExample pe=new PolymorphismExample();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers a and b");
        int a=sc.nextInt();
        int b=sc.nextInt();
        pe.add(a,b);
        



}
}






