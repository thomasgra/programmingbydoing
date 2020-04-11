import java.util.Scanner;

public class BMICalc {
public static void main(String args[]) {
Scanner keyboard = new Scanner(System.in);
System.out.print("Your height (feet only): ");
int feet = keyboard.nextInt();
System.out.print("Your height (inches): ");
double inches = keyboard.nextDouble();
System.out.print("Your weight in pounds: ");
int weight = keyboard.nextInt();
System.out.println("");
// double bmi = (weight/(height*height));
double inm = (height/39.370079);
double pikg = (weight/2.2046);
double MetricBMI = (pikg/(inm*inm));
System.out.println("Your BMI is " + MetricBMI);



}
}
