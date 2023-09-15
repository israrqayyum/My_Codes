import java.util.Scanner;
public class Atm{
  private int balance;
  private int pincode;
  Atm(int initialBalance,int pincode){
    this.balance=initialBalance;
    this.pincode=pincode;
  }
  public int getbalance(){
    return this.balance;
  }
  public boolean withdraw(int amount,int pin){
    if(amount>this.balance){
      return false;
    }
    if(pin!=this.pincode){
      return false;
    }
    else{
      this.balance-=amount;
      return true;
    }
  }
  public void deposit(int amount){
    this.balance+=amount;
  }
  public boolean transfer(int amount,Atm receiver,int pin){
    if(pin!=this.pincode){
      return false;
    }
    boolean success=this.withdraw(amount,pin);
    if(success){
      receiver.deposit(amount);
      return true;
    }
    else{
      return false;
    }
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    Atm atm=new Atm(1000,1234);
    while(true){
      System.out.println("-----------1.View Balance-------------");
      System.out.println("-----------2.WithDraw-----------------");
      System.out.println("-----------3.Deposite-----------------");
      System.out.println("-----------4.Transfer-----------------");
      System.out.println("-----------5.Exit---------------------");
      System.out.println("-----------Enter Your Choice:---------");
      int choice=sc.nextInt();
      switch(choice){
        case 1:
        System.out.println("Your Balance is:"+atm.getbalance());
        break;
        case 2:
        System.out.println("Enter the Amount to withdraw:");
        int wdamount=sc.nextInt();
        boolean success=atm.withdraw(wdamount,1234);
        if(success=true){
         System.out.println("With draw Successfull.....");
        }
        else{
        System.out.println("Insuffient Balance.....");
        }
        break;
        case 3:
        System.out.print("Enter the amount to Deposit:");
        int dpamount=sc.nextInt();
        atm.deposit(dpamount);
        System.out.println("Deposit Successfull....");
        break;
        case 4:
        System.out.print("Enter the amount to transfer:");
        int tsamount=sc.nextInt();
        System.out.print("Enter the Reciver pincode to transfer:");
        int rpin=sc.nextInt();
        Atm reciver=new Atm(0,rpin);
        boolean transfersuccess=atm.transfer(tsamount,reciver,rpin);
        if(transfersuccess){
        System.out.println("Transfer Successfull....");
        }
        else{
        System.out.println("Invalid Pin or Insuffient Balance");
        }
        break;
        case 5:      
        System.out.println("---------Thanks for using ATM---------");
        System.exit(0);
        break;
        default:
        System.out.println("Invalid Choice");
      }
    }
  }
}
