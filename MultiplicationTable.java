public class MultiplicationTable {
  public static void main (String args[]) {
    System.out.println("x  | 1\t2\t3\t4\t5\t6\t7\t8\t9 ");
    System.out.println("===+=================================================================");


    for (int a= 1; a <= 12; a++) {
      
      if (a < 10 )
      System.out.print ( " " + a + " | " );
      else
      System.out.print ( a + " | " );
      for (int b= 1; b <= 9; b++) {

        System.out.print((a * b)+"\t");
      }
      System.out.println();

    }
  }
}
