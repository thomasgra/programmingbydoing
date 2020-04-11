import java.util.Scanner;


public class ForgetfulMachine {

public static void main (String args[]) {
Scanner keyboard = new Scanner(System.in);
String word,word2;
int value1,value2;

System.out.print( "Give me a word " );
word = keyboard.next();

System.out.print( "Give me a second word " );
word2 = keyboard.next();

System.out.print("Whats your favourite number ");
value1 = keyboard.nextInt();

System.out.print( "Whats your second favourite number " );
value2 = keyboard.nextInt();

}
}
