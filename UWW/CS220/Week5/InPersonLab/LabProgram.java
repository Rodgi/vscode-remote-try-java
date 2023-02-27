package Week5.InPersonLab;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class LabProgram {
    public static void main(String[] args) throws IOException {
        Scanner scnr = new Scanner(System.in);

        String fileName = scnr.nextLine();

        FileInputStream fileByteStream = null; // File input stream
        Scanner inFS = null; // Scanner object
        String fileData;
        String[] fileDataArray;
        String movieTitle;
        String movieRating;
        String movieShowtime;

        // Try to open file
        fileByteStream = new FileInputStream(fileName);
        inFS = new Scanner(fileByteStream);

        ArrayList<String> movies = new ArrayList<String>();

        while (inFS.hasNextLine()) {
            fileData = inFS.nextLine();
            fileDataArray = fileData.split(",");
            movieShowtime = fileDataArray[0];
            movieTitle = fileDataArray[1];
            movieRating = fileDataArray[2];
            String movie = String.format("%-44.44s | %5s | %s ", movieTitle, movieRating, movieShowtime);
            movies.add(movie);

        }
        // Compare all the movie titles in the array list, if there are movie titles
        // with the same name, add the showtimes to the first movie title and remove the
        // second movie title
        // Sort the showtimes in ascending order for the same movie

        for (int i = 0; i < movies.size(); i++) {
            for (int j = i + 1; j < movies.size(); j++) {
                if (movies.get(i).substring(0, 44).equals(movies.get(j).substring(0, 44))) {
                    String showtimes = movies.get(i).substring(55)  + movies.get(j).substring(55);
                    String[] showtimesArray = showtimes.split(" ");
                    for (int k = 0; k < showtimesArray.length; k++) {
                        for (int l = k + 1; l < showtimesArray.length; l++) {
                            if (showtimesArray[k].compareTo(showtimesArray[l]) > 0) {
                                String temp = showtimesArray[k];
                                showtimesArray[k] = showtimesArray[l];
                                showtimesArray[l] = temp;
                            }
                        }
                    }
                    String showtimesSorted = "";
                    for (int k = 0; k < showtimesArray.length; k++) {
                        showtimesSorted += showtimesArray[k] + " ";
                    }
                    
                    System.out.println("-" + showtimesSorted + "-");
                    movies.set(i, movies.get(i).substring(0, 55) + showtimesSorted);
                    movies.remove(j);
                }

            }

        }
        for (int i = 0; i < movies.size(); i++) {
            for (int j = i + 1; j < movies.size(); j++) {
                if (movies.get(i).substring(0, 44).equals(movies.get(j).substring(0, 44))) {
                    String showtimes = movies.get(i).substring(55)  + movies.get(j).substring(55);
                    String[] showtimesArray = showtimes.split(" ");
                    for (int k = 0; k < showtimesArray.length; k++) {
                        for (int l = k + 1; l < showtimesArray.length; l++) {
                            if (showtimesArray[k].compareTo(showtimesArray[l]) > 0) {
                                String temp = showtimesArray[k];
                                showtimesArray[k] = showtimesArray[l];
                                showtimesArray[l] = temp;
                            }
                        }
                    }
                    String showtimesSorted = "";
                    for (int k = 0; k < showtimesArray.length; k++) {
                        showtimesSorted += showtimesArray[k] + " ";
                    }
                    
                    System.out.println("-" + showtimesSorted + "-");
                    movies.set(i, movies.get(i).substring(0, 55) + showtimesSorted);
                    movies.remove(j);
                }

            }
        }
        for (String movie : movies) {
            //For each movie in the array list, remove the trailing spaces
            System.out.println(movie.trim());

        }
        
        fileByteStream.close();
        inFS.close();
        scnr.close();
    }
}