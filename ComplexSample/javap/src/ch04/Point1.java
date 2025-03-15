interface Shape {
       public double area( );
       public double volume( );
}

public class Point1 implements Shape {
         static int x, y;

		 public Point1( ) {
	                x = 12;
	                y = 14;
         }
		 public double area( ) {
               return x*y;
         }

         public double volume( ) {
               return 4*3.14*(x*y);
         }

         public static void print( ){
           	System.out.println ( "point: " + x + "," + y );
        }

        public static void main(String args[]){
              Point1 p = new Point1();
              p.print();
			  System.out.println ( "Area : " + p.area() );
			System.out.println ( "Volume : " + p.volume() );
     	}
}
