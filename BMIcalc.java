import java.util.Scanner;

public class BMICategories {
public static void main(String args[]) {
Scanner keyboard = new Scanner(System.in);
System.out.print("Your height in m: ");
double height = keyboard.nextDouble();
System.out.print("Your weight in kg: ");
int weight = keyboard.nextInt();
System.out.println("");
double bmi = (weight/(height*height));
System.out.println("Your BMI is " + BMI);

}
}
