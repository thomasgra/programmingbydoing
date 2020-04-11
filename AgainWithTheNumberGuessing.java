import java.util.*;
public class AgainWithTheNumberGuessing {

public static void main(String args[]) {

  Random r = new Random();
  int choice = r.nextInt(10);
  int tries = 0;
  Scanner keyboard = new Scanner(System.in);
  tries = tries + 1;
  System.out.println("I'm thinking of a number from 0-10. Try to guess it.");
  System.out.print("Your guess: ");
  int guess = keyboard.nextInt();

do {
  System.out.println("That was wrong. Try again.");
  System.out.print("Your guess: ");
  guess = keyboard.nextInt();
  tries = tries + 1;


}

  while (guess != choice);


  System.out.println("You guessed right! It took you " + tries + " tries.");
}
}

import java.util.*;
public class AgainWithTheNumberGuessing{
	public static void main(String[] args){
	Scanner keybaord = new Scanner(System.in);
	Random r = new Random();
	int actual= r.nextInt(10);
	System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
	int tries=1;
	System.out.print("Your guess: ");
	int guess = keybaord.nextInt();
	do{
		if(guess!=actual){
			System.out.println("That is incorrect. Guess again.");
			System.out.print("Your guess: ");
			guess = keybaord.nextInt();
			tries++;
		}
	}while(guess!=actual);
			System.out.println("That's right! You're a good guesser.");
			System.out.println("It took you "+tries+" tries.");
	}
}
