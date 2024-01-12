package labEx8;

import java.util.*;

class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Movie: " + title;
    }
}

class MovieTicketBookingService {
    private List<Movie> movieList;
    private Set<String> theaters;
    private Map<Movie, Integer> ticketPrices;
    private Queue<Movie> bookingQueue;

    public MovieTicketBookingService() {
        this.movieList = new ArrayList<>();
        this.theaters = new HashSet<>();
        this.ticketPrices = new HashMap<>();
        this.bookingQueue = new LinkedList<>();
    }

    public void addMovie(Movie movie) {
        movieList.add(movie);
    }

    public void addTheater(String theater) {
        theaters.add(theater);
    }

    public void setTicketPrice(Movie movie, int price) {
        ticketPrices.put(movie, price);
    }

    public void bookTicket(Movie movie) {
        bookingQueue.offer(movie);
    }

    public Movie cancelBooking() {
        return bookingQueue.poll();
    }

    public void displayMovies() {
        System.out.println("Movies:");
        for (Movie movie : movieList) {
            System.out.println(movie);
        }
    }

    public void displayTheaters() {
        System.out.println("Theaters: " + theaters);
    }

    public void displayTicketPrices() {
        System.out.println("Ticket Prices:");
        for (Map.Entry<Movie, Integer> entry : ticketPrices.entrySet()) {
            System.out.println(entry.getKey().getTitle() + ": $" + entry.getValue());
        }
    }

    public void displayBookingQueue() {
        System.out.println("Booking Queue:");
        for (Movie movie : bookingQueue) {
            System.out.println(movie);
        }
    }
}

public class MovieTicketBookingSystem {
    public static void main(String[] args) {
        MovieTicketBookingService bookingService = new MovieTicketBookingService();

        bookingService.addMovie(new Movie("Inception"));
        bookingService.addMovie(new Movie("The Shawshank Redemption"));
        bookingService.addMovie(new Movie("The Dark Knight"));

        bookingService.addTheater("Cineplex");
        bookingService.addTheater("MoviePlex");

        bookingService.setTicketPrice(new Movie("Inception"), 15);
        bookingService.setTicketPrice(new Movie("The Shawshank Redemption"), 12);
        bookingService.setTicketPrice(new Movie("The Dark Knight"), 18);

        bookingService.bookTicket(new Movie("Inception"));
        bookingService.bookTicket(new Movie("The Shawshank Redemption"));
        bookingService.bookTicket(new Movie("The Dark Knight"));

        bookingService.displayMovies();
        bookingService.displayTheaters();
        bookingService.displayTicketPrices();
        bookingService.displayBookingQueue();

        Movie cancelledMovie = bookingService.cancelBooking();
        System.out.println("Cancelled Movie: " + cancelledMovie);
    }
}
