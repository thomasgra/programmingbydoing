import java.util.Random;
public class FortuneCookie {
public static void main (String args[]) {
Random r = new Random();
int choice = r.nextInt(6);

String fortune = "";

// add randomly-chosen lotto numbers to the fortune.
// Lotto chooses 6 numbers, each from 1-54.

if (choice == 0) {
  fortune = "The fortune will come.";

}
else if (choice == 1) {
  fortune = "Eat doritos";
}
else if (choice == 2) {
  fortune = "Drink water";
}
  else if (choice == 3) {
  fortune = "Lunch will come your way";
}
else if (choice == 4) {
  fortune = "Brocolis are good";
}
else if (choice == 5) {
  fortune = "TNT Boys";
}
System.out.println("Fortune cookie says: " + fortune);
System.out.print(1 + r.nextInt(54) + " - ");
System.out.print(1 + r.nextInt(54) + " - ");
System.out.print(1 + r.nextInt(54) + " - ");
System.out.print(1 + r.nextInt(54) + " - ");
System.out.print(1 + r.nextInt(54) + " - ");
System.out.print(1 + r.nextInt(54) + "  ");
System.out.println("");


}
}
