class Employee{
    long employeeid;//instance Variables
    long employeePhone;
    String employeeName;
    String employeeAddress;
    double basicSalary;
    double specialAllowance=250.80;
    double hra=1000.50;
    
    Employee(long employeeid, String employeeName, String employeeAddress, long emloyeePhone,double basicSalary){//Employee parametrised Constructor
        this.employeeid=employeeid;  //this is used to refer the current class  instance variable 
        this.employeeName=employeeName;
        this.employeeAddress=employeeAddress;
        this.employeePhone=employeePhone;
        this.basicSalary=basicSalary;
       
    }
    
    public void calculateSalary(){ //method to calculate salary
    double salary;// local Variable
    salary= (basicSalary + ( basicSalary * specialAllowance/100) + ( basicSalary * hra/100)); 
    System.out.println("The Salary is: "+salary);
    
    }
}
class Manager extends Employee{ //the manager class will take the properties of employee class
    
       Manager(long employeeid, String employeeName,String employeeAddress,long employeePhone,double basicSalary){//Manager parametrised Constructor
        super(employeeid,employeeName,employeeAddress,employeePhone,basicSalary);
        this.employeeid=employeeid;
        this.employeeName=employeeName;
        this.employeeAddress=employeeAddress;
        this.employeePhone=employeePhone;
        this.basicSalary=basicSalary;
      
    }
   
    public void calculateTransportAllowance(){// Method TansportAllowance it calculates transportAllowance
    double transportAllowance;
    transportAllowance=15*basicSalary/100; 
    System.out.println("The Transport Allowance of the Manager is: "+transportAllowance);
    }
}

class Trainee extends Employee{

    Trainee(long employeeid,String employeeName,String employeeAddress,long employeePhone,double basicSalary){//Trainee Constructor
        super(employeeid,employeeName,employeeAddress,employeePhone,basicSalary);
        this.employeeid=employeeid;
        this.employeeName=employeeName;
        this.employeeAddress=employeeAddress;
        this.employeePhone=employeePhone;
        this.basicSalary=basicSalary;   
    }
    public void calculateTransportAllowance(){
        double transportAllowance;
        transportAllowance=10*basicSalary/100; 
        System.out.println("The Transport Allowance of the trainee is: "+transportAllowance);
    
    }
}
 
class InheritanceActivity{
    double salary;
    public static void main(String args[]){//Main class
    Manager m = new Manager(126534,"Peter","Chennai India",237844,65000); //it takes values for the values which are their in parametrised constructor of manager
    m.calculateSalary();
    m.calculateTransportAllowance();
    
    Trainee t = new Trainee(29846,"Jack","Mumbai India",442085,45000);  //it takes values for the values which are their in parametrised constructor of manager
    t.calculateSalary();
    t.calculateTransportAllowance();
    }
}