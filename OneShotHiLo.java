import java.util.Scanner;
import java.util.Random ;
public class OneShotHiLo {
public static void main (String args[]) {
  Random r = new Random();
  int choice = 1 + r.nextInt(100);
  Scanner keyboard = new Scanner(System.in);
  System.out.println("I'm thinking of a number between 1-100.  Try to guess it.");
  System.out.print("> ");
  int guess = keyboard.nextInt();
  if (choice == guess) {
    System.out.println("You guessed it!  What are the odds?!?");
  }
  if (guess < choice) {
    System.out.println("Sorry, you are too low.  I was thinking of " + choice + ".");
  }
  if (guess > choice) {
    System.out.println("Sorry, you are too high. I was thinking of " + choice + ".");
  }
}
}
