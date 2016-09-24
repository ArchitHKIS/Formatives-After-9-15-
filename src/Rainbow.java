// Chapter 5 Question 27
//got some help from Marcus 
// there are legends in stackoverflow
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Rainbow extends JPanel
{
  // Declare skyColor:
	private Color skyColor = Color.CYAN;	
  // ________________________________________________

  public Rainbow()
  {
    setBackground(skyColor);
  }

  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    super.paintComponent(g);
    int width = getWidth();    
    int height = getHeight();
    int xCenter = width/2;
	int yCenter = (height*3) / 4;
    int LargeRadius = width/4;
	int MiddleRadius = height*1/4;
   // red(big) part
	g.setColor(Color.RED);
   g.fillArc(xCenter - LargeRadius/2, yCenter - LargeRadius/2 + LargeRadius/4 -height/4, LargeRadius, LargeRadius,0,180);
   // magenta(middle)
   g.setColor(Color.MAGENTA);
   int Mean = MiddleRadius * LargeRadius; 
   int smallRadius = (int) Math.sqrt(Mean);
   g.fillArc(xCenter-(smallRadius)/2, yCenter-(smallRadius)/2 + LargeRadius/4 -height/4, smallRadius, smallRadius, 0, 180);
   //green
   g.setColor(Color.GREEN);
   g.fillArc(xCenter-(MiddleRadius)/2, yCenter-(MiddleRadius)/2 + LargeRadius/4 -height/4, MiddleRadius, MiddleRadius, 0, 180);
   int tinyRadius = (LargeRadius+MiddleRadius+smallRadius)/5;
   //sky color 
   g.setColor(skyColor);
   g.fillArc(xCenter-(tinyRadius)/2,yCenter-(tinyRadius)/2 + LargeRadius/4 - height/4,tinyRadius,tinyRadius,0,180);
   
  }
   

  public static void main(String[] args)
  {
    JFrame w = new JFrame("Rainbow");
    w.setBounds(300, 300, 300, 200);
    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = w.getContentPane();
    c.add(new Rainbow());
    w.setVisible(true);
  }
}
