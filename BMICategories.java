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
    String answer = "";
    System.out.println("Your BMI is " + bmi);
    System.out.println();
if (bmi < 15.0) {
answer = "You are very severely underweight";
}
if (bmi >= 15.0 && bmi <= 16.0) {
answer = "You are severly underweight"; //  System.out.println("You are severely underweight");
}
if ((bmi >= 16.1) && (bmi <= 18.4)) {
  answer = "You are underweight"; //System.out.println("You are underweight");
}
if ((bmi >= 18.5) && (bmi <= 24.9)) {
answer = "You are normal weight"; //  System.out.println("You are normal weight");
}
if ((bmi >= 25.0) && (bmi <= 29.9)) {
answer = "you are overweight"; //  System.out.println("You are overweight");
}
if ((bmi >= 30.0) && (bmi <= 34.9)) {
  answer = "You are moderately obese"; //System.out.println("You are moderately obese");
}
if ((bmi >= 35.0) && (bmi <= 39.9)) {
answer = "You are severly obese"; //  System.out.println("You are severly obese");
}
if (bmi >= 40.0) {
  answer = " You are very severly obese"; //System.out.println("You are very severly obese");
}
System.out.println(answer);
  }
}
