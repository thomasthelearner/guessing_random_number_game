import java.util.Random;
import java.util.Scanner;

public class RandomlyGuess {

    private int exactNumber;

    public RandomlyGuess() {
        Random rand = new Random(); // use the constructor from the Random library
        exactNumber = rand.nextInt(100)+1; // Random from 1 to 100
    }

    public static void main(String[] args) {
        RandomlyGuess ans = new RandomlyGuess();
        Scanner s = new Scanner(System.in);
        //loop game
        while (true) {
        //scan user's input
        System.out.println("Enter your guess (1-100): ");
        int userGuess = s.nextInt();

            //condition to win the game
            if (userGuess > ans.exactNumber) {
                System.out.println("It's too big. Try again");

            } else if (userGuess < ans.exactNumber) {
                System.out.println("It's too small. Try again");
            } else {
                System.out.println("Excellent! You win!");
                break;
            }
        }
        s.close();
    }
}
