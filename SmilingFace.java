import java.awt.*;
import javax.swing.JFrame;

public class SmilingFace extends Canvas {
  public void paint (Graphics g) {

// draw a circle
    g.setColor(Color.yellow);
    g.fillOval(200,100,400,400);

    // draw eyes
    g.setColor(Color.blue);
    g.fillOval(325,225,50,50);
    g.fillOval(450,225,50,50);

    // draw a mouth
    g.setColor(Color.red);
    g.drawArc(300,400,150,50,180,200);
    // labels
    // g.setColor(Color.black);
    // g.setFont(new Font(null));
    // for ( int X=0; X<800; X += 50 )
    //     g.drawString( String.valueOf(X), X, 50 );
    // for ( int Y=100; Y<600; Y += 50 )
    //     g.drawString( String.valueOf(Y), 28, Y );
    // // lines
    // g.setColor(Color.lightGray);
    // for ( int X=0; X<800; X += 50 )
    //     g.drawLine(X,0,X,599);    // horizontal
    // for ( int Y=0; Y<600; Y += 50 )
    //     g.drawLine(0,Y,799,Y);    // vertical

  }
  public static void main (String args[]) {
    JFrame win = new JFrame("This is a circle");
    win.setSize(800,600);
    win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    SmilingFace canvas = new SmilingFace();
    win.add(canvas);
    win.setVisible(true);
  }

}
