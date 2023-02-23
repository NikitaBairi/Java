package My;//declares Package

public class Circle {
	private float radius;//instance variable
	private float pi= 3.5f;
	
	public Circle() {//Default constructor
		this.radius = 1.5f;
	}
	
	Circle(float radius){//Parametrised Constructor
		this.radius = 1.5f;
	}
	public Circle(float radius,float pi){
	    this.pi=pi;
		this.radius=radius;
	}
	
	public void calculateCircleArea(float radius) {//Method to calculate Area of Circle
		
		System.out.println("The area of circle is : "+(pi*radius*radius));
	}
	public void calculateCircumference(float radius) { //Method to calculate Circumference of Circle
		
		System.out.println("The circumference of circle is : "+(2*pi*radius));
	}

	public static void main(String[] args) {
		Circle c = new Circle();//Object Creation
		c.calculateCircleArea(1.5f);
		c.calculateCircumference(1.5f);		
		
	}

}
