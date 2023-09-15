class Employee {
    private String name;
    private String empNumber; // format XXX–L
    private int hireDay;
    private int hireMonth;
    private int hireYear;
    // Constructor
    public Employee(String name, String empNumber, int hireDay, int hireMonth, int hireYear) {
        this.name = name;
        this.empNumber = empNumber;
        this.hireDay = hireDay;
        this.hireMonth = hireMonth;
        this.hireYear = hireYear;
    }

    // Accessor and Mutator methods
    public String getName() {                       return name; }
    public void   setName(String name) {            this.name = name; }
    public String getEmpNumber() {                  return empNumber; }
    public void   setEmpNumber(String empNumber) {  this.empNumber = empNumber; }
    public int    getHireDay() {                    return hireDay; }
    public void   setHireDay(int hireDay) {         this.hireDay = hireDay; }
    public int    getHireMonth() {                  return hireMonth; }
    public void   setHireMonth(int hireMonth) {     this.hireMonth = hireMonth; }
    public int    getHireYear() {                   return hireYear; }
    public void   setHireYear(int hireYear) {       this.hireYear = hireYear; }
}

class ProductionWorker extends Employee {
    private int shift; // 1 for day, 2 for night
    private double payRate;
    // Constructor
    public ProductionWorker(String name, String empNumber, int hireDay, int hireMonth, int hireYear, int shift, double payRate) {
        super(name, empNumber, hireDay, hireMonth, hireYear);
        this.shift = shift;
        this.payRate = payRate;
    }

    // Accessor and Mutator methods
    public int    getShift() {                  return shift; }
    public void   setShift(int shift) {        this.shift = shift; }
    public double getPayRate() {             return payRate; }
    public void   setPayRate(double payRate) { this.payRate = payRate; }
}

public class Main {
    public static void main(String[] args) {
        ProductionWorker worker = new ProductionWorker("Ali Khan","226-E",10,6,2023,1,20.0);
        System.out.println("Name: " +worker.getName());
        System.out.println("Employee Number: " +worker.getEmpNumber());
        System.out.println("Hire Date: " + worker.getHireDay() + "/" + worker.getHireMonth() + "/" + worker.getHireYear());
        System.out.println("Shift: " + (worker.getShift() == 1 ? "Day" : "Night"));
        System.out.println("Pay Rate: $" + worker.getPayRate());
    }
}
