public class CompareToChallenge {
  public static void main (String args []) {

    // You must have five examples which result in a number less than 0,
    // five examples which result in a number greater than 0, and two examples
    // which give you exactly 0. This means you need a total of twelve examples.

    System.out.print("Comparing \"cat\" with \"catfish\" produces ");
    int i = "Jones".compareTo("Jones");
    System.out.println(i);
    System.out.print("Comparing \"ape\" with \"zebra\" produces ");
    int j = "ape".compareTo("zebra");
    System.out.println(j);
    System.out.print("Comparing \"honey\" with \"honeybee\" produces ");
    int k = "honey".compareTo("honeybee");
    System.out.println(k);
    System.out.print("Comparing \"Ape\" with \"ape\" produces ");
    int l = "Ape".compareTo("ape");
    System.out.println(l);
    System.out.print("Comparing \" cat\" with \"cat\" produces ");
    int m = " cat".compareTo("cat");
    System.out.println(m);
    System.out.print("Comparing \"dog\" with \"dog\" produces ");
    int n = "dog".compareTo("dog");
    System.out.println(n);
    System.out.print("Comparing \"god\" with \"god\" produces ");
    int o = "god".compareTo("god");
    System.out.println(o);
    System.out.print("Comparing \"ball\" with \"great\" produces ");
    int p = "ball".compareTo("great");
    System.out.println(p);
    System.out.print("Comparing \"umbral\" with \"brass\" produces ");
    int q = "umbral".compareTo("brass");
    System.out.println(q);
    System.out.print("Comparing \"zoo\" with \"almond\" produces ");
    int r = "zoo".compareTo("almond");
    System.out.println(r);
    System.out.print("Comparing \"rascal\" with \"citrus\" produces ");
    int s = "rascal".compareTo("citrus");
    System.out.println(s);
    System.out.print("Comparing \"rope\" with \"caviar\" produces ");
    int t = "rope".compareTo("caviar");
    System.out.println(t);

  }
}
