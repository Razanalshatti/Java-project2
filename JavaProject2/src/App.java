public class App {
    public static void main(String[] args) throws Exception {
        
        // creating employee object
        Employee employee = new Employee(1,"Fatma","Computer engineer",5000);

        System.out.println("Employee ID : " + employee.getEmployeeId() + "\n Name : " + employee.getName() + "\n Position : " + employee.getPosition() + "\n Basic Salary : " + employee.getBasicSalary());

        employee.setName("Fatma");
        employee.setPosition("CEO");

        System.out.println(" \n Updated Details: \n Name :  " + employee.getName() + "\n Position : " + employee.getPosition());

        // calculate and display salary with bonus and deduction
        double bonus = 2000.5;
        double deduction = 1234;
        double totalSalary = employee.calculateTotalSalary(bonus,deduction,deduction);
        System.out.println("\n Total Salary after bonus and deduction is : " + totalSalary);

    }
}