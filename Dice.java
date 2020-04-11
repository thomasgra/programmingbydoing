import java.util.Random;
public class Dice {
public static void main (String args[]) {
Random r = new Random();
System.out.println("Here comes the dice");
System.out.println("");
int diceOne = 1 + r.nextInt(6);
int diceTwo = 1 + r.nextInt(6);
int total = diceOne + diceTwo;
System.out.println("Roll #1: " + diceOne);
System.out.println("Roll #2: " + diceTwo);
System.out.println("The total is " + total + ".");
}
}
