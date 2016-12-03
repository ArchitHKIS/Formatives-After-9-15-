 import java.awt.*;
  import java.awt.image.*;
    
   public class MyCanvas extends Canvas
   {
       static final int MAX_WIDTH = 300;
       static final int MAX_HEIGHT = 300; // Dimensions of the 2-dim canvas
    
       /* -------------------------------------------------
   	  This variable is the 2-dim. array of pixels
   	   (= image) used for the drawing
   	  ------------------------------------------------- */
       static BufferedImage Image
   	   = new BufferedImage(MAX_WIDTH, MAX_HEIGHT, BufferedImage.TYPE_INT_RGB);
    
       /* -----------------------------------------
   	  repaint will invoke paint()
   	  and will use "Image"
   	  ----------------------------------------- */
       public void paint(Graphics g)
       {
   	   g.drawImage(Image, 0, 0, Color.white, null);
       }
    
       /* -----------------------------------------
   	  Redefine update() will eliminate flicker
   	  ----------------------------------------- */
       public void update(Graphics g)
       {
   	  paint(g);
       }

   }