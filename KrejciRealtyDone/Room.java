import java.io.File;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;

/**
 *  This defines the room class which will list a number of rooms that make up properties;
    every home has an array list of rooms built inside of it (example of ownership).
 */
public class Room {
    private String room;
    private Double length;
    private Double width;

//Getters and Setters for our data

//Room type
public String getRoom() {
   return room;
}
public void setRoom(String room) {
   this.room = room;
}
//Length
public double getLength() {
   return length;
}
public void setLength(double length) {
   this.length = length;
}
//Width
public double getWidth() {
   return width;
}
public void setWidth(double width) {
   this.width = width;
}

//Non default constructors
public Room() {
   room = "";
   length = 0.0;
   width = 0.0;
}

//Default constructors
public Room(String room, double length, double width) {
   setRoom(room);
   setLength(length);
   setWidth(width);
}


/**
 * The toString() function for room that creates the object of a room
 */
@Override
public String toString() {
   return String.format("%s %.2f %.2f", room, length, width);
}

/**
 * Function that gets the area of an individual room 
 * @return: Returns the area of the individual room to findArea() to keep track of square feet of the property
 */
public double getArea() {
	//Multiply length and width and send it back to findArea
	return length * width;
}

}
