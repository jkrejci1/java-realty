/*
Jack Krejci 
Realty Program Assignment
Object Oriented Programming
Klump
*/

import java.io.File;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;

/**
 *  This is the MAIN CLASS which asks the user of the file, and use HomeReader and HomeLister
    to generate a report based on the information given.
 */
public class RealityRealty {
    
   /**
    * Main Function to get the file name and use home reader and home lister classes to generate a report
    * @param args
    */
   public static void main(String[] args) {
      //Bring in the new scanner to be used when asking for file
      Scanner sc = new Scanner(System.in);
      String fname;
      //Ask the user for the file that they want to generate their report for
      System.out.print("Enter name of homes database: ");
      fname = sc.nextLine();

      //Title for the home data
      System.out.println("\n********************************* HOMES CURRENTLY FOR SALE *********************************\n");

      //Call the home reader class to give the file name to it to create the report
      ArrayList<Home> readProperties = HomeReader.readHomesFromTextFile(fname);

      //Call the home lister class to display the report
      HomeLister.listHomes(readProperties);
   }
}
