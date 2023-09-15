import java.util.Scanner;
public class digitalc{
  private int hours;
  private int minutes;
  private int seconds;
  public void displaytime(){
    String amPm=(this.hours<12)?"AM":"PM";
    int displayHours=(this.hours>12)?(this.hours-12):this.hours;
    if(displayHours==0){
      displayHours=12;
    }
    System.out.printf("%02d:%02d:%02d %s",displayHours,this.minutes,this.seconds,amPm);
  }
  public static void main(String args[]){
    digitalc clock=new digitalc();
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Hours (0-23) :");
    do{
      int hours=sc.nextInt();
      if(hours<0 || hours >23){
        System.out.print("You Enter Invalid Input\nEnter Again:");
      }
      else{
        clock.hours=hours;
        break;
      }
    }while(true);
    System.out.print("Enter Minutes(0-59) :");
    do{
      int minutes=sc.nextInt();
      if(minutes<0 || minutes>59){
       System.out.print("You Enter Invalid Input\nEnter Again:");
      }
      else{
        clock.minutes=minutes;
        break;
      }
    }while(true);
    System.out.print("Enter Seconds(0-59) :");
    do{
      int seconds=sc.nextInt();
      if(seconds<0 || seconds>59){
        System.out.print("You Enter Invalid Input\nEnter Again:");
      }
      else{
        clock.seconds=seconds;
        break;
      }
    }while(true);
    clock.displaytime();
  }
}