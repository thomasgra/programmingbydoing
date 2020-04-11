import java.util.Scanner;

public class DisplayingSomeMultiples {

  public static void main (String args[]) {

    Scanner keyboard = new Scanner(System.in);
    System.out.print("Choose a number: ");
    int number = keyboard.nextInt();
    System.out.println("");
    for (int i = 1; i <= 12; i ++) {


      int total = number * i;
      System.out.println(number + "x" + i +" = " + total);
    }
  }
}
