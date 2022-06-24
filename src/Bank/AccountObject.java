package Bank;

public class AccountObject extends BankAccount {

    public static void main(String[] args) {

       BankAccount account=new BankAccount();
       account.setbankInfo("Suleyman Yildiz",1020304560,144000);
       account.deposit(650);
       account.showBalance();

        System.out.println("*****************************************");

       checkingAccount interestRateForAccount=new checkingAccount();
       interestRateForAccount.setbankInfo("Suleyman yildiz",148545857,140000);
       interestRateForAccount.withDraw(50);
       interestRateForAccount.deposit(10000);
       interestRateForAccount.showBalance();
        System.out.println("interestRateForAccount.accountHolder = " + interestRateForAccount.accountHolder);

        System.out.println("******************************************");


        SavingAccount accountSaving=new SavingAccount();
        accountSaving.setbankInfo("Suleyman yildiz",1588545857,140000);
        accountSaving.setInterestRate(20);
        System.out.println("accountSaving.interestRate = " + accountSaving.interestRate);


    }

}
