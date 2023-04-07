import java.io.File;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;

/**
 *  Library style class responsible for creating the home objects including the array 
    list of homes created inside of each home object (read data from homes.txt and creates 
    a home object and adds it to an array list.
 */
public class HomeReader {
    
   public static ArrayList<Home> readHomesFromTextFile(String fname) {
		//Create the array list used and read the file to get information
      try {
         ArrayList<Home> home = new ArrayList<Home>();
         String line;
         String[] parts;
         Scanner fsc = new Scanner(new File(fname));
         Home currentHome = null;
         Room createRoom = null;

         while (fsc.hasNextLine()) {
             line = fsc.nextLine();
             parts = line.split("\t");

             //If the first part of the line is the indication for an id create a home
             if (parts[0].trim().length() != 0) {
                //Create the home and add it to the home array
                currentHome = new Home(parts[0], parts[1], parts[2], parts[3], parts[4], parts[5], Double.parseDouble(parts[6]), Double.parseDouble(parts[7]), parts[8]);
                home.add(currentHome);
             } else {
               //Otherwise you need to build the rooms
               //Create the room and add it to the room array of a home
               createRoom = new Room(parts[1], Double.parseDouble(parts[2]), Double.parseDouble(parts[3]));
               currentHome.addRoom(createRoom);
             } 
               
         }
         
         fsc.close();
         return home;
     } catch(Exception ex) {

         return null;
     }


	}

}
