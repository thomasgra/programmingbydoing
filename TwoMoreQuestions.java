import java.util.Scanner;
public class TwoMoreQuestions {
public static void main (String args[]) {
Scanner keyboard = new Scanner(System.in);
String ans1, ans2;
System.out.println("Two more questions");
System.out.println("");
System.out.println("Think of something and I'll try to guess it");
System.out.println("");
System.out.print("Question 1) Does it stay inside or outside or both? ");
ans1 = keyboard.next();
System.out.print("Question 2) Is it a living thing? ");
ans2 = keyboard.next();
if (ans1.equals("inside") && ans2.equals("yes")) {
  System.out.println("");
  System.out.println("My guess is houseplant.");
}
if (ans1.equals("outside") && ans2.equals("yes")) {
  System.out.println("");
  System.out.println("My guess is bison.");
}
if (ans1.equals("both") && ans2.equals("yes")) {
  System.out.println("");
  System.out.println("My guess is cat");
}
if (ans1.equals("inside") && ans2.equals("no")) {
  System.out.println("");
  System.out.println("My guess is curtain");
}
if (ans1.equals("outside") && ans2.equals("no")) {
  System.out.println("");
  System.out.println("My guess is billboard");
}
if (ans1.equals("both") && ans2.equals("no")) {
  System.out.println("");
  System.out.println("My guess is cellphone");
}


}
}
