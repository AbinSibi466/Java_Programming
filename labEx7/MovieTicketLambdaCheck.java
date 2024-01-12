// package labEx7;
// Interface to represent a check on ticket availability
interface TicketAvailability {
    boolean checkAvailability(Movie movie, int numberOfTickets);
}

// Movie class with modifications
class Movie {
    private String title;
    private int availableTickets;

    public Movie(String title, int availableTickets) {
        this.title = title;
        this.availableTickets = availableTickets;
    }

    public String getTitle() {
        return title;
    }

    public int getAvailableTickets() {
        return availableTickets;
    }
}

public class MovieTicketLambdaCheck {
    public static void main(String[] args) {
        // Creating Movie instances
        Movie avengersEndgame = new Movie("Avengers: Endgame", 100);
        Movie joker = new Movie("Joker", 50);

        // Lambda expressions to check ticket availability
        TicketAvailability enoughTicketsCheck = (movie,  numberOfTickets) -> movie.getAvailableTickets() >= numberOfTickets;
        TicketAvailability popularMovieCheck = (movie, numberOfTickets) -> movie.getTitle().equals("Avengers: Endgame");

        // Checking ticket availability
        int numberOfTicketsToBook = 2;

        System.out.println("Enough tickets available for Avengers: Endgame? " + enoughTicketsCheck.checkAvailability(avengersEndgame, numberOfTicketsToBook));
        System.out.println("Enough tickets available for Joker? " + enoughTicketsCheck.checkAvailability(joker, numberOfTicketsToBook));

        System.out.println("Is Avengers: Endgame a popular movie? " + popularMovieCheck.checkAvailability(avengersEndgame, numberOfTicketsToBook));
        System.out.println("Is Joker a popular movie? " + popularMovieCheck.checkAvailability(joker, numberOfTicketsToBook));
    }
}