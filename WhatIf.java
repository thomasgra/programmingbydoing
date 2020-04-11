public class WhatIf {
public static void main (String args[]) {

int people = 20;
int cats = 20;
int dogs = 15;
if (people < cats) {
  System.out.println("Too many cats");
  }
if (people > cats) {
  System.out.println("Not many cats");
}
if (people < dogs) {
  System.out.println("Too many dogs");
}
if (people > dogs) {
  System.out.println("Not many dogs");
}
dogs += 5;
if (people >= dogs) {
  System.out.println( "People are greater than or equal to dogs." );
		}
    if ( people <= dogs ) {

			System.out.println( "People are less than or equal to dogs." );
		}

		if ( people == dogs ) {

			System.out.println( "People are dogs." );
		}
}
}
