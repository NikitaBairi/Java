//Write a program to print even, odd, sum of natural number using for loop from 1-200
class EvenOddSum{
    
    public void even(){
        int i;
        for(i=1;i<=200;i++){
            if(i%2==0){
                
                System.out.print(i+ " ");
                System.out.print(" ");
                
            }
        }
    }
        
    public void odd(){
        int i;
        for(i=1;i<=200;i++){
            if(i%2==1){
                
                System.out.print(i+ " ");
            }
        }
    }
    
    public void sumOfNatural(){
        int i;
        int sum=0;
        for(i=1;i<=200;i++){
            sum = sum + i;        
        }
        System.out.print(sum);

    }
        
    public static void main(String args[]){
        
        EvenOddSum obj = new EvenOddSum();
        System.out.println("Even numbers between 1 to 200: ");
        System.out.println(" ");
        obj.even();
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Odd Numbers from 1 to 200: ");
        System.out.println(" ");
        obj.odd();
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Sum of Natural Numbers from 1 to 200: ");
        System.out.println(" ");
        obj.sumOfNatural();
        
    }
}