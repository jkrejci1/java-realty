import java.lang.reflect.Array;
import java.util.ArrayList;
import java.io.File;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;

/**
 *  Library style class which takes in the array list of homes and prints a nicely
    formatted report (taking in the home from home reader)
 */
public class HomeLister {

    public static void listHomes(ArrayList<Home> readProperties) {
    	
    	//Give a properly formatted list of homes
       for (Home prop : readProperties) {
    	   //Format for the information of each home object NOT DONE!!!!
            System.out.format("Property %-14s Price: $%,-14.2f Sq. Feet: %-13.2f Beds: %s Baths: %.2f\n", prop.getIdNum(), prop.getPrice(), prop.findArea(), prop.getBed(), prop.getBath());
            System.out.format("%-13s %s, %s, %s, %s\n", "Address", prop.getAddress(), prop.getCity(), prop.getState(), prop.getZip());
            System.out.format("%-13s %s\n", "Description", prop.getDescription());
            System.out.print("Rooms\n");
            
            for (Room rm : prop.getRooms()) {
            	//Format for the information for each room object
            	System.out.format("%2s%-14s %4.1f X %4.1f\n","", rm.getRoom(), rm.getLength(), rm.getWidth());
            }
            System.out.println();
       }
    }
}
