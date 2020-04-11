import java.util.*;
public class RightTriangleChecker {
  public static void main(String args[]) {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter three integers:");
    System.out.print("Side 1: ");
    int intOne = keyboard.nextInt();
    System.out.print("Side 2: ");
    int intTwo = keyboard.nextInt();

    while (intTwo < intOne) {
      System.out.println(intTwo + " is smaller than " + intOne + ". Try again.");
      System.out.print("Side 2: ");
      intTwo = keyboard.nextInt();
    }
    System.out.print("Side 3: ");
    int intThree = keyboard.nextInt();
    while (intThree < intTwo) {
      System.out.println(intThree + " is smaller than " + intTwo + ". Try again.");
      System.out.print("Side 3: ");
      intThree = keyboard.nextInt();
    }
    System.out.println("");
    System.out.println("Your three sides are " + intOne + " " + intTwo + " " + intThree);
    int total = intOne*intOne + intTwo*intTwo;
    double s3 = Math.sqrt(total);
    if (s3 == intThree) {
      System.out.println("These sides *do* make a right triangle.  Yippy-skippy!");
    }
    else {


      System.out.println("NO!  These sides do not make a right triangle!");
    }
  }
}
