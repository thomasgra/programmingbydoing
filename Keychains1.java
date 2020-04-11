import java.util.Scanner;

public class Keychains1 {
  public static void main (String args[]) {

    Scanner keyboard = new Scanner(System.in);
    System.out.println("Ye Olde Keychain Shoppe");
    System.out.println("");
    System.out.println("1. Add Keychains to Order");
    System.out.println("2. Remove Keychains from Order");
    System.out.println("3. View Current Order");
    System.out.println("4. Checkout");
    System.out.println("");
    System.out.print("Please enter your choice: ");
    int choice = keyboard.nextInt();

    while (choice != 4) {
      if (choice == 1) {
        add_keychains();

      }
      else if (choice == 2) {
        remove_keychains();
      }
      else if (choice == 3) {
        view_order();
      }
      System.out.println("1. Add Keychains to Order");
      System.out.println("2. Remove Keychains from Order");
      System.out.println("3. View Current Order");
      System.out.println("4. Checkout");
      System.out.println("");
      System.out.print("Please enter your choice: ");
      choice = keyboard.nextInt();

    }
    System.out.println("");
    checkout();
  }

  // Below are functions for the four menu options

  public static void add_keychains() {
    System.out.println("");
    System.out.println("ADD KEYCHAINS");
    System.out.println("");
  }

  public static void remove_keychains() {
    System.out.println("");
    System.out.println("REMOVE KEYCHAINS");
    System.out.println("");
  }

  public static void view_order() {
    System.out.println("");
    System.out.println("VIEW ORDER");
    System.out.println("");
  }
  public static void checkout() {
    System.out.println("CHECKOUT");
  }
}
