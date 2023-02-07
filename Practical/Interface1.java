javacinterface Parent1{
    void discipline();
}

interface Parent2{
    void discipline();
}

class Child implements Parent1,Parent2{
    
    public void discipline(){
        System.out.println("I am learning disciple from my parents");
    }
    void follow(){
        System.out.println("I am following all the instructions");
    }
}

public class Interface1{
    public static void main(String args[]){
        Child c = new Child();
        c.discipline();
        c.follow();
    }
}