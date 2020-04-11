import java.util.Scanner;
public class Refresher {
  public static void main (String args[]) {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("What is you name? ");
    String name = keyboard.next();
    if (!name.equals("Mitchell")) {
      for (int i = 1; i <= 5; i++) {
        System.out.println(name);
      }
    }
    else if (name.equals("Mitchell")){
      for (int i = 1; i <= 10; i ++) {
        System.out.println(name);
      }
    }
  }
}
