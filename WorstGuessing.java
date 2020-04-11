import java.util.Scanner;
public class WorstGuessing {
public static void main (String args[]) {
int var = 4;
Scanner keyboard = new Scanner(System.in);
System.out.print("I'm thinking of a number from 1-10. You have one guess: ");
int guess = keyboard.nextInt();
if (guess == var) {
  System.out.println("You guessed the right number");
}
  else if (guess < 1 || guess > 10) {
    System.out.println("You can only guess between 1-10");
  }
  else {
    System.out.println("That was wrong");
  }


}
}
