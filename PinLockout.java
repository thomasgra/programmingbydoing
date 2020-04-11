import java.util.Scanner;

public class PinLockout {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		int pin = 12345;
		int tries = 0;

		System.out.println("WELCOME TO THE BANK OF MITCHELL.");
		System.out.print("ENTER YOUR PIN: ");
		int entry = keyboard.nextInt();
		final int MAX_TRIES = 4;
		 tries++;

		while (entry != pin && tries < MAX_TRIES) {
			System.out.println("INCORRECT PIN. TRY AGAIN.");
			System.out.print("ENTER YOUR PIN: ");
			entry = keyboard.nextInt();
			tries++;
		}

		if (entry == pin) {
			System.out.println("PIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
		}
		else if (tries >= MAX_TRIES) {
			System.out.println("YOU HAVE RUN OUT OF TRIES. ACCOUNT LOCKED.");
		}
	}
}
