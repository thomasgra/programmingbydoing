import java.util.Scanner;

public class BabyNim {
  public static void main(String args[]) {

    Scanner keyboard = new Scanner(System.in);
    int pileA = 3, pileB = 3, pileC = 3;

    String pile = "";
    while (pileA > 0 || pileB > 0 || pileC > 0) {
      System.out.println("A: " + pileA +	" B: " + pileB +	" C: " + pileC);
      System.out.println("");
      System.out.print("Choose a pile: ");
      pile = keyboard.next();
      System.out.println("");
      System.out.print("How many to remove from pile " + pile + ": ");
      int removed = keyboard.nextInt();
      if (pile.equals("A")) {
        pileA = pileA - removed;
        System.out.println("");
      }
      else if (pile.equals("B")) {
        pileB = pileB - removed;
        System.out.println("");
      }
      else if (pile.equals("C")) {
        pileC = pileC - removed;
        System.out.println("");
      }
      if (pileA <= 0 && pileB <= 0 && pileC <= 0) {
        System.out.println("A: " + pileA +	" B: " + pileB +	" C: " + pileC);
        System.out.println("");
        System.out.println("All piles are empty. Good job!");
      }
    }
  }
}
