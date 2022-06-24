package PracticeGeneral;

public class capitaloneBank {


    public static String bankName="Capital one";
    public String FirstName;
    public String lastName;

    private String accountHolder;
    private double balance;
    private long accountNumber;

    public  capitaloneBank (String FirstName , String lastName){

        this.FirstName=FirstName;
        this.lastName=lastName;
        this.accountHolder=FirstName + " " + lastName;

    }


    public void setAccountNumber(long accountNumber){

        this.accountNumber= accountNumber;

    }
    public void setBalance(double balance){

        this.balance=balance;
    }

    public long getAccountNumber() {

        return accountNumber;
    }
    public double getBalance(){

        return balance;
    }
    public  String getAccountHolder(){
        return  accountHolder;
    }
    public void deposit(double money){

        setBalance(balance + money);

    }
    public void withdraw(double money){

        setBalance(balance - money);
    }

    public void availableBalance(){

        System.out.println("Available balance is " + getBalance());
    }
    public String toString(){
        return "Full name is: " + getAccountHolder() + " balance is: " + getBalance();
    }

}
