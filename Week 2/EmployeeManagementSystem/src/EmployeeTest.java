public class EmployeeTest {

    public static void main(String[] args) {

        EmployeeManager manager =
                new EmployeeManager(5);

        manager.addEmployee(
                new Employee(101,
                        "Rahul",
                        "Manager",
                        70000));

        manager.addEmployee(
                new Employee(102,
                        "Amit",
                        "Developer",
                        50000));

        manager.addEmployee(
                new Employee(103,
                        "Sneha",
                        "Tester",
                        45000));

        manager.displayEmployees();

        System.out.println();

        System.out.println("Searching Employee");

        Employee emp =
                manager.searchEmployee(102);

        if(emp!=null)

            System.out.println(emp);

        else

            System.out.println("Employee Not Found");

        System.out.println();

        manager.deleteEmployee(102);

        manager.displayEmployees();

    }

}