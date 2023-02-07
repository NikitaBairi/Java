interface Fruit{
    String name="Apple";
    void sell();
    default void buy(){
        System.out.println("Fruit are bought by buyer");
    }
    static void eat(){
        System.out.println("Fruit are healthier");
    }
}
class Seller implements Fruit{
    public void sell(){
        System.out.println("I'm selling apples");
    }
}
public class InterfaceExample{
    public static void main(String args[]){
        Fruit f = new Seller();
        f.sell();
        f.buy();
        Fruit.eat();
    }
}