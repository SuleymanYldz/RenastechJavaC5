package Assignments;

public class bankAccountObjects {

    public static void main(String[] args) {


        BankAccount customer=new BankAccount();

        customer.setbankInfo("Suleyman yildiz",25802580,140000);
        customer.balance=14400;

        customer.deposit(10000);

       customer.withDraw(500);

       customer.totalBalance();


        System.out.println(customer);
    }
}
