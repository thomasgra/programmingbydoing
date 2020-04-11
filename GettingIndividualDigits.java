public class GettingIndividualDigits {
  public static void main (String args []) {
    for (int a = 1; a < 10; a ++) {
      for (int b = 0; b <= 9; b ++) {
        int sum = a + b;
        System.out.println(a + "" + b + "," + " " + a + "+" + b + "= " + sum);
      }
    }
  }
}

// public class GettingIndividualDigits {
// 	public static void main(String[] args) {
// 	for(int i=10; i<=99; i++){
//
// 		int j = i%10;
// 		int k = i/10;
// 		int sum = j+k;
// 		System.out.println(i+", "+k+" + "+j+" = "+sum);
// 	}
// 	}
// }
