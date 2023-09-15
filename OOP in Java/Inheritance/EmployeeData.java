import java.util.*;
class Employee{
    private 
    String name;
    String employeeNumber;
    String hireDate;
    //mutators
    public void setName(String name) {
    this.name = name;
    }
    public void setEmpNumber(String eNumber) {
    this.employeeNumber = eNumber;
    }
    public void setHireDate(String hDate) {
    this.hireDate = hDate;
    }
    public String getName() {
    return this.name;
    }
    //accessors
    public String getEmpNumber() {
    return this.employeeNumber;
    }
    public String getHireDate() {
    return this.hireDate;
    }
}


class ProductionWorker extends Employee {
    private 
    int shift;
    double hourlyPayRate;
    public void setShift(int shift) {
    this.shift = shift;
    }
    public void setHourlyPayRate(double hRate) {
    this.hourlyPayRate = hRate;
    }
    public int getShift() {
    return this.shift;
    }
    public double getHourlyPayRate() {
    return this.hourlyPayRate;
    }
}


public class EmployeeData {
    public static void main(String [] args) {
    ProductionWorker pw = new ProductionWorker(); // object creation
    //inserting data in object
    pw.setName("Nadia");
    pw.setEmpNumber("132-N");
    pw.setHireDate("15 Dec, 2020");
    pw.setShift(1);
    pw.setHourlyPayRate(2000);
    }
}