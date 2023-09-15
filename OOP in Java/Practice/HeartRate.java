import java.util.*;
import java.time.*;
public class HeartRate{
  private String firstName;
  private String lastName;
  private int birthMonth;
  private int birthDay;
  private int birthYear;
  public HeartRate(String firstName,String lastName,int month,int day,int year){
    this.firstName = firstName;
    this.lastName = lastName;
    birthMonth = month;
    birthDay = day;
    birthYear = year;
  }
  public void setFirstName(String firstName){
    this.firstName = firstName;
  }
  public String getFirstName(){
    return this.firstName;
  }
  public void setLastName(String lastName){
    this.lastName = lastName;
  }
  public String getLastName(){
    return this.lastName;
  }
  public void setBirthMonth(int month){
    this.birthMonth = month;
  }
  public int getBirthMonth(){
    return this.birthMonth;
  }
  public void setBirthDay(int day){
    this.birthDay = day;
  }
  public int getBirthDay(){
    return this.birthDay;
  }
  public void setBirthYear(int year){
    this.birthYear = year;
  }
  public int getBirthYear(){
    return this.birthYear;
  }
  public int getAge(){ //method to calculate age in year
    int currentYear=YearMonth.now().getYear();
    return currentYear-this.getBirthYear();
  }
  public int maxHeartRate() { //method to calculate maximum heart rate
    return 220-getAge();
  }
  public String targetHeartRate() { //method to calculate target heart rate range
    float maxLimit = (maxHeartRate() /100f) * 85;
    float minLimit = (maxHeartRate() / 100f) * 50;
    String heartRateLimit = maxLimit + " - " + minLimit;
    return heartRateLimit;
  }
  public static void main(String[] args) {
    // first name, last name,birh month, day and year
    HeartRate hr = new HeartRate("Ali","Khan",10,5,2000);
    System.out.println("Person's data: "+"\n"+"Name: "+hr.getFirstName()+" "+hr.getLastName());
    System.out.println("Date of Birth: "+hr.getBirthDay()+"/"+hr.getBirthMonth()+ "/"+hr.getBirthYear());
    System.out.println("Your Age is: "+hr.getAge());
    System.out.println("Your maximum heart rate is: "+hr.maxHeartRate());
    System.out.println("Your target heart rate limit is: "+hr.targetHeartRate());
  }
}