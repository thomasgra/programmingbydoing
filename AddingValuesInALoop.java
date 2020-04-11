import java.util.Scanner;

public class AddingValuesInALoop {
  public static void main (String args[]) {

    Scanner keyboard = new Scanner(System.in);

    System.out.println("I will add up the numbers you give me.");
    int total = 0;
    int number = 0;
    System.out.print("Number: ");
    number = keyboard.nextInt();
    total = number + total;
    while (number != 0) {
      System.out.println("The total so far is " + total);
      System.out.print("Number: ");
      number = keyboard.nextInt();
      total = number + total;
    }
    System.out.println("");
    System.out.println("The total is " + total);


  }
}
