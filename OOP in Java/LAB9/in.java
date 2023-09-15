/*
 * Name:Israr Qayyum
 * Nutech ID:F22605004
 * CS-22
 * Semester:Spring-22023
 * Course:Object Oriented Programming Lab CS-2006
 * LAB NO:09
*/
import java.util.Calendar;
abstract class BankAccount{
    protected
    int balance;
    int numOfDeposites;
    int numOfWithdrawes;
    int annualInterest;
    int mServiceCharges;
    boolean debitCard;
    boolean creditCard;
    int debitCardCharges;
    int creditCardCharges;
    BankAccount(int bal,int rates,boolean debitCard,boolean creditCard){
        this.balance=bal;
        this.annualInterest=rates;
        this.debitCard=debitCard;
        this.creditCard=creditCard;
    }
    public void deposit(int amt){
        this.numOfDeposites++;
        this.balance+=amt;
    }

    public void withdraw(int amt){
        if(this.balance>=amt){
            this.balance-=amt;
            this.numOfWithdrawes++;
        }
        else{
            System.out.println("---Insufficient Balance---");
        }
    }

    public int calcInterest(){
        int mInterestRate=(annualInterest/12);
        int mInterest=this.balance*mInterestRate; 
        this.balance=balance+mInterest;
        return this.balance;
    }
    public abstract void monthlyProcess();
    public abstract void yearlyProcess();
    public int getBalance(){
        return this.balance;
    }
}
class SavingsAccount extends BankAccount {
    private
    boolean status;   
    SavingsAccount(int bal, int rates, boolean debitCard, boolean creditCard) {
        super(bal, rates, debitCard, creditCard);
        status=bal>=25;
        this.debitCardCharges=10;
        this.creditCardCharges=20;
    }
    public void check(){
        if(this.balance<25){
            status=false;
        }
    }
    @Override
    public void deposit(int amt){
        super.deposit(amt);
        if(status==false && (amt+this.balance)>=25){
            status=true;
        }
    }
    @Override
    public void withdraw(int amt){
        if(status==false){
            System.out.println("---Your Account Status is Inactive Please deposit more amount to fully active your account---");
        }
        if(status==true){
            super.withdraw(amt);
        }
    }
    @Override
    public void monthlyProcess(){
        if (numOfWithdrawes > 4){
            int x=numOfWithdrawes-4;
            mServiceCharges+=x;
        }
        super.calcInterest(); // Call the inherited calcInterest method
        numOfDeposites=0;
        numOfWithdrawes=0;
        mServiceCharges=0;
        if (balance < 25){
            status=false;
        }
    }
    @Override
    public void yearlyProcess(){
        int month=Calendar.getInstance().get(Calendar.MONTH);
        int date=Calendar.getInstance().get(Calendar.DATE);
        if(month==11&&date==31) {
            if(debitCard){
                balance-=debitCardCharges;
            }
            if(creditCard){
                balance -= creditCardCharges;
            }
        }
    }
}
class CurrentAccount extends BankAccount {
    CurrentAccount(int bal,int rates,boolean debitCard,boolean creditCard){
        super(bal,rates,debitCard,creditCard);
        this.debitCardCharges=10; 
        this.creditCardCharges=20;
    }
    @Override
    public void monthlyProcess(){
        numOfDeposites=0;
        numOfWithdrawes=0;
        mServiceCharges=0;
    }
    @Override
    public void yearlyProcess(){
        int month=Calendar.getInstance().get(Calendar.MONTH);
        int date=Calendar.getInstance().get(Calendar.DATE);
        if(month==11&&date==31){
            if(debitCard){
                balance-=debitCardCharges;
            }
            if(creditCard){
                balance-=creditCardCharges;
            }
        }
    }
}
public class in {
    public static void main(String args[]){
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("Enter Balance in $:");
        int b=sc.nextInt();
        System.out.println("Enter Annual interest rates:");
        int b1=sc.nextInt();
        System.out.println("Do you have a debit card? (write only true or false):");
        boolean hasDebitCard=sc.nextBoolean();
        System.out.println("Do you have a credit card? (write only true or false):");
        boolean hasCreditCard=sc.nextBoolean();
        SavingsAccount ac=new SavingsAccount(b,b1,hasDebitCard,hasCreditCard);
        do{
            System.out.println("1.---Check Balance---");
            System.out.println("2.---Deposit Money---");
            System.out.println("3.---Withdraw Money---");
            System.out.println("4.---Yearly Process---");
            System.out.println("5.---Monthly Process---");
            System.out.println("6.-------Exit------");
            int option=sc.nextInt();
            switch(option){
                case 1:
                    System.out.println("Your Balance is: $"+ac.getBalance());
                    break;
                case 2:
                    System.out.println("Enter amount to Deposit:");
                    int dep=sc.nextInt();
                    ac.deposit(dep);
                    System.out.println("Your Balance is: $"+ac.getBalance());
                    break;
                case 3:
                    System.out.println("Enter amount to Withdraw");
                    int amt=sc.nextInt();
                    ac.withdraw(amt);
                    System.out.println("Your Balance is: $"+ac.getBalance());
                    ac.check();
                    break;
                case 4:
                    ac.yearlyProcess();
                    System.out.println("Yearly process executed. Your Balance is: $"+ac.getBalance());
                    break;
                case 5:
                    ac.monthlyProcess();
                    System.out.println("Monthly process executed. Your Balance is: $"+ac.getBalance());
                    break;
                case 6:
                    System.out.println("---Thanks for Using Atm---");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }while(true);
    }
}

