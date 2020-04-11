import java.util.*;

public class XsAndYs {
  public static void main (String args[]) {
    System.out.println("x \t y");
    System.out.println("-----------------------");

    for (double i = -10; i <= 10; i = i + 0.5) {
      double k = i*i;
      //  double j = Math.sqrt(i);
      System.out.println(i + "\t" + k);
    }
  }
}
