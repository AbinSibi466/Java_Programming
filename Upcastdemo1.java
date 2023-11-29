/* Java program to demonstrate upcasting */
import java.io.*;
import java.util.*;

//Creating a parent class Sport
class Sport{
    //Method to display name
    void displayName(){
        System.out.println("Sport");
    }
}

//Creating a child class Cricket
class Cricket extends Sport{
    //Method to display name
    void displayName(){
        System.out.println("Cricket");
    }
}
    
//Creating a child class Football
class Football extends Sport{
    //Method to display name
    void displayName(){
        System.out.println("Football");
    }
}

public class Upcastdemo1 {
	public static void main (String[] args) {
	    //Upcasting
	    Sport sport1 = new Cricket();
	    //calling method
	    sport1.displayName();
	    
	    //Upcasting
	    Sport sport2 = new Football();
	    //calling method
	    sport2.displayName();
	}
}