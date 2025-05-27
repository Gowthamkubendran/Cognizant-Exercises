import java.util.*;
import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int n = r.nextInt(100) + 1;
        int guess;
        int attempts = 0;
        System.out.println("Guess a number between 1 and 100.");
        System.out.println("( The number to guess is " + n + ")");

        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess > n) {
                System.out.println("Too high! Try again.");
            }
            if (guess < n) {
                System.out.println("Too low! Try again.");
            }
            if (guess == n) {
                System.out.println(" Congratulations! You guessed it in " + attempts + " attempts.");
            }

        } while (guess != n);
    }
}
