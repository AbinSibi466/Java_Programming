package labEx6;

import java.util.ArrayList;
import java.util.List;

// Generic class representing a booking item
class BookingItem<T> {
    private T item;

    public BookingItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "BookingItem{" +
                "item=" + item +
                '}';
    }
}

// Generic interface for booking-related operations
interface BookingOperations<T> {
    void bookItem(T item);
    void cancelBooking(T item);
}

// Generic class for managing a collection of booking items
class BookingManager<T extends BookingItem<S>, S> implements BookingOperations<T> {
    private List<T> bookingItems;

    public BookingManager() {
        this.bookingItems = new ArrayList<>();
    }

    public void addItemToInventory(T item) {
        bookingItems.add(item);
    }

    public void displayInventory() {
        System.out.println("Booking Inventory:");
        for (T item : bookingItems) {
            System.out.println(item);
        }
    }

    @Override
    public void bookItem(T item) {
        System.out.println("Booking: " + item);
        // Implement booking logic here
    }

    @Override
    public void cancelBooking(T item) {
        System.out.println("Canceling Booking: " + item);
        // Implement cancel booking logic here
    }
}

// Example usage
public class MovieTicketBookingExample {
    public static void main(String[] args) {
        // Creating booking items for movies
        BookingItem<Movie> movieBookingItem1 = new BookingItem<>(new Movie("Inception", "Sci-Fi"));
        BookingItem<Movie> movieBookingItem2 = new BookingItem<>(new Movie("The Dark Knight", "Action"));

        // Creating a booking manager for movie tickets
        BookingManager<BookingItem<Movie>, Movie> movieBookingManager = new BookingManager<>();

        // Adding items to the inventory
        movieBookingManager.addItemToInventory(new BookingItem<>(new Movie("Interstellar", "Sci-Fi")));
        movieBookingManager.addItemToInventory(movieBookingItem1);
        movieBookingManager.addItemToInventory(movieBookingItem2);

        // Displaying the inventory
        movieBookingManager.displayInventory();

        // Booking and canceling bookings
        movieBookingManager.bookItem(movieBookingItem1);
        movieBookingManager.cancelBooking(movieBookingItem2);

        // Displaying the updated inventory
        movieBookingManager.displayInventory();
    }
}

// Class representing a movie
class Movie {
    private String title;
    private String genre;

    public Movie(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}

