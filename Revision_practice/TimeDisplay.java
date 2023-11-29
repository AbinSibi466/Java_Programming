package Revision_practice;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeDisplay {
    public static void main(String[] args) {
        // Get the current time
        Date now = new Date();

        // Format the time
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String formattedTime = sdf.format(now);

        // Display the formatted time
        System.out.println("Current time: " + formattedTime);
    }
}
