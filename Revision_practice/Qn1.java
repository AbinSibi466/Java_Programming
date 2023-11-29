package Revision_practice;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Qn1 {
    public static void main(String[] args) {
        Date currentTime = new Date();

        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");

        String formattedTime = timeFormat.format(currentTime);

        System.out.println("Current Time: " + formattedTime);
    }
}