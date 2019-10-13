package list4;

public class BankAccount {

    private String name;
    private double balance;
    private String id;

    public BankAccount(String name, double balance){
        this.name = name;
        this.balance = balance;
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public double getBalance(){
            return balance;
    }
    public void withdraw(double subtraction){
        balance = balance - subtraction;
    }
    public void deposit(double addition){
        balance = balance + addition;
    }
}
