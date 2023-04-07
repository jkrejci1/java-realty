import java.io.File;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;

/**
 * Extends the Property class storing what is unique to each property 
 * @author Jack
 *
 */
public class Home extends Property {
    private ArrayList<Room> rooms;
    private double area;
    
    //Get rooms function
    public ArrayList<Room> getRooms() {
    	return rooms;
    }
    //Get/Set Area
    public double getArea() {
    	return area;
    }
    public void setArea(double area) {
    	this.area = area;
    }
    
    //non default constructor
    public Home() {
        rooms = new ArrayList<Room>();
        area = 0;
    }

    //default constructor
    public Home(String id, String addr, String city, String state, String zip, String beds, double baths, double price, String desc) {
        super(id, addr, city, state, zip, beds, baths, price, desc);
        rooms = new ArrayList<Room>();
        setArea(area);
    }


    /**
     * The addRoom function that takes in a room object and adds it to the room list for a single home
     * @param rm: A single room object
     */
    public void addRoom(Room rm) {
        rooms.add(rm);
    }

    /**
     * Function that is used to find the square feet of each property
     * @return: Returns the area of the property
     */
    public double findArea() {
        double roomArea = 0;
        for (Room rm : rooms) {
        	roomArea += rm.getArea();
        }
        return roomArea;
    }

    /**
     * The toString() function for Home that combines property with unique home objects when printing 
     */
    @Override
    public String toString() {
		return String.format("%s %.2f", super.toString(), findArea());
    }

}
