import java.util.*;

class RandomNo {
    private int numRandom; 

    public RandomNo() {
        Random rand = new Random();
        numRandom = rand.nextInt(100);
    }

    public void playGame() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter your guess between 0 and 99:");
            int numGuessed = sc.nextInt();

            if (numGuessed == numRandom) {
                System.out.println("Guessed Successfully");
                break;
            } else {
                System.out.println("Try again.");
                System.out.println("The random number was: " + numRandom);
            }
        }

        System.out.println("The random number was: " + numRandom);
    }

    public static void main(String[] args) {
        RandomNo game = new RandomNo ();
        game.playGame();
    }
}
