import java.util.Scanner;

public class Keychains2 {
  public static void main (String args[]) {

    Scanner keyboard = new Scanner(System.in);
    int currentNumberOfKeychains = 0;
    int k = 0, price = 10, keychains = 0, temp = 0;

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
        keychains = add_keychains(keychains);
      }

      else if (choice == 2) {
        keychains = remove_keychains(keychains);
      }

      else if (choice == 3) {
        view_order(keychains, price);
      }

      System.out.println("1. Add Keychains to Order");
      System.out.println("2. Remove Keychains from Order");
      System.out.println("3. View Current Order");
      System.out.println("4. Checkout");
      System.out.println("");
      System.out.print("Please enter your choice: ");
      choice = keyboard.nextInt();

    }

    checkout(keychains, price);
  }

  // Below are functions for the four menu options

  public static int add_keychains(int k) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("");
    System.out.print("You have " + k + " keychains. How many to add? ");
    int temp = keyboard.nextInt();
    k = k + temp;

    System.out.println("You now have "+ k + " keychains. ");
    System.out.println("");
    return k;
  }

  public static int remove_keychains(int k) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("");
    System.out.print("You have " + k +" keychains. How many to remove? ");
    int temp = keyboard.nextInt();
    k = k - temp;
    System.out.println("You now have " + k + " keychains.");
    System.out.println("");
    return k;
  }

  public static void view_order(int k, int p) {
    System.out.println("");
    System.out.println("You have " + k + " keychains");

    System.out.println("Keychains cost $" + p + " each.");
    System.out.println("Total cost is $" + (k*p) + ".");
    System.out.println("");
  }

  public static void checkout(int k, int p) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("");
    System.out.println("CHECKOUT");
    System.out.println("");
    System.out.print("What is your name? ");
    String name = keyboard.next();
    System.out.println("You have " + k + " keychains.");
    System.out.println("Keychains cost $ " + p + " each. ");
    System.out.println("Total cost is $" + (k * p) + ".");
    System.out.println("Thanks for your order, " + name + "!");
  }
}
