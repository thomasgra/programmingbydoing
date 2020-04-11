/* Ask the user for their name. Then display their name to prove that you
can recall it. Ask them for their age. Then display that. Finally, ask
them for how much they make and display that. You should use the most
appropriate data type for each variable. */

/* import java.util.Scanner;
public class NameAgeAndSalary {

 public static void main (String args[]) {

Scanner keyboard = new Scanner(System.in);
// String name;
// int age;
// double salary;

System.out.println("What is your name? ");
String name = keyboard.next();
System.out.print("Hello "+ name);
System.out.println(" How old are you?");
int age = keyboard.nextInt();
System.out.println("So you're "+ age +", eh?  That's not old at all!");
System.out.println("How much do you make, " + name + "?");
double salary = keyboard.nextDouble();
System.out.print(salary + "!");
System.out.println("I hope that's per hour and not per year! LOL!");


}
} */

import java.util.Scanner;
public class NameAgeAndSalary{
	public static void main(String[] args){
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Hello, What is your name?");
	String name = keyboard.next();
	System.out.println("Hi, "+name+"! How old are you?");
	int age = keyboard.nextInt();
	System.out.println("So you're " +age+", eh?  That's not old at all!");
    System.out.println("How much do you make, "+name+"?");
	double salary = keyboard.nextDouble();
	System.out.println(salary+"!  I hope that's per hour and not per year! LOL!");


	}
}
