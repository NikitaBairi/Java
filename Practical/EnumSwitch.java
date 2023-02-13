enum Directions
{
  EAST,
  WEST,
  NORTH,
  SOUTH;


}


class EnumSwitch{
   Directions direction;
   public EnumSwitch(Directions direction)
   {
    this.direction=direction;
    }


  void CheckDirection()
  {
    switch(direction)
    {
     case EAST:
       System.out.println("East is the Direction");
       break;
      case WEST:
       System.out.println("West is the Direction");
       break;
       case NORTH:
       System.out.println("North is the Direction");
       break;
       case SOUTH:
       System.out.println("South is the Direction");
       break;
       default:
        System.out.println("Check with the Direction again");
        break;
     }
}

    public static void main(String args[]){
        String str="NORTH";
       EnumSwitch e=new EnumSwitch(Directions.valueOf(str));
       e.CheckDirection();


}
}