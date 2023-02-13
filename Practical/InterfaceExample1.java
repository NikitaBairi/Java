interface Sports{

    public void homeTeam(String name);
    public void team(int noOfPlayers);



}

interface Event{

   public void eventName(String ename);
   public void eventDate(String edate);
   public void eventPlace(String place);
}
 


class FootBall implements Sports{

 public void homeTeam(String name)
  {
     
     System.out.println("Our Team is representing:"+name);


   }
    public void team(int noOfPlayers){
    
      
      System.out.println("total no of players:"+noOfPlayers);
      
}

   public void goal(int score){
    
      
      System.out.println("total goals of team:"+score);
      
}

  public void eventName(String ename){
    System.out.println("Event Name:"+ename);

  }

  public void eventDate(String edate){
    System.out.println("Event Date:"+edate);

  }

   public void eventPlace(String place){
    System.out.println("Event Place:"+place);

  }
  
}


class Cricket implements Sports, Event{
	
	public void homeTeam(String name){
	 System.out.println("Our team is representing :" +name);
	}
	public void team(int noOfPlayers){
		System.out.println("total no of players :" +noOfPlayers);
	}
	
	public void eventName(String ename){
		System.out.println("Event Company Name  : "+ename);
	}
	public void eventDate(String edate){
		System.out.println("Sport match date : "+edate);
	}
	public void eventPlace(String place){
		System.out.println("Sport at : "+place);
	}
}

class InterfaceExample1{
   public static void main(String args[]){
    FootBall b=new FootBall();
    b.homeTeam("Maharastra");
    b.team(11);
    b.goal(2);
    b.eventName("FIFA");
    b.eventDate("1 Feb 2023");
    b.eventPlace("Mumbai");

   Cricket c = new Cricket();
   c.homeTeam("India");
   c.team(11);
   c.eventName("BCCI");
   c.eventDate("21st Apr,2023");
   c.eventPlace("DY London, Navi Mumbai");

   }
}