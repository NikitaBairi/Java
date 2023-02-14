class Student{
	
	//private data members
	private int sid;
	private String name;
	private String email;
	private long phoneno;
	
	//getter setter method
	public int getSid(){
		return sid;
	}
	public void setSid(int sid){		
		this.sid=sid;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getEmail(){
		return email;
	}
	public void setEmail(String email){
		this.email=email;
	}
	public long getPhone(){
		return phoneno;
	}
	public void setPhone(long phoneno){
		this.phoneno=phoneno;
	}
		
}
class EncapsulationExample{
	public static void main(String args[]){
		
		Student s = new Student();  //creation of student object
		s.setSid(1001);  //setter() to set values of private members
		s.setName("Nikita");
		s.setEmail("Nikita@gmail.com");
		s.setPhone(3456124);
		//getter () to get values of private members
		System.out.println("Values are " +s.getSid()+" "+s.getName()+" "+s.getEmail()+" "+s.getPhone());
	}
}