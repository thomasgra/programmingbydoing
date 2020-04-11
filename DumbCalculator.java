// Make a simple numeric calculator. It should prompt the user for
// three numbers. Then add the numbers together and divide by 2. Display
// the result. Your program must support numbers with decimals and not just
// integers.

 import java.util.Scanner;
public class DumbCalculator {
public static void main (String args[]) {
Scanner keyboard = new Scanner(System.in);

System.out.print("What is your first number? ");
int firstNum = keyboard.nextInt();
System.out.print("What is your second number? ");
int secondNum = keyboard.nextInt();
System.out.print("What is your third number? ");
int thirdNum = keyboard.nextInt();
int sum = (firstNum + secondNum + thirdNum) / 2;
System.out.println("");
System.out.print("( " + firstNum + " + " + secondNum + " + " + thirdNum + " ) / (2 is... " + sum +  ") ");
}
}
