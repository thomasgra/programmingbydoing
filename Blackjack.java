import java.util.Random;
import java.util.Scanner;
public class Blackjack {
public static void main (String args[]) {
  Random rn = new Random();
Scanner keyboard = new Scanner(System.in);
int card1 = 2 + rn.nextInt(10);
  int card2 = 2 + rn.nextInt(10);

  int dealer1 = 2 + rn.nextInt(10);
  int dealer2 = 2 + rn.nextInt(10);
  int total = card1 + card2;
  int total2 = dealer1 + dealer2;
  System.out.println("Welcome to Mitchell's blackjack program!");

  System.out.println("You get " + card1 + " and a " + card2);
  System.out.println("Your total is " + total + ".");
  System.out.println("");
  System.out.println("The dealer has a " + dealer1 + " showing and a hidden card");
  System.out.println("His total is hidden, too.");
  System.out.println("");
  System.out.print("Would you like to \"hit\" or  \"stay\"? ");
  String answer = keyboard.next();

  do {
    int card3 = 2 + rn.nextInt(10);
    if ((card3 + total) > 11) {
      // break;
    }


System.out.println("You drew a " + card3 + ".");
System.out.println("Your total is " + (card3 + total) + ".");
System.out.println("");
System.out.print("Would you like to \"hit\" or  \"stay\"? ");
answer = keyboard.next();

}
while (answer.equals("hit"));
// while ((card3 + total) > 11);







  if (total > total2) {
      System.out.println("");
    System.out.println("YOU WIN!");
  }
  else {
      System.out.println("");
    System.out.println("YOU LOSE!");
  }
}
}
