// Chapter 5 Question 27

// ________________________________________________

import java.awt.Color;
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
    int width = getWidth();    
    int height = getHeight();
    double xCenter = 1/2*width;
    double yCenter = 1/2*height;
    double largeRadius = 1.4*width;

    g.setColor(Color.RED);
    }
 g.fillArc(x, y, size, size, from, degrees);

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
