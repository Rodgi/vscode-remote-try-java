package Week3.TakeHomeLab;

import javax.swing.JOptionPane;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
public class ESPGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput = "";
        String[] colors = {"Red", "Green", "Blue", "Yellow", "Purple"};
        int red = 0;
        int green = 0;
        int blue = 0;
        int yellow = 0;
        //Loop for the user to enter a color until 'quit' is entered
        while(!userInput.equalsIgnoreCase("quit")){
            System.out.println("Colors Availiable: Red, Green, Blue, Yellow, Purple  ");
            //userInput = JOptionPane.showInputDialog("Enter a color: ");
            userInput = input.nextLine();
            


        }

        

    }

    public static int randomColor(){
        Random rand = new Random();
        int randomNum = rand.nextInt(5) + 1;
        return randomNum;
    }
}
