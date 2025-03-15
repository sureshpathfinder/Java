//Person is more generic class / Superclass
class Person
{
	public void dispDetails()
	{
		System.out.println("Person Details");
	} 
}
//Emloyee class which is derived from Person

class Employee extends Person
{
	public void dispEmp()
	{
		System.out.println("Employee Details");
	}
}

// main class

public class Test
{
	public static void main(String args[])
	{
		Employee emp=new Employee();
		emp.dispDetails(); //Displays Person Details 
		emp.dispEmp(); //Displays Employee details
	}
}
