package Bank;

public class BankAccount {

   long accountNumber;
    String accountHolder;
    double balance;

    public void setbankInfo(String accountHolder, long accountNumber, double balance){

        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    void deposit(double amount){
        balance=balance+amount;
    }
    void showBalance(){
        System.out.println("Balance is : " + balance);
    }
    public String toString(){
        return "Account Number : " +accountNumber + "Account Holder is " + accountHolder+ "Balance is :"+ balance;
    }

}
class SavingAccount extends BankAccount{
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    double interestRate;

}
class checkingAccount extends BankAccount{

  public void withDraw(double amount){
       balance=balance-amount;

      System.out.println("Your withdraw " + amount + " ");
      System.out.println("Total balance is " + balance);
   }

}
