import java.awt.*;
import javax.swing.JFrame;

public class Circle extends Canvas {
  public void paint (Graphics g) {

// draw a circle
    g.setColor(Color.yellow);
    g.fillOval(160,20,200,200);
  }
  public static void main (String args[]) {
    JFrame win = new JFrame("This is a circle");
    win.setSize(800,600);
    win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Circle canvas = new Circle();
    win.add(canvas);
    win.setVisible(true);
  }

}
