package Week1.Labs;


import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.NoSuchElementException;
public class TakeHomeLab1 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        //Questions about video games 

        //Most played game
        String mostPlayed;
        //Developed Game
        String developedGame;
        //Amount of hours
        double hoursPlayed;
        //Achievement % Completed
        int achievementCompleted;
        //Games owned
        int gamesOwned;

        try {
            // Asks user for most played game as a String
            System.out.println("What is your most played game?");
            mostPlayed = scnr.nextLine();
            if(mostPlayed.length() == 0){
                System.out.println("String can't be left blank!");
                System.exit(1);
            }
            // Asks user for the developer of the game as a String
            System.out.println("Who developed this game?");
            developedGame = scnr.nextLine();
            if(developedGame.length() == 0){
                System.out.println("String can't be left blank!");
                System.exit(1);
            }
            // Asks user for amount of hours played as a double
            System.out.println("How many hours have you played?");
            hoursPlayed = scnr.nextDouble();
            if(hoursPlayed < 0){
                System.out.println("Can't have negative playtime!");
                System.exit(1);
            }
            // Asks user for achievement completion % as an int
            System.out.println("What is your % of achievement completed?");
            achievementCompleted = scnr.nextInt();
            if(achievementCompleted < 0){
                System.out.println("Can't have negative achivement percentage!");
                System.exit(1);
            }
            System.out.println("How many games do you own?");
            gamesOwned = scnr.nextInt();
            if(gamesOwned < 0){
                System.out.println("Can't have negative games owned!");
                System.exit(1);
            }
            printInfo(mostPlayed, developedGame, hoursPlayed, achievementCompleted, gamesOwned);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Try again!");
            System.exit(1);
        } catch (NoSuchElementException | IllegalStateException e) {
            System.out.println("Can not find input or something wrong with Scanner object!");
            System.exit(1);
        }

        scnr.close();

    }

    public static void printInfo(String game, String dev, double hours, int achieve, int owned) {
        String defGame = "Minecraft";
        String defDev = "Mojang";
        double defHours = 527.15;
        int defAchievement = 88;
        int defGamesOwned = 104;
        System.out.printf("%n%nYour most played game is %s. This game was developed by %s. You have played %.2f hours in this game. %nYou have completed %d%% of this game. You own %d games.%n%n", game, dev, hours, achieve, owned);
        System.out.printf("My most played game is %s. This game was developed by %s. I have played %.2f hours in this game. %nI have completed %d%% of this game. I own %d games.%n%n", defGame, defDev, defHours, defAchievement, defGamesOwned);
        
        if(game.equalsIgnoreCase(defGame))
            System.out.printf("Both of us have %s as our most played game!%n", defGame);
        if(dev.equalsIgnoreCase(defDev))
            System.out.printf("Both of our most played games were made by the same game developer, %s%n",defDev);
        if(hours == defHours)
            System.out.printf("Both of us have the same %.2f hours in the game%n",defHours);
        if(achieve == defAchievement)
            System.out.printf("Both of us have completed %d%% of the game!%n",defAchievement);
        if(owned == defGamesOwned)
            System.out.printf("We both own %d games!%n",defGamesOwned);
    }

}