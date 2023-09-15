/*
 * Name:Israr Qayyum
 * Nutech ID:F22605004
 * CS-22
 * Semester:Spring-22023
 * Course:Object Oriented Programming Lab CS-2006
 * LAB NO:09
*/
abstract class bankAccount{
    protected
    int balance;
    int numOfDeposites;
    int numOfWithdrawes;
    int annualInterest;
    int mServiceCharges;
    bankAccount(int bal,int rates){
        this.balance=bal;
        this.annualInterest=rates;
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
    public void monthlyProcess(){
        calcInterest();
        numOfDeposites=0;
        numOfWithdrawes=0;
        mServiceCharges=0;
    }
}
class savingsAccount extends bankAccount{
    private
    boolean status;
    savingsAccount(int bal,int rates){
        super(bal,rates);
        status=bal>=25; 
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
        super.monthlyProcess();
        if (balance < 25){
            status=false;
        }
    }
    public int disBalance(){
        return this.balance;
    }
    public String disStatus(){
        if(status==false){
            return "Accout Status is Inactve";
        }
        else if(status==true){
            return "Account Status is Active";   
        }
        else{
            return "No Status is Active";
        }
    }
}
public class main{
    public static void main(String args[]){
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("Enter Balance in $:");
        int b=sc.nextInt();
        System.out.println("Enter Annual interest rates:");
        int b1=sc.nextInt();
        savingsAccount ac=new savingsAccount(b,b1);
        do{
            System.out.println("1.---Check Balance---");
            System.out.println("2.---Deposit Money---");
            System.out.println("3.---Withdraw Money---");
            System.out.println("4.-------Exit------");
            int option=sc.nextInt();
            switch(option){
                case 1:
                    System.out.println("Your Balance is: $"+ac.disBalance()+"\n"+ac.disStatus());
                    break;
                case 2:
                    System.out.println("Enter amount to Deposit:");
                    int dep=sc.nextInt();
                    ac.deposit(dep);
                    System.out.println("Your Balance is: $"+ac.disBalance());
                    break;
                case 3:
                    System.out.println("Enter amount to Withdraw");
                    int amt=sc.nextInt();
                    ac.withdraw(amt);
                    System.out.println("Your Balance is: $"+ac.disBalance());
                    ac.check();
                    break;
                case 4:
                    System.out.println("---Thanks for Using Atm---");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }while(true);
    }
}
