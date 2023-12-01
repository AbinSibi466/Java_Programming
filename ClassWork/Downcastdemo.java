package ClassWork;
/* Java program to demonstrate downcasting */
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
    void displayName(){
        //Method to display name
        System.out.println("Cricket");
    }
}
    
//Creating a child class Football
class Football extends Sport{
    void displayName(){
        //Method to display name
        System.out.println("Football");
    }
}

public class Downcastdemo {
	public static void main (String[] args) {
	    //Parent class reference refers to Child class object
	    Sport sport1 = new Cricket();
	    //Explicitly casting superclass reference to subclass type
	    Cricket cricket = (Cricket) sport1;
	    cricket.displayName();
		sport1.displayName();
	    
	    //Parent class reference refers to Child class object
	    Sport sport2 = new Football();
	    //Explicitly casting superclass reference to subclass type
	    Football football = (Football) sport2;
	    football.displayName();
	}
}