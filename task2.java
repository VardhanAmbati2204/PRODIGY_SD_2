import java.util.Scanner;
import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        int numberOfAttempts = 0;
        int guess = 0;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have generated a random number between 1 and 100.");
        System.out.println("Try to guess it!");

        while (guess != randomNumber) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            numberOfAttempts++;

            if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + numberOfAttempts + " attempts.");
            }
        }
    }
}
