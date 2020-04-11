import java.util.Scanner;

public class CountingMachineRevisited {
  public static void main (String args[]) {

    Scanner keyboard = new Scanner(System.in);
    System.out.print("Count from: ");
    int countFrom = keyboard.nextInt();
    System.out.print("Count to: ");
    int countTo = keyboard.nextInt();
    System.out.print("Count by: ");
    int countBy = keyboard.nextInt();

    for (int i = countFrom; i <= countTo; i = i + countBy) {
      System.out.print(i + " ");
    }
  }
}
