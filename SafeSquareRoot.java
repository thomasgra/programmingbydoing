// import java.util.Math;
import java.util.*;

public class SafeSquareRoot {
  public static void main(String args[]) {

    Scanner keyboard = new Scanner(System.in);
    System.out.println("Square root.");
    System.out.print("Enter a number: ");
    int number = keyboard.nextInt();
  while (number < 0) {
    System.out.println("You can not take a square root of a negative number");
    System.out.print("Try again: ");
    number = keyboard.nextInt();
  }
    System.out.println("The squareroot of " + number + " is " + Math.sqrt(number));
  }
}
