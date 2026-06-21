import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(100) + 1;
        int guess;
        int attempts = 0;
        int maxAttempts = 5;

        System.out.println("Welcome To Number Guess");
        System.out.println("Enter a number between 1 to 100");
        System.out.println("You have " + maxAttempts + " attempts.");

        while (attempts < maxAttempts) {

            System.out.println("Enter your guess:");
            guess = sc.nextInt();

            attempts++;

            if (guess == number) {
                System.out.println("Congratulations! You guessed the correct number.");
                System.out.println("You guessed it in " + attempts + " attempts.");
                return;
            }
            else if (guess > number) {
                System.out.println("Too High!");
            }
            else {
                System.out.println("Too Low!");
            }
        }

        System.out.println("Game Over!");
        System.out.println("The correct number was: " + number);

        sc.close();
    }
}