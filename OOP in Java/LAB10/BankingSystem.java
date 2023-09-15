import java.util.Scanner;
// Account interface
interface Account{
    void deposit(double amount);
    void withdraw(double amount);
    double calculateInterest();
    void displayBalance();
}

// Account implementation - SavingsAccount
class SavingsAccount implements Account{
    private double balance;
    @Override
    public void deposit(double amount){
        balance+=amount;
        System.out.println("Deposited: $"+amount);
    }

    @Override
    public void withdraw(double amount){
        if(balance>=amount){
            balance-=amount;
            System.out.println("Withdrawn: $"+amount);
        } 
        else{
            System.out.println("Insufficient balance.");
        }
    }

    @Override
    public double calculateInterest(){
        double interestRate=0.05; // 5% interest rate
        double interest=balance*interestRate;
        System.out.println("Interest calculated: $"+interest);
        return interest;
    }

    @Override
    public void displayBalance() {
        System.out.println("Savings Account Balance: $"+balance);
    }
}

// Account implementation - CurrentAccount
class CurrentAccount implements Account{
    private double balance;
    @Override
    public void deposit(double amount){
        balance+=amount;
        System.out.println("Deposited: $"+amount);
    }

    @Override
    public void withdraw(double amount){
        if (balance>=amount){
            balance-=amount;
            System.out.println("Withdrawn: $"+amount);
        } 
        else {
            System.out.println("Insufficient balance.");
        }
    }

      @Override
    public double calculateInterest(){
        double interestRate=0.05; // 5% interest rate
        double interest=balance*interestRate;
        System.out.println("Interest calculated: $"+interest);
        return interest;
    }

    @Override
    public void displayBalance(){
        System.out.println("Current Account Balance: $"+balance);
    }
}

// Main class
public class BankingSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter initial balance for Savings Account: ");
        double savingsBalance=sc.nextDouble();
        Account savingsAccount=new SavingsAccount();
        savingsAccount.deposit(savingsBalance);
        
        System.out.print("Enter initial balance for Current Account: ");
        double currentBalance=sc.nextDouble();
        Account currentAccount=new CurrentAccount();
        currentAccount.deposit(currentBalance);

        System.out.print("Enter amount to deposit into Savings Account: ");
        double depositAmount=sc.nextDouble();
        savingsAccount.deposit(depositAmount);
        System.out.print("Enter amount to withdraw from Savings Account: ");
        double withdrawAmount=sc.nextDouble();
        savingsAccount.withdraw(withdrawAmount);
        

        System.out.print("Enter amount to deposit into Current Account: ");
        depositAmount=sc.nextDouble();
        currentAccount.deposit(depositAmount);
        System.out.print("Enter amount to withdraw from Current Account: ");
        withdrawAmount=sc.nextDouble();
        currentAccount.withdraw(withdrawAmount);

        System.out.println();
        // Display balances and interest
        savingsAccount.displayBalance();
        savingsAccount.calculateInterest();

        System.out.println();
        currentAccount.displayBalance();
        currentAccount.calculateInterest();
    }
}
