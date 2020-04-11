import java.util.Scanner;

public class HowOldAreYou2 {
  public static void main (String args[]) {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Hej, what is your name? ");
    String name = keyboard.next();
    System.out.print("Okay, " + name + ", how old are you?");
    int age = keyboard.nextInt();

    if (age < 16) {
      System.out.println("You can not drive, " + name);
    }
    // 16 to 17. you can drive but not vote.
    else if (age >= 16 && age <= 17) {
      System.out.println("You can drive but not vote, " + name);
    }
    // 18 to 24. You can vote but not rent a car.
    else if (age >=18 && age <=24) {
      System.out.println("You can vote but not rent a car," + name);
    }
    // 25 or older. You can do pretty much anything.
    else {
      System.out.println("You can do anything that is legal " + name);
    }






  }


}
