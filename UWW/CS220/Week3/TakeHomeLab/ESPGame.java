package Week3.TakeHomeLab;

import javax.swing.JOptionPane;
import java.util.Random;

public class ESPGame {
    public static void main(String[] args) {
        String userInput = "";
        String[] colors = {"Red", "Green", "Blue", "Yellow", "Purple"};
        //Loop for the user to enter a color until 'quit' is entered
        while(!userInput.equalsIgnoreCase("quit")){
            System.out.println("Colors Availiable: Red, Green, Blue, Yellow, Purple  ");
            userInput = JOptionPane.showInputDialog("Enter a color: ");
            
        }
        

    }

    public static int randomColor(){
        Random rand = new Random();
        int randomNum = rand.nextInt(5) + 1;
        return randomNum;
    }
}
