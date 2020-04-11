import java.util.Scanner;

public class Adventure2 {
	public static void main( String[] args)	{
		Scanner keyboard = new Scanner(System.in);

		int nextroom = 1;
		String choice = "";
		System.out.println("WELCOME TO MITCHELL'S TINY ADVENTURE!");
		System.out.println("");

		while (nextroom != 0) {
			if (nextroom == 1) { // creepy house
				System.out.println("You are now in a creepy house! Would you like to go \"upstairs\" or into the \"kitchen\"?");
				System.out.print("> ");
				choice = keyboard.nextLine();
				if (choice.equals("upstairs")) {
					nextroom = 2;
				}
				else if (choice.equals("kitchen")) {
					nextroom = 3;
				}
				else {
					System.out.println(choice + " wasn't one of the options. Try again.");
				}
			}
			if (nextroom == 2) { // upstairs
				System.out.println("Upstairs you see a hallway.  At the end of the hallway is the master");
				System.out.print("\"bedroom\".  There is also a \"bathroom\" off the hallway.  Where would you");
				System.out.println(" like to go? You can also choose to go \"back\" ");
				System.out.println("");
				System.out.print("> ");
				choice = keyboard.nextLine();
				if (choice.equals("bedroom")) {
					nextroom = 7;
				}
				else if (choice.equals("bathroom")) {
					nextroom = 6;
				}
				else if (choice.equals("back")) {
					nextroom = 1;
				}
				else {
					System.out.println(choice + " wasn't one of the options. Try again." );
				}
			}
			if (nextroom == 3) { // kitchen
				System.out.println("There is a long countertop with dirty dishes everywhere.");
				System.out.print(" Off to one side there is, as you would expect, a refrigerator.");
				System.out.println(" You may open the \"refrigerator\" or look in a \"cabinet\".");
				System.out.println("You can also choose to go \"back\"");
				System.out.print("> ");
				choice = keyboard.nextLine();
				if (choice.equals("refrigerator")) {
					nextroom = 4;
				}
				else if (choice.equals("cabinet")) {
					nextroom = 5;
				}
				else if (choice.equals("back")) {
					nextroom = 1;
				}
				else {
					System.out.println(choice + " wasn't one of the options. Try again.");
				}
			}
			if (nextroom == 4) { // refrigerator
				System.out.println("");
				System.out.print("Inside the refrigerator you see food and stuff. It looks pretty nasty.");
				System.out.println("Would you like to eat some of the food? (\"yes\" or \"no\")");
				System.out.println("You can also choose to go \"back\"");
				System.out.print("> ");
				choice = keyboard.nextLine();
				if (choice.equals("yes")) {
					System.out.println("You get poisioned by harsh food. You die.");
					nextroom = 0;
				}
				else if (choice.equals("no")) {
					System.out.println("You go hungry and with time you die of starvation");
					nextroom = 0;
				}
				else if (choice.equals("back")) {
					nextroom = 3;
				}
				else {
					System.out.println(choice + " wasn't one of the options. Try again.");
				}
			}
			if (nextroom == 5) { // cabinet
				System.out.print("There is some bread in there. Would you like to eat it?");
				System.out.println(" (\"yes\" or \"no\")");
				System.out.println("You can also choose to go \"back\"");
				System.out.print("> ");
				choice = keyboard.nextLine();
				System.out.println("");
				if (choice.equals("yes")) {
					System.out.println("You get poisioned by harsh bread. You die.");
					nextroom = 0;
				}
				else if (choice.equals("no")) {
					System.out.println("You go hungry and with time you die of starvation");
					nextroom = 0;
				}
				else if (choice.equals("back")) {
					nextroom = 3;
				}
				else {
					System.out.println(choice + " wasn't one of the options. Try again.");
				}
			}
			if (nextroom == 6) { // bathroom
				System.out.print("There is a bathtub with water in it. Would you like to jump in? ");
				System.out.print("\"yes\" or \"no\"");
				System.out.println("You can also choose to go \"back\"");
				System.out.print("> ");
				choice = keyboard.nextLine();
				System.out.println("");
				if (choice.equals("yes")) {
					System.out.print("You will get clean. You feel faint at heart.");
					System.out.println("You feel light-headed and you eventually die.");
					nextroom = 0;
				}
				else if (choice.equals("back")) {
					nextroom = 2;
				}
				else if (choice.equals("no")) {
					System.out.print("You are still dirty. The bugs will eat you until dead");
					nextroom = 0;
				}
				else {
					System.out.println(choice + " wasn't one of the options. Try again.");
				}
			}
			if (nextroom == 7) { // bedroom
				System.out.println("You are in a plush bedroom with a closet. ");
				System.out.println("Would you like to open the door? \"yes\" or \"no\"");
				System.out.println("You can also choose to go \"back\"");
				System.out.print("> ");
				choice = keyboard.nextLine();
				System.out.println("");
				if (choice.equals("yes")) {
					System.out.println("You see a shirt");
					System.out.println("Shirt is too small. You die.");
					nextroom = 0;
				}
				else	if (choice.equals("no")) {
					System.out.print("You will never know what was in there.");
					nextroom = 0;
				}
				else if (choice.equals("back")) {
					nextroom = 2;
				}
				else {
					System.out.println(choice + " wasn't one of the options. Try again.");
				}
			}
		}
		System.out.println("\nThe game is over. The next episode can be");
		System.out.println("downloaded for only 800 Microsoft points!");
	}
}
