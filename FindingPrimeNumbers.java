public class FindingPrimeNumbers {
public static void main(String args[]) {
	int tries = 0;
  for (int i = 2; i <= 99; i ++) {

    if (isPrime(i)) {
      System.out.println(i +" <=");
			tries ++;
    }
else {
  System.out.println(i);
  }
}
System.out.println("There are " + tries + " prime numbers between 1 and 100");

}
public static boolean isPrime(int n) {
   for (int i = 2; i <= n/2; i++) {
  if (n % i == 0) {
    return false;
  }
}
 return true;
}
}
