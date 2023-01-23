class VariableExample{
          static int num=55;//static
          long num1=4321980;//instance
          public void display(){ //Nonstatic method
              double num2=45.355;
              char a='M';
              System.out.println("local variable value:"+a);
              System.out.println("local variable value:"+num2);
}

         public static void calc(){
              double b=99.34;
              double c=45.23;
              double res=b*c;
              System.out.println("result is :"+res);
}
        public static void main(String args[]){
                VariableExample obj= new VariableExample();//object creation
                obj.display();//invoke nonstatic method with obj
                calc();//invovke static method
                System.out.println("Instance variable value:"+obj.num1);//calling instance variable
                System.out.println("Static variable value:"+VariableExample.num);

}
}