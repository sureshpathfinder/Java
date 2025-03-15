package pack1;
public class conn
 {
String name;
double bal;
public conn(String n, double b)
 {
name = n;
bal = b;
}
public void show() {
if(bal<0)
System.out.print("--> ");
System.out.println(name + ": $" + bal);
}
}