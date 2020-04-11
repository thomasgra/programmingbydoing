// Print all Armstrong numbers between 0-999 using nested for-loops
// For example an Armstrong number is 153 since 1³ + 5³ + 3³ = 153

public class ArmstrongNumbers {

  public static void main(String args[]) {

    int n, i, k;

    for (n = 1; n < 10; n ++) {
      for (i = 0; i < 10; i ++) {
        for (k = 0; k < 10; k ++) {

        if ((Math.pow(n, 3) + Math.pow(i, 3) + Math.pow(k, 3)) == ((n * 100) + (i * 10) + k)) {
            System.out.println(((n * 100) + (i * 10) + k));
        }

      }
    }

  }
}
}
