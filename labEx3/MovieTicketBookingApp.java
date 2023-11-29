package labEx3;

// Abstract class representing a general ticket
abstract class Ticket {
    private String movieName;
    private String showTime;
    private double price;

    // Constructor
    public Ticket(String movieName, String showTime, double price) {
        this.movieName = movieName;
        this.showTime = showTime;
        this.price = price;
    }

    public abstract double calculatePrice();

    public String getMovieName() {
        return movieName;
    }

    public String getShowTime() {
        return showTime;
    }

    public double getPrice() {
        return price;
    }
}

// Concrete class representing a standard ticket
class StandardTicket extends Ticket {
    public StandardTicket(String movieName, String showTime, double price) {
        super(movieName, showTime, price);
    }

    @Override
    public double calculatePrice() {
        return getPrice();
    }
}

final class VIPTicket extends Ticket {
    private String specialService;

    public VIPTicket(String movieName, String showTime, double price, String specialService) {
        super(movieName, showTime, price);
        this.specialService = specialService;
    }

    @Override
    public double calculatePrice() {
        return getPrice() * 1.5;
    }

    public String getSpecialService() {
        return specialService;
    }
}

public class MovieTicketBookingApp {
    public static void main(String[] args) {
        StandardTicket standardTicket = new StandardTicket("Movie 1", "8:00 PM", 10.0);
        System.out.println("Standard Ticket - Price: $" + standardTicket.calculatePrice());

        VIPTicket vipTicket = new VIPTicket("Movie 2", "9:30 PM", 15.0, "Exclusive Lounge Access");
        System.out.println("VIP Ticket - Price: $" + vipTicket.calculatePrice() + " - Special Service: " + vipTicket.getSpecialService());
    }
}

