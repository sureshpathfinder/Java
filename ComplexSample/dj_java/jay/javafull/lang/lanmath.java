/*Math Class:-this class methods are divided into trnascendental, exponential
and rounding methods.

trans - sin(), cos(), tan() ...
exponenetial - exp(), log(), pow(), sqrt()...
Rounding - abs(),ceil(),max(),min(),round()....

Methods                         Description

double sin(double arg)          returns the sine of the angle specified by
                                arg in radians

double cos(double arg)          returns the cosine of the angle specified by
                                arg in radians

double exp(double arg)          returns the exponent of the arg

double log(double arg)          returns the Natural logarithm of the arg

double pow(double x, double y)  returns x raised to the power of y.

double sqrt(double arg)         returns the square root of the arg

int abs(int a)                  returns the absolute value of a

long abs(long i)                returns the absolute value of i

float abs(float f)              returns the absolute value of f

double abs(double a)            returns the absolute value of a

double ceil(double d)           returns as a double the smallest integer that is greater than d

double floor(double d)          returns as a double the largest integer that is greater than d

int max(int a1,int a2)          returns the greater of a1 and a2. alternative
                                forms of this method returns long, float or
                                double.

int min(int a1,int a2)          returns the smaller of a1 and a2. alternative
                                forms of this method returns long, float or
                                double.

double random()                 returns a random number between 0.0 and 1.0

int round(float f)              returns the closest int to f

long round(double f)            returns the closest long to f

double tan(double d)            returns the tangent of d
 */

public class lanmath
{
        public static void main(String ar[])
        {

                 System.out.println("Math Functions");

                 System.out.println("Power of 2 to 3 is:"+Math.pow(2,3));

                 System.out.println("Square root of 3 is:"+Math.sqrt(3));

                 System.out.println("Absolute value of -48 is:"+Math.abs(-48));

                 System.out.println("Ceiling 4.3(to the nearest integer greater than 4.3):"+Math.ceil(4.3));

                 System.out.println("Flooring 4.3(to the nearest integer lesser than 4.3):"+Math.floor(4.3));
                                                                                          
                 System.out.println("Maximum of 2,7 is:"+Math.max(2,7));

                 System.out.println("Minimum of 2,7 is:"+Math.min(2,7));

                 System.out.println("Generating random numbers:"+Math.random());

                 System.out.println("Rounded value of 7.4 is:"+Math.round(7.4));

        }
}














