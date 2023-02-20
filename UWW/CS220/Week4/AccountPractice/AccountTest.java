package Week4.AccountPractice;

import java.util.Scanner;

//This class is used to create object instance and test the program
public class AccountTest {
    public static void main(String[] args) {
        // (1) add code here to create an account object
        // named "checkingAccount",
        Account checkingAccount = new Account(); // create a new Account object named checkingAccount

        // (2) display account name in console
        System.out.println("Account name: " + checkingAccount.getName());
        System.out.println("Account balance: " + checkingAccount.getBalance());

        Account checkingA1 = new Account("Jane Green", 50.00);
        Account checkingA2 = new Account("John Blue", -7.53);

        // (3) display initial balance of each object
        System.out.printf("%s balance: $%.2f%n",
                checkingA1.getName(), checkingA1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n",
                checkingA2.getName(), checkingA2.getBalance());

        // (4) create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);
        System.out.print("Enter deposit amount for checkingA1: "); // prompt
        double depositAmount = input.nextDouble(); // obtain user input
        System.out.printf("%nadding %.2f to checkingA1 balance%n%n",
                depositAmount);
        checkingA1.deposit(depositAmount); // add to account1's balance

        // (5) display account information
        checkingA1.print();
        checkingA2.print();

        // (6)Create an array of 3 Account objects
        Account[] accounts = new Account[3];


        // display those Account objects information
        for (int i = 0; i < accounts.length; i++) {
            System.out.printf("Account name:%s , and balance: $%.2f%n",
                    accounts[i].getName(), accounts[i].getBalance());
        }

        // (7) prompt users to enter the number of accounts that they want to create
        // call method "createAccounts" to create an array of Account objects based on
        // user input, and
        // ask user whether they want to set up name and balance to the account.
        // how about to add default account names as account1, account2, account3 etc.
        // and setup initial balance to 0
        

        // Display new accounts information

        input.close();
    }

    // define createAccounts method here

}
