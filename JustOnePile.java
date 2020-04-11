import java.util.Scanner;

public class JustOnePile {
public static void main(String args[]) {

Scanner keyboard = new Scanner(System.in);
int a = 0, b = 3, c = 3;
int counter1 = 0;
int removed = 0;
int x = 0;
System.out.println("A: 3");


while (a != 3) {
  System.out.println("");
System.out.print("How many to remove from pile A: ");
a = keyboard.nextInt();
if (a == 0) {
  System.out.println("");
System.out.println("A: " + (x = a - 0));
}

  if (a == 1) {
    System.out.println("");
  System.out.println("A: " + (x = a - 1));
  }
  if (a == 2) {
    System.out.println("");
  System.out.println("A: " + (x = a - 2));
  }

  if (a == 3) {
    System.out.println("");
  System.out.println("A: " + (x = a - 3));
  }

}
System.out.println("All piles are empty. Good job!");

}
}
