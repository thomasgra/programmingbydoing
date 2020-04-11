import java.util.Scanner;

public class AskingQuestions {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);

		int age;
		int height;
		double  weight;
		int weightInInches;

		System.out.print( "How old are you? " );
		age = keyboard.nextInt();

		System.out.print( "How many feet tall are you? " );
		height = keyboard.nextInt();

		System.out.print("How many inches are you? ");
		weightInInches = keyboard.nextInt();

		System.out.print( "How much do you weigh? " );
		weight = keyboard.nextDouble();

		System.out.println( "So you're " + age + " old, " + height +"'"+ weightInInches +"\"  tall and " + weight + " heavy." );
	}
}
