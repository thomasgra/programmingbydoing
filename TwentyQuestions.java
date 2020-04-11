import java.util.Scanner;
public class TwentyQuestions {
  public static void main (String args[]) {
    Scanner keyboard = new Scanner(System.in);
    String ans = "";
    String ans2 = "";
    //  String squirrel, moose, carrot, watermelon, paperclip, camaro;
    System.out.println("TWO QUESTIONS!");
    System.out.println("Think of an object, and I'll try to guess it.");
    System.out.println("");
    System.out.println("Question 1) Is it animal, vegetable, or mineral?");
    System.out.print("> ");
    ans = keyboard.next();
    System.out.println("");
    System.out.println("Question 2) Is it bigger than a breadbox?");
    System.out.print("> ");
    ans2 = keyboard.next();
    if (ans2.equals("yes")) {
      if  (ans.equals("animal")) {
        System.out.println("My guess is that you are thinking of a moose");
      }
      else if (ans.equals("vegetable")) {
        System.out.println("My guess is that you are thinking of a watermelon");
      }
      else if (ans.equals("mineral")) {
        System.out.println("My guess is that you're thinking of a camaro");
      }
}

    else if (ans2.equals("no")) {
        if (ans.equals("animal")) {
          System.out.println("My guess is that you are thinking of a squirrel");
        }

        else if (ans.equals("vegetable")) {
          System.out.println("my guess is that you are thinking of a carrot");
        }


        else if (ans.equals("mineral")) {
          System.out.println("My guess is that you are thining of a paperclip");
        }
      }



  System.out.println("I would ask you if im right but i dont actually care");
}
}
