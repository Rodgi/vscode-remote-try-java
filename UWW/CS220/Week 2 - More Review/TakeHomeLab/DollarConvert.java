
import java.util.Scanner;

public class DollarConvert {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double[] userInputs = new double[5];

        for (int i = 0; i < userInputs.length; i++) {
            System.out.println("Enter dollar amount.");
            userInputs[i] = scnr.nextDouble();
        }
        for (double dollarsValue : userInputs) {
            int dollars = (int) dollarsValue;
            int dollarActual = (int) dollarsValue;
            int hundreds = dollars / 100; dollars = dollars % 100;
            int fifties = dollars / 50; dollars = dollars % 50;
            int twenties = dollars / 20; dollars = dollars % 20;
            int tens = dollars / 10; dollars = dollars % 10;
            int fives = dollars / 5; dollars = dollars % 5;
            int ones = dollars;
            int cents = (int) Math.round((dollarsValue - (int) dollarsValue) * 100);
            int quarters = cents / 25;  cents = cents % 25;
            int dimes = cents / 10; cents = cents % 10;
            int nickels = cents / 5; cents = cents % 5;
            int pennies = cents;
            if (cents > 0)
                printResults(dollarsValue, dollarActual, hundreds, fifties, twenties, tens, fives, ones, quarters,
                        dimes, nickels, pennies);
            else
                printResult(dollarsValue, dollarActual, hundreds, fifties, twenties, tens, fives, ones);

        }
        scnr.close();
    }

    public static void printResult(double dollarsValue, int dollarActual, int hundreds, int fifties, int twenties,
            int tens, int fives, int ones) {
        if (dollarActual < 5)
            System.out.printf("%n$%.2f sdf can be reduced to %nOnes: %d%n%n", dollarsValue, ones);
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

    public static void printResults(double dollarsValue, int dollarActual, int hundreds, int fifties, int twenties,
            int tens, int fives, int ones, int quarters, int dimes, int nickels, int pennies) {
        if (dollarActual < 5)
            System.out.printf(
                    "%n$%.2f sdf can be reduced to %Ones: %d%nQuarters: %d%nDimes: %d%nNickels: %d%nPennies: %d%n%n",
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
