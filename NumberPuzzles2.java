import java.util.Scanner;
public class NumberPuzzles2 {
  public static void main(String args[]) {
    Scanner keyboard = new Scanner(System.in);
    int number;
    do {
      System.out.print("1) Find two digit numbers <= 56 with sums of  digits");
      System.out.println(" > 10");
      System.out.print("2) Find two digit number minus number reversed");
      System.out.println(" which equals sum of digits");
      System.out.println("3) Quit");
      System.out.println("");
      System.out.print(">");
      number = keyboard.nextInt();


    }
    while (number != 3);
  }
  public static void numberOne() {
    if (number == 1) {
      System.out.println();
      for (int a = 1; a <= 5; a ++) {
        for (int b = 0; b <= 6; b ++) {

          if (a + b > 10) {
            System.out.println(a + "" + b);
          }
        }
      }
    }

  }
  public static void numberTwo() {
    // tvåsiffrigt nummer (dvs 10-99) så att numret självt minus
    // numret omvänt ska vara lika med summan av siffrorna.
    // Exempel: 72 - 27 = 45. Dvs. ej lika med 9 (7 + 2 eller 2 + 7 = 9)
    // 10 - 01 = 9
    else if (number == 2) {
      System.out.println();
      for (int i = 1; i <= 9; i ++) {
        for (int j = 0; j <= 9; j ++) {
          if (((i + j) - (j + i))== (i + j)) {
            System.out.println(i + "" + j);
          }
        }
      }
    }

  }
}








import java.util.*;
public class NumberPuzzles2 {
	public static void main(String[] args) {
	int choice;
	while(true) {
		choice = menuOptions();
		if(choice == 1) {
			display();
			System.out.println();
		}
    else if(choice == 2) {
			numPuzzle2();

		}
    else if(choice ==3) {
			break;
		}
    else {
		System.out.println( "Invalid option. Please try again." );
		}
	}
}
	public static void display() {
		for (int tens = 1; tens <= 5; tens++) {
			for (int ones = 0; ones < 10; ones++) {
				if ((tens + ones) > 10 && ((tens * 10) + ones) <= 56)
					System.out.print( tens + "" + ones + "\t");

			}
		}

	}

	public static void numPuzzle2() {
		for ( int tens = 1; tens < 10; tens++) {
			for (int ones = 0; ones < 10; ones++) {
				if (((tens * 10) + ones) - ((ones * 10) + (tens)) == ((tens) + ones))
					System.out.println((tens * 10) + ones);
			}
		}
	}
	public static int menuOptions() {
		Scanner kb = new Scanner(System.in);
		int choice;
		System.out.println();
		System.out.println( "1) Find two digit numbers <= 56 with sums of digits > 10" );
		System.out.println( "2) Find two digit number minus number reversed which equals sum of digits" );
		System.out.println( "3) Quit" );
		System.out.print( "\n> " );
		choice = kb.nextInt();
		return choice;
	}

}
