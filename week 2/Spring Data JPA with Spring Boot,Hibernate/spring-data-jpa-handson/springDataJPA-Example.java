public class SpringDataJPAExample {

    static class Employee {
        private int id;
        private String name;
        private double salary;

        public Employee(int id, String name, double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        public void display() {
            System.out.println("Employee ID      : " + id);
            System.out.println("Employee Name    : " + name);
            System.out.println("Employee Salary  : " + salary);
        }
    }

    static class EmployeeRepository {

        public void save(Employee employee) {
            System.out.println("Employee Saved Successfully");
            employee.display();
        }
    }

    public static void main(String[] args) {

        Employee employee = new Employee(101, "Nainammal", 30000);

        EmployeeRepository repository = new EmployeeRepository();

        repository.save(employee);
    }
}
