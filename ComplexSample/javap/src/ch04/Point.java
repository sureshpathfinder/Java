abstract class Shape {
	        public String color;
            public Shape( ) {
        }

         public void setColor( String c ){
	  	    color = c;
	        }
         public String getColor( ) {
	   	    return color;
	        }
     	abstract public double area( );
}


public class Point extends Shape {
     	static int x, y;
         public Point( ) {
	    	x = 12;
	        y = 14;
         }

         public double area( ) {
             return x*y;
         }

         public double perimeter( ) {
              return 2*(x+y);
         }

		 public static void print( ){
       	    System.out.println ( "point: " + x + "," + y );
		 }

		 public static void main(String args[]){
            Point p = new Point();
            p.print();
			System.out.println ( "Area : " + p.area() );
			System.out.println ( "Perimeter : " + p.perimeter() );
         }
}

