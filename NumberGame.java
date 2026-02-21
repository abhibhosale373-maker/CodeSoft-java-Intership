import java.util.*;

public class NumberGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random num = new Random();

        int number = num.nextInt(100) + 1;
        int guess = 0;

        while (guess != number) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if (guess > number) {
                System.out.println("Too High!");
            } else if (guess < number) {
                System.out.println("Too Low!");
            } else {
                System.out.println("Correct! You guessed it.");
            }

        }
    }
}
