import java.util.Random;

public class BabyBlackjack {
  public static void main (String args[]) {
    Random rn = new Random();


    int card1 = 1 + rn.nextInt(10);
    int card2 = 1 + rn.nextInt(10);
    int dealer1 = 1 + rn.nextInt(10);
    int dealer2 = 1 + rn.nextInt(10);
    int total = card1 + card2;
    int total2 = dealer1 + dealer2;
    System.out.println("Baby Blackjack!");
    System.out.println("");
    System.out.println("You drew " + card1 + " and " + card2);
    System.out.println("Your total is " + total);
    System.out.println("");
    System.out.println("The dealer has " + dealer1 + " and " + dealer2);
    System.out.println("Dealer's total is " + total2);


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
