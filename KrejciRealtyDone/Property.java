import java.io.File;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;

/**
 *  This is the property superclass which contains all the characteristics 
    that can be used to describe ALL KINDS of properties (not uniqueness).
 */
public class Property {
    //Create provate data members for the basics of what all properties have
    private String idNum;
    private String description;
    private String address;
    private String state;
    private String city;
    private String zipCode;
    private double baths;
    private String beds;
    private double price;
   
    //Generate getters and setters for all

    //Id
    public String getIdNum() {
       return idNum;
    }
    public void setIdNum(String idNum) {
       this.idNum = idNum;
    }

    //Description
    public String getDescription() {
       return description;
    }
    public void setDescription(String description) {
       this.description = description;
    }
    
    //Address
    public String getAddress() {
       return address;
    }
    public void setAddress(String address) {
       this.address = address;
    }

    //State
    public String getState() {
       return state;
    }
    public void setState(String state) {
      this.state = state;
    }

    //City
    public String getCity() {
       return city;
    }
    public void setCity(String city) {
       this.city = city;
    }

    //Zip Code
    public String getZip() {
       return zipCode;
    }
    public void setZip(String zipCode) {
       this.zipCode = zipCode;
    }

    //Baths
    public double getBath() {
       return baths;
    }
    public void setBath(double baths) {
       this.baths = baths;
    }

    //Beds
    public String getBed() {
      return beds;
   }
   public void setBed(String beds) {
      this.beds = beds;
   }

    //Price
    public double getPrice() {
       return price;
    }
    public void setPrice(double price) {
       this.price = price;
    }

    //Set non default constructor
    public Property() {
      idNum = "";
      description = "";
      address = "";
      state = "";
      city = "";
      zipCode = "";
      beds = "";
      baths = 0.0;
      price = 0;
    }

    //Set default constructor
    public Property(String idNum, String address, String city, String state, String zipCode, String beds, double baths, double price, String description) {
       setIdNum(idNum);
       setDescription(description);
       setAddress(address);
       setState(state);
       setCity(city);
       setZip(zipCode);
       setBath(baths);
       setBed(beds);
       setPrice(price);
   
    }

    /**
     * The toString() function for Property that creates a property object
     */
    @Override
    public String toString() {
       return String.format("%s %s %s %s %s %s %.2f %.2f %s", idNum, address, city, state, zipCode, beds, baths, price, description);
    }
}
