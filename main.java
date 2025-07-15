import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numberToGuess = (int) (Math.random() * 50) + 1;
        int attempts = 0;
        int maxAttempts = 7;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess the number between 1 and 50. You have " + maxAttempts + " attempts!");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == numberToGuess) {
                System.out.println("Correct! You guessed the number in " + attempts + " attempts.");
                return;
            } else if (guess < numberToGuess) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }
        }

        System.out.println("You've used all " + maxAttempts + " attempts. The number was: " + numberToGuess);
        scanner.close();
    }
}
