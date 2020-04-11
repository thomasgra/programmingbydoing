import java.util.Scanner;

public class AddingValuesForLoop {
  public static void main (String args[]) {

    Scanner keyboard = new Scanner(System.in);

    int sum = 0;
    System.out.print("Number: ");
    int number = keyboard.nextInt();

    for (int i = 1; i <= number; i++) {
      System.out.print(i + " ");
      sum = (i * (i+1)) / 2;
    }
    System.out.println("");
    System.out.println("The total is " + sum + ".");
    System.out.println("");
  }
}
