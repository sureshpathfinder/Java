class Vehicle
  {
     public void drive()
       {
          System.out.println("Vehicle : drive");
       }
  }

class Car extends Vehicle
  {
     public void drive()
        {
           System.out.println("Car : drive");
        }
  }

public class Sona85
   {
      public static void main(String[] args)
        {
            Vehicle v=new Vehicle();
            Car c = new  Car();
            v.drive();
            c.drive();

            v=c;
            v.drive();
       }
   }  