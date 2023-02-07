class RBI{
    int getInterestRate(){
        return 0;
    }
}
class SBI extends RBI{
    int getInterestRate(){
        return 9;
    }
}
class PNB extends RBI{
    int getInterestRate(){
        return 11;
    }
}
class ICICI extends RBI{
    int getInterestRate(){
        return 8;
    }
}
public class OverridingExample{
    public static void main(String args[]){
        RBI r1 = new ICICI();
        r1.getInterestRate();
        
        RBI r2 = new PNB();
        r2.getInterestRate();
        
        RBI r3 = new SBI();
        r3.getInterestRate();
        
    }
}