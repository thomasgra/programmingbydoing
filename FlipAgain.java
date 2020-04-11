import java.util.Random;
import java.util.Scanner;

public class FlipAgain {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		Random rng = new Random();

		String again;
		// FlipAgain2 does not compile because variable is inside the
		// while expression. It may be cases when your while or else condition will not be fulfilled
		// and in that case variable again is left un-initialized and Local variables
		// cannot be used without initialization so simply initialize that variable

		do {
			int flip = rng.nextInt(2);
			String coin;

			if (flip == 1) {
				coin = "HEADS";
			}
			else {
				coin = "TAILS";
			}
			System.out.println("You flip a coin and it is... " + coin);

			System.out.print("Would you like to flip again (y/n)? ");
			again = keyboard.next();
		}
		while (again.equals("y"));
	}
}
