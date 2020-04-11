// Use nested for loops to generate a list of all the pairs of positive
// two digit numbers whose sum is 60, and whose difference is 14.
public class NumberPuzzles1 {
  public static void main (String args[]) {

    for (int x = 0; x < 50; x++) {

      for (int y = 0; y < 50; y ++) {

        if ((x + y) == 60 && (x - y) == 14) {
          System.out.println(x + "," + y);
        }
      }
    }
  }
}
