package Week3.TakeHomeLab;

import javax.swing.JOptionPane;
import java.util.Random;
import java.util.Arrays;

public class ESPGame {
    static int redCount = 0;
    static int greenCount = 0;
    static int blueCount = 0;
    static int yellowCount = 0;
    static int purpleCount = 0;
    static int compRedCount = 0;
    static int compGreenCount = 0;
    static int compBlueCount = 0;
    static int compYellowCount = 0;
    static int compPurpleCount = 0;

    public static void main(String[] args) {
        String[] colors = { "red", "green", "blue", "yellow", "purple" };
        String compColor;
        String userColor = "";
        while (!userColor.equalsIgnoreCase("quit")) {
            userColor = JOptionPane.showInputDialog(
                    "Guess a color: Red, Green, Blue, Yellow, or Purple. Or enter 'quit' terminate game.");

            if (userColor.equalsIgnoreCase("quit")) {
                System.out.println("Thanks for playing!");
                break;
            }
            userColor = userColor.toLowerCase();
            while (!Arrays.asList(colors).contains(userColor)) {
                System.out.println("Invalid Input!\n");
                userColor = JOptionPane.showInputDialog(
                        "Guess a color: Red, Green, Blue, Yellow, or Purple. Or enter 'quit' terminate game.");
                userColor = userColor.toLowerCase();
                if (userColor.equalsIgnoreCase("quit")) {
                    System.out.println("Thanks for playing!");
                    break;
                }

            }

            if (!userColor.equalsIgnoreCase("quit")) {
                compColor = colors[randomColor() - 1];
                countCalc(userColor);
                compCountCalc(compColor);
                printResults(userColor, compColor);
            }

        }
        finalDisplay();

    }

    public static void game() {

    }

    public static void finalDisplay() {
        System.out.println("Color\t\tComputer\t\tUser");
        System.out.println("Red\t\t" + compRedCount + "\t\t\t" + redCount);
        System.out.println("Green\t\t" + compGreenCount + "\t\t\t" + greenCount);
        System.out.println("Blue\t\t" + compBlueCount + "\t\t\t" + blueCount);
        System.out.println("Yellow\t\t" + compYellowCount + "\t\t\t" + yellowCount);
        System.out.println("Purple\t\t" + compPurpleCount + "\t\t\t" + purpleCount);
    }

    public static int randomColor() {
        Random rand = new Random();
        int randomNum = rand.nextInt(5) + 1;
        return randomNum;
    }

    public static void printResults(String userColor, String compColor) {
        System.out.println("The color is " + compColor);
        System.out.println("You guessed " + userColor);
        System.out.println();
        System.out.println();
    }

    public static void countCalc(String userColor) {
        if (userColor.equalsIgnoreCase("red")) {
            redCount++;
        } else if (userColor.equalsIgnoreCase("green")) {
            greenCount++;
        } else if (userColor.equalsIgnoreCase("blue")) {
            blueCount++;
        } else if (userColor.equalsIgnoreCase("yellow")) {
            yellowCount++;
        } else if (userColor.equalsIgnoreCase("purple")) {
            purpleCount++;
        }
    }

    public static void compCountCalc(String compColor) {
        if (compColor.equalsIgnoreCase("red")) {
            compRedCount++;
        } else if (compColor.equalsIgnoreCase("green")) {
            compGreenCount++;
        } else if (compColor.equalsIgnoreCase("blue")) {
            compBlueCount++;
        } else if (compColor.equalsIgnoreCase("yellow")) {
            compYellowCount++;
        } else if (compColor.equalsIgnoreCase("purple")) {
            compPurpleCount++;
        }
    }

}
