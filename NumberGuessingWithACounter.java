import java.util.*;

public class NumberGuessingWithACounter {
  public static void main (String args[]) {
    // Modify your previous number-guessing game so that they can guess
    // until they get it right AND count the number of tries it takes them to guess it.
    Random r = new Random();
    int choice = r.nextInt(10);
    int tries = 0;
    Scanner keyboard = new Scanner(System.in);
    tries = tries + 1;
    System.out.println("I'm thinking of a number from 0-10. Try to guess it.");
    System.out.print("Your guess: ");
    int guess = keyboard.nextInt();
    while (guess != choice) {
      System.out.println("That was wrong. Try again.");
      System.out.print("Your guess: ");
      guess = keyboard.nextInt();
      tries = tries + 1;
    }
    System.out.println("You guessed right! It took you " + tries + " tries.");
  }
}
