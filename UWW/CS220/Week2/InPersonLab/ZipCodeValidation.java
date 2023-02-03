package Week2.InPersonLab;

import javax.swing.JOptionPane;

public class ZipCodeValidation {

    public static void main(String[] args) {
        // Use JOptionPane class to create an input dialog box for user input zip code
        String userInput = JOptionPane.showInputDialog("Enter a zip code; we will validate it for you.");
        boolean validInput = false;
        // Use a loop to have the user re-enter the zip code until the entered code is
        // valid, or enter q/Q to quit
        if(userInput.equalsIgnoreCase("Q"))
            System.out.println("Sucessfully Quit Program.");
        while (validInput | !userInput.equalsIgnoreCase("Q")) {
            
            if (userInput.length() == 5 ) {
                char[] charArray = new char[userInput.length()];
                int numCharValid = 0;
                for (int i = 0; i < userInput.length(); i++) {
                    charArray[i] = userInput.charAt(i);
                }

                for (char ca : charArray) {
                    if (Character.isDigit(ca))
                        numCharValid++;
                }
                if (numCharValid == 5) {
                    validInput = true;
                    break;
                } else {
                    System.out.printf("%s is an invalid zip code! Invalid Character!%n", userInput);
                    userInput = JOptionPane.showInputDialog("Enter a zip code; we will validate it for you.");
                }

            } else {
                System.out.printf("%s is an invalid zip code! Too Long or Too Short!%n", userInput);
                userInput = JOptionPane.showInputDialog("Enter a zip code; we will validate it for you.");
            }
            
        }
        // Print out validation result for each user inputted zip code in loop
        if (validInput)
            System.out.printf("%s is a valid zip code!", userInput);
        


    }
}
