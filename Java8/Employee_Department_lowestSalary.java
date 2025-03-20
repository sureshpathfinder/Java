import java.util.*;
import java.util.stream.Collectors;

class Employee {
    String name;
    int departmentId;  // Department reference
    double salary;

    public Employee(String name, int departmentId, double salary) {
        this.name = name;
        this.departmentId = departmentId;
        this.salary = salary;
    }

    public double getSalary() { return salary; }
    public String getName() { return name; }
    public int getDepartmentId() { return departmentId; }

    @Override
    public String toString() {
        return name + " | Dept ID: " + departmentId + " | " + salary;
    }
}

class Department {
    int id;
    String name;

    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }
    public String getName() { return name; }
}

public class LowestSalaryByDepartment {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", 1, 50000),
            new Employee("Bob", 2, 70000),
            new Employee("Charlie", 2, 80000),
            new Employee("David", 3, 60000),
            new Employee("Eve", 1, 55000),  
            new Employee("Frank", 3, 65000)
        );

        List<Department> departments = Arrays.asList(
            new Department(1, "HR"),
            new Department(2, "IT"),
            new Department(3, "Finance")
        );

        // Find the lowest salary employee in each department
        Map<Integer, Employee> lowestSalaryByDept = employees.stream()
            .collect(Collectors.toMap(
                Employee::getDepartmentId,  // Group by department ID
                e -> e,                     // Store employee
                (e1, e2) -> e1.getSalary() <= e2.getSalary() ? e1 : e2 // Keep lowest salary employee
            ));

        // Map department names and print results
        lowestSalaryByDept.forEach((deptId, emp) -> {
            String deptName = departments.stream()
                .filter(d -> d.getId() == deptId)
                .map(Department::getName)
                .findFirst()
                .orElse("Unknown Dept");

            System.out.println("Department: " + deptName + " | Employee: " + emp.getName() + " | Salary: " + emp.getSalary());
        });
    }
}
