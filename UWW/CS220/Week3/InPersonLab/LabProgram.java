package Week3.InPersonLab;

import java.util.Scanner;

public class LabProgram {
   /* Define your method here */
   public static void sortArray(int[] myarr, int arrSize) {
      // Sorts the array in descending order
      for (int i = 0; i < arrSize; i++) {
         for (int j = i + 1; j < arrSize; j++) {
            if (myarr[i] < myarr[j]) {
               int temp = myarr[i];
               myarr[i] = myarr[j];
               myarr[j] = temp;
            }
         }
      }
      // Prints the array
      for (int s : myarr) {
         System.out.println(s + ",");
      }
      System.out.println();
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int arrSize = scnr.nextInt();
      int[] myarr = new int[arrSize];

      for (int i = 0; i < arrSize; ++i) {
         myarr[i] = scnr.nextInt();
      }
      sortArray(myarr, arrSize);
      scnr.close();

   }
}
