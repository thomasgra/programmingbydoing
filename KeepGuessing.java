import java.util.*;

public class KeepGuessing {
  public static void main (String args[]) {

    Random r = new Random();
    int choice = r.nextInt(10);
    Scanner keyboard = new Scanner(System.in);
    System.out.println("I'm thinking of a number from 0-10. Try to guess it.");
  System.out.print("Your guess: ");
    int guess = keyboard.nextInt();
    while (guess != choice) {
      System.out.println("That was wrong. Try again.");
      System.out.print("Your guess: ");
      guess = keyboard.nextInt();
    }
    System.out.println("You guessed right!");
    }
  }
