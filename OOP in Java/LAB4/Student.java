import java.util.Scanner;
class Student {
  private String stName;
  private String regNo; 
  
  public static int batch;
  public static String dep;
  
  private int[] marks = new int[5];
  public Student(String st,String rg,int b,String dep,int marks[]){
      this.stName=st;
      this.regNo=rg;
      this.batch=b;
      this.dep=dep;
      this.marks=marks;
  }
  
  
 public String getStName() {
    return this.stName; 
 }

 public String getRegNo() {
    return this.regNo; 
 }

 public static int getBatch() {
    return Student.batch;
 }

 public static String getDep() {
    return Student.dep;
 }

 public int[] getMarks() {
    return this.marks;
 }

 public double calcPer(int marks[]) {
    double total = 0, per = 0;
    for (int i = 0; i < 5; i++) {
        total = total + marks[i];
    }
    per = ((total / 50.0) * 100.0);
    return per;
 }

 public void display() {
    System.out.println("Student Name:" + getStName());
    System.out.println("Registration Number:" + getRegNo());
    System.out.println("batch:" + getBatch());
    System.out.println("Department:" + getDep());
    double a;
    a = calcPer(this.marks);
    System.out.println("Result:" + a);
 }

 public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Student Name:");
    String Name = sc.nextLine();
    sc.nextLine();
    System.out.print("Enter Student Registration Number");
    String regNo = sc.nextLine();
    sc.nextLine();
    System.out.print("Enter Batch:");
    int batch = sc.nextInt();
    sc.nextLine();
    System.out.print("Enter Department:");
    String dep = sc.nextLine();
    System.out.println("Enter Student Marks of Five courses:");
    int arr[] = new int[5];
    for (int i = 0; i < 5; i++)
        arr[i] = sc.nextInt();
    Student s1 = new Student(Name,regNo,batch,dep,arr);
    s1.display();
 }
}

