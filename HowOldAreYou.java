import java.util.Scanner;

public class HowOldAreYou {
public static void main (String args[]) {
  Scanner keyboard = new Scanner(System.in);
System.out.print("Haj, what is your name? ");
String name = keyboard.next();
System.out.print("Okay, " + name + " what is your age? ");
int age = keyboard.nextInt();

if (age < 16) {
System.out.println("You can not drive, " + name);
}
if (age < 18) {
  System.out.println("You can not vote, " + name);
}
if (age < 25) {
  System.out.println("You can not rent a car, " + name);
}
if (age > 25) {
  System.out.println("You can do anything that is legal, " + name);
}


}
}
