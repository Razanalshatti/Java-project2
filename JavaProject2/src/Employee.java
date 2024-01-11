import java.util.ArrayList;
import java.util.List;

public class Employee {
    private int employeeId;
    private String name;
    private String position;
    private double basicSalary;
    private List<Double> paymentHistory;

    // Constructor
    public Employee(int employeeId, String name, String position, double basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.basicSalary = basicSalary;
        this.paymentHistory = new ArrayList<>();
    }

    // Getter & setter
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public double getBasicSalary() {
        return basicSalary;
    }
 
    public void setName(String newName) {
        this.name = newName;
    }

    public void setPosition(String newPosition) {
        this.position = newPosition;
    }
// salary calculation
public double calculateTotalSalary(double bonus , double deduction, double overtimePay){
    return basicSalary + bonus - deduction + overtimePay;
} 



}