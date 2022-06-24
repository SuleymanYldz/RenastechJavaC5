package PracticeGeneral;

public class capitaloneobjectClass {


    public static void main(String[] args) {

        capitaloneBank account=new capitaloneBank("Suleyman", "Yildiz");



       System.out.println("account.getAccountHolder() = " + account.getAccountHolder());
        System.out.println("account.FirstName = " + account.FirstName);

        System.out.println("account.getBalance() = " + account.getBalance());
        account.setBalance(800);
        System.out.println("account.getBalance() = " + account.getBalance());
account.deposit(50);
        System.out.println("account.getBalance() = " + account.getBalance());
        account.deposit(6);
        System.out.println("account.getBalance() = " + account.getBalance());

        account.withdraw(400);
        System.out.println("account.getBalance() = " + account.getBalance());
        System.out.println(account);

        account.setAccountNumber(132639);
        System.out.println("account.getAccountNumber() = " + account.getAccountNumber());


        capitaloneBank account2=new capitaloneBank("Bailey", "Shock");
        account2.availableBalance();
        System.out.println("account2 = " + account2);
        account2.deposit(900);
        System.out.println("account2 = " + account2);
    }
}
