import java.util.Random;
import java.util.Scanner;
public class ThreeCardMonte {
  public static void main (String args[]) {
    Scanner keyboard = new Scanner(System.in);
    Random r = new Random();
    int choice = 1 + r.nextInt(3);
    System.out.println("You slide up to Fast Eddie's card table and plop down your cash.");
    System.out.println("He glances at you out of the corner of his eye and starts shuffling.");
    System.out.println("He lays down three cards.");
    System.out.println("");
    System.out.println("Which one is the ace?");
    System.out.println("");
    System.out.println("\t## ## ##");
    System.out.println("\t## ## ##");
    System.out.println("\t1  2  3");
    System.out.println("");
    System.out.print("> ");
    int guess = keyboard.nextInt();
    if (guess != choice) {
      System.out.println("");
      System.out.println("Ha! Fast Eddie wins again! The ace was card number " + choice + ".");
      if (choice == 1) {
        System.out.println("");
        System.out.println("\tAA ## ##");
        System.out.println("\tAA ## ##");
        System.out.println("\t1  2  3");
      }
      else if (choice == 2) {
        System.out.println("");
        System.out.println("\t## AA ##");
        System.out.println("\t## AA ##");
        System.out.println("\t1  2  3");
      }
      else if (choice == 3) {
        System.out.println("");
        System.out.println("\t## ## AA");
        System.out.println("\t## ## AA");
        System.out.println("\t1  2  3");
      }
    }
    else {
      System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
      System.out.println("");
      if (choice == 1) {
        System.out.println("");
        System.out.println("\tAA ## ##");
        System.out.println("\tAA ## ##");
        System.out.println("\t1  2  3");
      }
      if (choice == 2) {
        System.out.println("");
        System.out.println("\t## AA ##");
        System.out.println("\t## AA ##");
        System.out.println("\t1  2  3");
      }
      if (choice == 3) {
        System.out.println("");
        System.out.println("\t## ## AA");
        System.out.println("\t## ## AA");
        System.out.println("\t1  2  3");
      }
    }
  }
}
