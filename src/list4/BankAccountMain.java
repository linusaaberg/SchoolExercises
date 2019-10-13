package list4;

public class BankAccountMain {

    public static void main(String[] args){

        BankAccount Eve = new BankAccount("Eve", 1000.39);
        BankAccount John = new BankAccount( "John", 50000.00);
        BankAccount Mary = new BankAccount("Mary", 12540000.99);

        System.out.println(Eve.getName() + " have " + Eve.getBalance() + " sek on her account.");
        System.out.println(John.getName() + " have " + John.getBalance() + " sek on his account.");
        System.out.println(Mary.getName() + " have " + Mary.getBalance() + " sek on her account.");

        System.out.println("We now withdraw 500 sek from each account.");

        double withdraw = 500.00;
        Eve.withdraw(withdraw);
        John.withdraw(withdraw);
        Mary.withdraw(withdraw);

        System.out.println(Eve.getName() + " have " + Eve.getBalance() + " sek on her account.");
        System.out.println(John.getName() + " have " + John.getBalance() + " sek on his account.");
        System.out.println(Mary.getName() + " have " + Mary.getBalance() + " sek on her account.");

        System.out.println("We now deposit 1500 sek on each account");

        double deposit = 1500.00;
        Eve.deposit(deposit);
        John.deposit(deposit);
        Mary.deposit(deposit);

        System.out.println(Eve.getName() + " have " + Eve.getBalance() + " sek on her account.");
        System.out.println(John.getName() + " have " + John.getBalance() + " sek on his account.");
        System.out.println(Mary.getName() + " have " + Mary.getBalance() + " sek on her account.");


    }
}
