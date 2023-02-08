package Week2.TakeHomeLab;

import javax.swing.JOptionPane;

public class DollarConvert {
    public static void main(String[] args) {

        // User chooses amount of dollar amounts to enter
        String userchoice = JOptionPane.showInputDialog("How many dollar amounts would you like to enter?");
        // Try catch to check if the user input is a valid integer
        try {
            Integer.parseInt(userchoice);
        } catch (NumberFormatException e) {
            System.out.println("Invalid Input! Please enter a valid integer. Run Program Again.");
            System.exit(0);
        }
        int numDollars = Integer.parseInt(userchoice);
        double[] userInputs = new double[numDollars];

        // Loop for the user to enter the dollar amounts into an array
        for (int i = 0; i < userInputs.length; i++) {
            String userInput = JOptionPane.showInputDialog("Enter a dollar amount");

            // Try catch to check if the user input is a valid dollar amount
            try {
                Double.parseDouble(userInput);
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input! Please enter a valid dollar amount.");
                i--;
                continue;
            }
            userInputs[i] = Double.parseDouble(userInput);
        }
        // For Each loop to loop through the array and call the calculations method
        for (double dollarsValue : userInputs) {
            calculations(dollarsValue);

        }
    }

    // Method to calculate the number of each denomination of bills and coins
    public static void calculations(double dollarsValue) {
        int dollars = (int) dollarsValue;
        int dollarActual = (int) dollarsValue;
        int hundreds = dollars / 100;
        dollars = dollars % 100;
        int fifties = dollars / 50;
        dollars = dollars % 50;
        int twenties = dollars / 20;
        dollars = dollars % 20;
        int tens = dollars / 10;
        dollars = dollars % 10;
        int fives = dollars / 5;
        dollars = dollars % 5;
        int ones = dollars;
        int cents = (int) Math.round((dollarsValue - (int) dollarsValue) * 100);

        // If there are cents involved, then it calculates the quantity of each coin, then prints using the printResults method
        if (cents > 0) {
            int quarters = cents / 25;
            cents = cents % 25;
            int dimes = cents / 10;
            cents = cents % 10;
            int nickels = cents / 5;
            cents = cents % 5;
            int pennies = cents;
            printResults(dollarsValue, dollarActual, hundreds, fifties, twenties, tens, fives, ones, quarters,
                    dimes, nickels, pennies);
        }
        // Else it prints the results of the calculations with dollar amounts using the printResult method
        else
            printResult(dollarsValue, dollarActual, hundreds, fifties, twenties, tens, fives, ones);
    }

    // Method to print the results of the calculations for dollar amounts without cents
    public static void printResult(double dollarsValue, int dollarActual, int hundreds, int fifties, int twenties,
            int tens, int fives, int ones) {
        if (dollarActual < 5)
            System.out.printf("%n$%.2f can be reduced to %nOnes: %d%n%n", dollarsValue, ones);
        else if (dollarActual < 10)
            System.out.printf("%n$%.2f can be reduced to %nFives: %d%nOnes: %d%n%n", dollarsValue, fives, ones);
        else if (dollarActual < 20)
            System.out.printf("%n$%.2f can be reduced to %nTens: %d%nFives: %d%nOnes: %d%n%n", dollarsValue, tens,
                    fives, ones);
        else if (dollarActual < 50)
            System.out.printf("%n$%.2f can be reduced to %nTwenties: %d%nTens: %d%nFives: %d%nOnes: %d%n%n",
                    dollarsValue, twenties, tens, fives, ones);
        else if (dollarActual < 100)
            System.out.printf(
                    "%n$%.2f can be reduced to %nFifties: %d%nTwenties: %d%nTens: %d%nFives: %d%nOnes: %d%n%n",
                    dollarsValue, fifties, twenties, tens, fives, ones);
        else
            System.out.printf(
                    "%n$%.2f can be reduced to %nHundreds: %d%nFifties: %d%nTwenties: %d%nTens: %d%nFives: %d%nOnes: %d%n%n",
                    dollarsValue, hundreds, fifties, twenties, tens, fives, ones);

    }

    // Method to print the results of the calculations for dollar amounts with cents
    public static void printResults(double dollarsValue, int dollarActual, int hundreds, int fifties, int twenties,
            int tens, int fives, int ones, int quarters, int dimes, int nickels, int pennies) {
        if (dollarActual < 5)
            System.out.printf(
                    "%n$%.2f can be reduced to %nOnes: %d%nQuarters: %d%nDimes: %d%nNickels: %d%nPennies: %d%n%n",
                    dollarsValue, ones, quarters, dimes, nickels, pennies);
        else if (dollarActual < 10)
            System.out.printf(
                    "%n$%.2f can be reduced to %nFives: %d%nOnes: %d%nQuarters: %d%nDimes: %d%nNickels: %d%nPennies: %d%n%n",
                    dollarsValue, fives, ones, quarters, dimes, nickels, pennies);
        else if (dollarActual < 20)
            System.out.printf(
                    "%n$%.2f can be reduced to %nTens: %d%nFives: %d%nOnes: %d%nQuarters: %d%nDimes: %d%nNickels: %d%nPennies: %d%n%n",
                    dollarsValue, tens, fives, ones, quarters, dimes, nickels, pennies);
        else if (dollarActual < 50)
            System.out.printf(
                    "%n$%.2f can be reduced to %nTwenties: %d%nTens: %d%nFives: %d%nOnes: %d%nQuarters: %d%nDimes: %d%nNickels: %d%nPennies: %d%n%n",
                    dollarsValue, twenties, tens, fives, ones, quarters, dimes, nickels, pennies);
        else if (dollarActual < 100)
            System.out.printf(
                    "%n$%.2f can be reduced to %nFifties: %d%nTwenties: %d%nTens: %d%nFives: %d%nOnes: %d%nQuarters: %d%nDimes: %d%nNickels: %d%nPennies: %d%n%n",
                    dollarsValue, fifties, twenties, tens, fives, ones, quarters, dimes, nickels, pennies);
        else
            System.out.printf(
                    "%n$%.2f can be reduced to %nHundreds: %d%nFifties: %d%nTwenties: %d%nTens: %d%nFives: %d%nOnes: %d%nQuarters: %d%nDimes: %d%nNickels: %d%nPennies: %d%n%n",
                    dollarsValue, hundreds, fifties, twenties, tens, fives, ones, quarters, dimes, nickels, pennies);
    }

}
