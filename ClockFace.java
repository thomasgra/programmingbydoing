import java.awt.*;
import javax.swing.JFrame;

public class ClockFace extends Canvas {
  public void paint (Graphics g) {

    // draw the face of the clock
    g.setColor(Color.black);
    g.drawOval(200,100,400,400);

    // draw the middle of the clock
    g.setColor(Color.lightGray);
    g.fillOval(387,287,25,25);

    // draw the two "hands"
    g.setColor(Color.black);
    g.fillRect(397,300,6,185);
    g.fillRect(400,297,90,5);

    // draw four numbers, 12, 3, 6 and 9
    g.setColor(Color.black);
    g.setFont(Font.decode("Calibri-BOLDITALIC-60"));
    g.drawString("12", 360, 150);
    g.drawString("15", 505, 300);
    g.drawString("18", 360, 500);
    g.drawString("21", 210, 300);

    //  labels
    g.setColor(Color.black);
    g.setFont(new Font(null));
    for ( int X=0; X<800; X += 50 )
    g.drawString( String.valueOf(X), X, 50 );
    for ( int Y=100; Y<600; Y += 50 )
    g.drawString( String.valueOf(Y), 28, Y );
    // lines
    g.setColor(Color.lightGray);
    for ( int X=0; X<800; X += 50 )
    g.drawLine(X,0,X,599);    // horizontal
    for ( int Y=0; Y<600; Y += 50 )
    g.drawLine(0,Y,799,Y);    // vertical

  }
  public static void main (String args[]) {
    JFrame win = new JFrame("This is a clockface");
    win.setSize(800,600);
    win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ClockFace canvas = new ClockFace();
    win.add(canvas);
    win.setVisible(true);
  }

}
