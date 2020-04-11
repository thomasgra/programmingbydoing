import java.util.Scanner;
public class AlphabeticalOrder {
public static void main (String args[]) {
  String name = "";
  Scanner keyboard = new Scanner(System.in);
  System.out.print("What's your last name? ");
  name = keyboard.next();
  if ("Carswell".compareTo(name) >= 0) {
    System.out.println("");
    System.out.println("you don't have to wait long, " + name);
  }
  else if ("Jones".compareTo(name) >= 0) {
    System.out.println("");
    System.out.println("that's not bad, " + name);
  }
  else if ("Smith".compareTo(name) >= 0) {
    System.out.println("");
    System.out.println("looks like a bit of a wait, " + name);
  }
  else if ("Young".compareTo(name) >= 0) {
    System.out.println("");
    System.out.println("it's gonna be a while, " + name);
  }
  else if ("Young".compareTo(name) < 0) {
    System.out.println("");
    System.out.println("not going anywhere for a while, " + name);
  }
  else {
    System.out.println("errir");
  }


}
}
