/*
ARRAYS :
~~~~~~~

* Arrays are group variables of same datatypes located in contiguous memory locations.

* All the elements of an array have a same name but
  different subscripts or indices.

* An array is also called subscripted variables.

* Before using an array the type and the dimension must be declared.

syn
type array_name[];
array_name=new type[size];
or
type array_name[] =new type[size];

eg:
int num[];
num=new int[5];
or
int num[]=new int[5];
float marks[]=new float[10];
char name[]=new char[10];
*/

class Array {
  public static void main(String args[]) 
{
    int month_days[];
    month_days = new int[12];
    month_days[0] = 31;
    month_days[1] = 28;
    month_days[2] = 31;
    month_days[3] = 30;
    month_days[4] = 31;
    month_days[5] = 30;
    month_days[6] = 31;
    month_days[7] = 31;
    month_days[8] = 30;
    month_days[9] = 31;
    month_days[10] = 30;
    month_days[11] = 31;
    System.out.println("April has " + month_days[3] + " days.");
  }
}