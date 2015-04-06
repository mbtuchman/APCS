package Module08;

/**
 * @author Omar Rahman
 * @version 4/6/2015
 */

public class SavingsAccount {

    int accountNumber;
    double balance;
    String firstName;
    String lastName;

    public SavingsAccount(int acctNum, double bal, String fName, String lName) {
        accountNumber = acctNum;
        balance = bal;
        firstName = fName;
        lastName = lName;
    }

    public void withdraw(double amount) {
        if (amount < balance) {
            System.out.println("Not enough in balance to withdraw!");
            balance = balance - amount;
        }
        else {
            balance = amount - balance;
        }
    }

    public void deposit(double amount) {
        balance = amount + balance;
    }

    public void addInterest(double ammount, double rate) {
        rate = 0.035;
        ammount = rate * balance;
    }

}
