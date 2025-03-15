import java.util.*;
import java.util.stream.Collectors;

// The main method must be in a class named "Main".
class EmployeeSorting {
    public static void main(String[] args) {
         List<Employee> employees = Arrays.asList(
                new Employee(101, "Alice", 25, 50000),
                new Employee(102, "Bob", 28, 60000),
                new Employee(103, "Charlie", 30, 70000),
                new Employee(104, "David", 22, 55000)
        );
        
        List<Employee> sortedBySalary = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary))
                .collect(Collectors.toList());

        System.out.println("Sorted by Salary (Ascending):");
        sortedBySalary.forEach(System.out::println);
    }
}

class Employee {
    private int id;
    private String name;
    private int age;
    private double salary;

    // Constructor
    public Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public double getSalary() { return salary; }

    // toString for easy printing
    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', age=" + age + ", salary=" + salary + "}";
    }
}
