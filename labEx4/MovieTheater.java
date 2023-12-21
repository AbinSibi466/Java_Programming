package labEx4;
// File: movieticketbooking/MovieTheater.java

public class MovieTheater implements Movie, Theater {
    @Override
    public void displayDetails() {
        // Implementation to display movie details
        System.out.println("Movie details displayed");
    }

    @Override
    public void bookTicket() {
        // Implementation to book a movie ticket
        System.out.println("Ticket booked successfully");
    }
}