package Assignments;

public class BankAccount {

    /*
    practice task:
 create a custom class for bank account
  attrubutes: accountHolder(String), accountNumber(long), balance(double)
  actions: totalBalance(), withDraw( amount ), deposit( amount )
   toString()
create a class called bankAccountObject to call BankAccount methods,variables.
Ex : if i deposit 50 dollars my balance should increase 50 dollars
  : if i withdraw 100 dollars my balance should decrease for 100 dollars
  : to check the balance use totalBalance method
     */


    String accountHolder;
    long accountNumber;
    double balance;

    public void setbankInfo(String accountHolder, long accountNumber, double balance){

        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    public void Balance (){

        System.out.println("Your balance is : " + balance);
    }
    public void withDraw(double amount){

        balance=-amount;

        System.out.println("Your withdraw " + amount + " ");
        System.out.println("Total balance is " + balance);

    }
    public void deposit(double amount){

        balance=+amount;

        System.out.println("you deposited " + amount ) ;
    }

    public void totalBalance(){

        System.out.println("Account balance is " + balance );
    }

    public String toString(){

        return "Acoount holder: " + accountHolder + " "+ "Account Number :" + accountNumber + " " +  "Balance " + balance;
    }
}
