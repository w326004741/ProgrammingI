package Assignment8;

import java.io.Serializable;

/**
 * @author Weichen Wang
 * @date 2018/11/14 - 11:35 AM
 */
// 父类实现Serializable序列化，继承父类的所有子类也都自动实现Serializable序列化。即子类不用在implements Serializable
// If a parent class has implemented Serializable interface then child class does not need to implement it
public abstract class SalesEmployee implements Serializable {
    private String firstName;  // Data member Declare instance variables as private
    private String lastName;
    private static int bikeEmployeeNumber;
    private String ppsNumber;
    protected double sales; //销售量  protected the member can only be accessed within its own package
    protected double commission; // 佣金，回扣
    private int employeeNumber;

    // Default Constructor
    public SalesEmployee() {
        firstName = "unassigned";
        lastName = "unassigned";
        ppsNumber = "unassigned";
        bikeEmployeeNumber++;
        sales = 0.0;
        commission = 0.0;
        this.employeeNumber = bikeEmployeeNumber;
    }

    // Override Constructor
    public SalesEmployee(String firstName, String lastName, String ppsNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ppsNumber = ppsNumber;
        bikeEmployeeNumber++;
        this.employeeNumber = bikeEmployeeNumber;
    }

    // Define calculateCommission() abstract method
    public abstract void calculateCommission();

    // setter & getter method
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPpsNumber(String ppsNumber) {
        this.ppsNumber = ppsNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPpsNumber() {
        return ppsNumber;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    @Override
    public String toString() {
        return "SalesEmployee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ppsNumber='" + ppsNumber + '\'' +
                ", sales=" + sales +
                ", commission=" + commission +
                ", employeeNumber=" + employeeNumber +
                '}';
    }
}
