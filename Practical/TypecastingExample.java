class TypecastingExample{

       public static void main(String args[]){
         int x=890;
         long z=x;//automattically convert into long
         System.out.println(x);
         System.out.println(z);
         double y=x;
         System.out.println(y);

         double a=879.45;
         int b=(int)a;//converting double into int
         System.out.println(a);
         System.out.println(b);


}
}