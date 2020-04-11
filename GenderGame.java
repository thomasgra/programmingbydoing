import java.util.Scanner;
public class GenderGame {
  public static void main (String args[]) {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("What is your gender (M or F)? ");
    String gender = keyboard.next();
    System.out.print("First name: ");
    String firstName = keyboard.next();
    System.out.print("Last name: ");
    String lastName = keyboard.next();
    System.out.print("Age? ");
    int age = keyboard.nextInt();
    System.out.println("");

    // If the person is female and 20 or over, ask if she is married.
    // If so, display "Mrs." in front of her name.
    // If not, display "Ms." in front of her name. If the female is under 20,
    // display her first and last name.


    if (gender.equals("F") && age >= 20) {
      System.out.print("Are you married, " + firstName + " (y or n)? ");
      String ans = keyboard.next();

      if (ans.equals("y")) {
        System.out.println("");
        System.out.println("Then I shall call you Mrs. " + lastName);
      }
      if (ans.equals("n")) {
        System.out.println("");
        System.out.println("Then I shall call you Ms. " + lastName);
      }
    }
    else if (gender.equals("M") && age >= 20) {
      System.out.println("");
      System.out.println("Then I shall call you Mr. " + lastName);
    }
    else if (age < 20) {
      System.out.println("");
      System.out.println("Then I shall call you " + firstName + " " + lastName);

    }

  }
}
