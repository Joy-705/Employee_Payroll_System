public class Main {
    public static void main(String[] args) {
        PayrollSystem payrollSystem = new PayrollSystem();
        FullTimeEmployee emp1 = new FullTimeEmployee("Morgan", 1, 80000.0);
        FullTimeEmployee emp2 = new FullTimeEmployee("Srinjoy", 2, 50000.0);
        PartTimeEmployee emp3 = new PartTimeEmployee("John",  3, 180, 100);


        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);
        payrollSystem.addEmployee(emp3);
        
        System.out.println("Initial Employee Details: ");
        payrollSystem.displayEmployees();

        System.out.println("Removing Employee: ");
        payrollSystem.removeEmployee(2);

        System.out.println("Remaining Employee Details: ");
        payrollSystem.displayEmployees();

    }
    
}
