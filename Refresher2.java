// write the program using only one if statemen, no else. And only one for loop

import java.util.Scanner;
public class Refresher2 {
public static void main (String args[]) {
Scanner keyboard = new Scanner(System.in);
System.out.print("What is your name? ");
String name = keyboard.next();
System.out.println("");
int fra = 10;
if (name.equals("Mitchell")) {
  fra = 5;
}
  for (int i = 1; i <= fra; i ++) {
    System.out.println(name);

  }

}
}
