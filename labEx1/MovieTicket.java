package labEx1;

public class MovieTicket {
    // Data members
    private String movieName;
    private String theaterName;
    private String showTime;
    private double ticketPrice;
    private int numberOfTickets;

    public MovieTicket() {
        movieName = "adfdff";
        theaterName = "fadff";
        showTime = "dfdf";
        ticketPrice = 100.0;
        numberOfTickets = 2;
    }

    public MovieTicket(String movieName, String theaterName, String showTime, double ticketPrice, int numberOfTickets) {
        this.movieName = movieName;
        this.theaterName = theaterName;
        this.showTime = showTime;
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }

    public MovieTicket(String movieName, String theaterName) {
        this(movieName, theaterName, "Unknown", 0.0, 0);
    }

    public void displayMovieTicketDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Theater Name: " + theaterName);
        System.out.println("Show Time: " + showTime);
        System.out.println("Ticket Price: $" + ticketPrice);
        System.out.println("Number of Tickets: " + numberOfTickets);
    }

    public double calculateTotalPrice() {
        return ticketPrice * numberOfTickets;
    }

    public double calculateTotalPrice(int discountPercentage) {
        double discountedPrice = ticketPrice * (1.0 - discountPercentage / 100.0);
        return discountedPrice * numberOfTickets;
    }

    public double calculateTotalPrice(int numAdults, int numChildren, double childDiscountPercentage) {
        double totalPrice = (ticketPrice * numAdults) + (ticketPrice * (1.0-childDiscountPercentage/100) * numChildren);
        return totalPrice;
    }

    public static void main(String[] args) {
        MovieTicket ticket1 = new MovieTicket("Inception", "Cineplex Odeon", "5:00 PM", 10.0, 3);
        MovieTicket ticket2 = new MovieTicket("The Matrix", "Regal Cinemas");

        ticket1.displayMovieTicketDetails();
        System.out.println("Total Price for 3 Tickets: $" + ticket1.calculateTotalPrice());
        System.out.println();

        ticket2.displayMovieTicketDetails();
        System.out.println("Total Price for 2 Adults and 3 Children with 20% Discount: $"
                + ticket2.calculateTotalPrice(20));
    }
}
