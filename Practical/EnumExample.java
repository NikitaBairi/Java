

//enum Day //outside the class
//{
 //  SUNDAY,
 //  MONDAY,
 //  TUESDAY,
 //  WEDNESDAY,
 //  THRUSDAY,
 //  FRIDAY,
 //  SATURDAY;

//}
class EnumExample{
     enum Day //inside the class
  {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THRUSDAY,
    FRIDAY,
    SATURDAY;

 }
  


     public static void main(String args[]){
     Day d1=Day.THRUSDAY;
     System.out.println(d1);
     System.out.println("Value of tuesday is"+Day.valueOf("TUESDAY"));
     System.out.println("Value of tuesday is"+Day.valueOf("TUESDAY").ordinal());
     for(Day d:Day.values())
    {
      System.out.println(d);

     }
   



}
}