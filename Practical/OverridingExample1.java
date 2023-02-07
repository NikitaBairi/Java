class Animal{
    void bark(){
        System.out.println("Animal is barking");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking");
    }
}
class Puppy extends Animal{
    void bark(){
        System.out.println("Puppy is barking");
    }
}

public class OverridingExample1{
    public static void main (String args[]){
    Animal an = new Puppy();
    an.bark();
   } 
}