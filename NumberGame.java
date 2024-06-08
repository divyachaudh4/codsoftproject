import java.util.Scanner;
import java.util.Random;

 class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1; // Generate a random number between 1 and 100
        int attempts = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a random number between 1 and 100. Try to guess it!");

        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            
            attempts++;

            if (guess == secretNumber) {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You've guessed the number " + secretNumber + " correctly in " + attempts + " attempts.");
            } else if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        scanner.close();
    }
}
