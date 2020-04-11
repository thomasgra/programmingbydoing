// Ask the user for their name. Then display their name to prove that
// you can recall it. Ask them for their age. Then display what their
// age would be five years from now. Then display what their age would
// be five years ago.

import java.util.Scanner;

public class AgeIn5 {
public static void main (String args[]) {
  Scanner keyboard = new Scanner(System.in);

  System.out.print("What is your name? ");
  String name = keyboard.next();
  System.out.print("Hi, " + name + ". How old are you? ");
  int age = keyboard.nextInt();
  System.out.println("Did you know that in five years you will be " + (age + 5) + " years old?");
System.out.println("And five years ago you were " + (age -5) + "! Imagine that!");


}
}
