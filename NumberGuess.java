import java.util.*;
public class NumberGuess {
  public static void main (String args[]) {
    Random r = new Random();
    int choice = r.nextInt(10);
    Scanner keyboard = new Scanner(System.in);
    System.out.print("I'm thinking of a number from 0-10. You have one guess: ");
    int guess = keyboard.nextInt();
    if (guess == choice) {
      System.out.println("You guessed the right number");
    }
    else if (guess < 0 || guess > 10) {
      System.out.println("You can only guess between 0-10");
    }
    else {
      System.out.println("That was wrong");
    }
  }
}
