 import java.util.Scanner;
 public class MoreUserInputOfData {
 public static void main (String args[])  {

Scanner keyboard = new Scanner(System.in);
 System.out.println("Please enter the following information so I can sell it for a profit!");
System.out.println("");


 String firstName, lastName, login;
int grade;
double gpa;
long studentID;
 System.out.print("First name: " );
firstName = keyboard.next();
 System.out.print("Last name: " );
 lastName = keyboard.next();
 System.out.print("Grade (9-12): ");
grade = keyboard.nextInt();
System.out.print("Student ID: " );
studentID = keyboard.nextLong();
System.out.print("Login: " );
login = keyboard.next();
System.out.print("GPA (0.0-4.0): ");
gpa = keyboard.nextDouble();
System.out.println("");
System.out.println("Your information:");
System.out.println("");
System.out.println(" \t\tLogin: "+login);
System.out.println("\t\tid:" + studentID);
System.out.println("\t\tname:" + firstName + lastName);
System.out.println("\t\tGPA:" + gpa);
System.out.println("\t\tGRade:" + grade);

}
}
