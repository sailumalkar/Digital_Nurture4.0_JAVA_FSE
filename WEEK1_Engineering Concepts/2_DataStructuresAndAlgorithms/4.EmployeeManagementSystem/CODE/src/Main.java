public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(5);

        manager.addEmployee(new Employee(101, "Alice", "Manager", 70000));
        manager.addEmployee(new Employee(102, "Bob", "Developer", 55000));
        manager.addEmployee(new Employee(103, "Charlie", "Analyst", 60000));

        System.out.println("\nAll Employees:");
        manager.displayAllEmployees();

        System.out.println("\nSearching for Employee ID 102:");
        Employee emp = manager.searchEmployee(102);
        System.out.println(emp != null ? emp : "Not found");

        System.out.println("\nDeleting Employee ID 102:");
        manager.deleteEmployee(102);

        System.out.println("\nAll Employees After Deletion:");
        manager.displayAllEmployees();
    }
}
