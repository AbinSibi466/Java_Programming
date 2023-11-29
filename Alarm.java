import java.util.Scanner;

class Alarm2 {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }
    public void register(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int phone = sc.nextInt();
System.out.println("Number:"+phone);
}
    public void visualize() {
        System.out.println("Visualization: " + message);
    }

    public void checkTemperature(int temperature) {
        if (temperature > 150) {
            setMessage("Danger: High Temperature Detected! Temperature is above 150.");
        } else {
            setMessage("Temperature is within safe limits.");
        }
    }
}

public class Alarm{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Alarm2 alarmSystem = new Alarm2 ();

        System.out.print("Enter the current temperature: ");
        int temperature = scanner.nextInt();
        alarmSystem.register();
        alarmSystem.checkTemperature(temperature);
        alarmSystem.visualize();
    }
}