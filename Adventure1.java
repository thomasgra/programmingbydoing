import java.util.Scanner;
public class Adventure1 {
  public static void main (String args[]) {
    Scanner keyboard = new Scanner(System.in);
    String ans = "";
    System.out.println("WELCOME TO MITCHELL'S TINY ADVENTURE!");
    System.out.println("");
    System.out.println("You are now in a creepy house!  Would you like to go \"upstairs\" or into the \"kitchen\"?");
    System.out.print("> ");
    ans = keyboard.next();
    System.out.println("");
    if (ans.equals("kitchen")) {
      System.out.print("There is a long countertop with dirty dishes everywhere.");
      System.out.print(" Off to one side there is, as you would expect, a refrigerator.");
      System.out.println(" You may open the \"refrigerator\" or look in a \"cabinet\".");
      System.out.print("> ");
      ans = keyboard.next();
      if (ans.equals("refrigerator")) {
        System.out.print("Inside the refrigerator you see food and stuff. It looks pretty nasty.");
        System.out.println("Would you like to eat some of the food? (\"yes\" or \"no\")");
        System.out.print("> ");
        ans = keyboard.next();
        System.out.println("");
        if (ans.equals("yes")) {
          System.out.println("You would die of intoxication...eventually.");
        }
        else if (ans.equals("no")) {
          System.out.println("You die of starvation... eventually.");
        }
      }
      else if (ans.equals("cabinet")) {
        System.out.print("There is some bread in there. Would you like to eat it?");
        System.out.println(" (\"yes\" or \"no\")");
        System.out.print("> ");
        ans = keyboard.next();
        System.out.println("");
        if (ans.equals("yes")) {
          System.out.println("You get full");
        }
        else if (ans.equals("no")) {
          System.out.println("You go hungry");
        }
      }
    }
    else if (ans.equals("upstairs")) {
      System.out.print("Upstairs you see a hallway.  At the end of the hallway is the master");
      System.out.print("\"bedroom\".  There is also a \"bathroom\" off the hallway.  Where would you");
      System.out.println("like to go?");
      System.out.println("");
      System.out.print("> ");
      ans = keyboard.next();
      System.out.println("");
      if (ans.equals("bathroom")) {
        System.out.print("There is a bathtub with water in it. Would you like to jump in?");
        System.out.print("\"yes\" or \"no\"");
        System.out.print("> ");
        ans = keyboard.next();
        System.out.println("");
        if (ans.equals("yes")) {
          System.out.print("You will get clean");
        }
        if (ans.equals("no")) {
          System.out.print("You are still dirty");
        }
      }
      else if (ans.equals("bedroom")) {
        System.out.println("You are in a plush bedroom with a closet. ");
        System.out.println("Wyoud you like to open the door? \"yes\" or \"no\"");
        System.out.print("> ");
        ans = keyboard.next();
        System.out.println("");
        if (ans.equals("yes")) {
          System.out.println("You see a shirt");
        }
        else if (ans.equals("no")) {
          System.out.print("you will never know what was in there");
        }
      }
    }
  }
}
