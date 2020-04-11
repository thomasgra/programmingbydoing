import java.util.Scanner;

public class LittleQuiz {
public static void main (String args[]) {
  Scanner keyboard = new Scanner(System.in);
int correct = 0;
System.out.print("Are you ready for a test? ");
String answer = keyboard.next();
if (answer.equals("yes") || (answer.equals("y"))) {
  System.out.println("Okay, here it comes");

}
System.out.println();

System.out.println("01) What is the capitol of Alaska? ");
System.out.println("\t\t 1) Melbourne");
System.out.println("\t\t 2) Anchorache");
System.out.println("\t\t 3) Juneu");
System.out.println();
System.out.println();
System.out.print("> ");
int ans1 = keyboard.nextInt();
if (ans1 == 3) {
  System.out.println("That's correct");
  correct = correct + 1;
}
else {
  System.out.println("Sorry, the correct answer is Juneu");
}

System.out.println();
System.out.println("Q2) Can you store the value \"cat\" in a variable of type int?");
System.out.println("\t\t 1) Yes");
System.out.println("\t\t 2) No");
System.out.println();
System.out.print("> ");
int ans2 = keyboard.nextInt();
if (ans2 == 2) {
  System.out.println("That is correct");
  correct++;
}
else {
  System.out.println("Sorry, \"cat\" is a string. ints can only store numbers.");
}
System.out.println();
System.out.println("Q3) What is the result of 9+6/3?");
System.out.println("\t\t 1) 5");
System.out.println("\t\t 2) 11");
System.out.println("\t\t 3) 15/3");
System.out.print("");
System.out.print("> ");
int ans3 = keyboard.nextInt();
if (ans3 == 2) {
  System.out.println("That's correct");
  correct++;
}
else {
  System.out.println("No, number two is correct");
}
System.out.println();
System.out.println();
System.out.println("Overall, you got " + correct + " out of 3 correct");
System.out.println("Thanks for playing");




}
}
