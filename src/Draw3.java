import java.awt.*;
import java.awt.image.*;
import java.awt.Graphics;
import java.awt.Graphics2D; 
import java.awt.Toolkit;

public class Draw3
{

   public static void pause(int n) throws Exception
   {
      Thread.sleep( 100 * n );   // pause for 100*n msec
   }

    /* ===========================================================
       The "move_left" method copies the "image" stored in
       the variable "pixel" one column to the left

             col  col+1
              . <-- .
              . <-- .
              . <-- .
       =========================================================== */
    public static void move_left(int[][] pixel)
    {
       int ncols, nrows;

       for ( int col = 0; col < 399; col++ )
          for ( int row = 0; row < 300; row++ )
              pixel[col][row] = pixel[col+1][row];

       /* ---------------------------------------------
          Fill the right most column with BLACK pixels
          --------------------------------------------- */
       for ( int row = 0; row < 300; row++ )
          pixel[399][row] = 0;  // 0 = BLACK
    }



   static public void main(String[] args) throws Exception
   {
      final int YELLOW = 0xFFFF00;  // = 16711680+65280 (Red + Green)
      final int RED    = 0xFF0000;  // = 16711680
      final int GREEN  = 0x00FF00;  // = 65280
      final int BLUE   = 0x0000FF;  // = 255
      final int BLACK  = 0x000000;  // = 0


      /* ------------------------------------------------
         Preparing to draw picture...
         ------------------------------------------------ */
      MyCanvas pic = new MyCanvas();        // Make a canvas (2 dim array)
      Frame f = new Frame( "My image" );    // Create a window

      f.add("Center", pic);                 // Put the canvas in the window
      f.setSize(400,300);                   // Set size of the window
      f.setVisible(true);                   // Make window visible 

      int[][] a = new int[400][300];        // This array hold the picture
      int row, col;

      for (col = 0; col < 400; col++ ) 
         for (row = 0; row < 300; row++ ) 
             a[col][row] = BLACK;

      for (col = 100; col < 110; col++ ) 
         for (row = 200; row < 210; row++ ) 
             a[col][row] = YELLOW;

      for ( int k = 0; k < 120; k++ )
      {
         pic.draw(a);       // Draw the picture in a[][]
         pause(1);
         move_left(a);
      }

      System.exit(0);
   }
}
