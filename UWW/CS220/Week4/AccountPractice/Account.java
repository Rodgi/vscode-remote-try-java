package Week4.AccountPractice;

// Version-2: Account.java
// Account class: added a double instance variable balance and a constructor
// and deposit method that perform validation.
public class Account {
    private String name; // instance variable
    private double balance; // instance variable

    // Account constructor that receives two parameters
    public Account(String name, double balance) {
        this.name = name; // assign name to instance variable name

        // validate that the balance is greater than 0.0; if it's not,
        // instance variable balance keeps its default initial value of 0.0
        if (balance > 0.0) { // if the balance is valid
            this.balance = balance; // assign it to instance variable balance
        } else
            this.balance = 0.0; // 0.0 is also the default value for a double type instance variable
    }

    public Account() {
        this.name = "unknown";
        this.balance = 10;
    }

    // method that deposits (adds) only a valid amount to the balance
    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) { // if the depositAmount is valid
            balance = balance + depositAmount; // add it to the balance
        }
    }

    // method returns the account balance
    public double getBalance() {
        return balance;
    }

    // method that sets the name
    public void setName(String name) {
        this.name = name;
    }

    // method that returns the name
    public String getName() {
        return name;
    }

    // method that display account name and balance
    public void print() {
        System.out.printf("Account name:%s , and balance: $%.2f%n", name, balance);
    }
}

/*
 * Add a default constructor in the class
 * public Account() {
 * //common practice, should provide initial values for instance variables
 * //name = "unknown";
 * //balance = 10; //programmer can decide the initial values, instead of using
 * the default values
 * }
 */
