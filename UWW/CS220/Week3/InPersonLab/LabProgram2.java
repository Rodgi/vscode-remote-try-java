package Week3.InPersonLab;

import java.util.Scanner;

public class LabProgram2 {
    /* Define your method here */
    public static int getWordFrequency(String[] wordsList, int listSize, String currWord) {

        // Loops through a list of words and counts the number of times each word
        // appears
        int count = 0;
        for (int i = 0; i < listSize; i++) {
            if (wordsList[i].equalsIgnoreCase(currWord)) {
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numWords = scnr.nextInt();
        String[] wordsList = new String[numWords];

        for (int i = 0; i < numWords; ++i) {
            wordsList[i] = scnr.next();
        }

        for (int i = 0; i < numWords; i++) {
            System.out.println(wordsList[i] + " " + getWordFrequency(wordsList, numWords, wordsList[i]));
        }

        scnr.close();
    }

}
