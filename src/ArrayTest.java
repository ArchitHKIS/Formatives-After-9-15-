import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.image.*;
import java.lang.Object;
public class ArrayTest extends Canvas {
public static void main(String[] argsx) throws Exception{
	 final int YELLOW = 0xFFFF00;
   	 final int BLACK  = 0x000000;
    
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
   
   	 /* -------------------------------
   	    Make the whole picture BLACK
   	    ------------------------------- */
   	 for (col  = 0; col < 400; col++ )
   	    for (row  = 0; row < 300; row++ )
   		a[col][row] = BLACK;
    
   	 /* --------------------------------------------------
   	    Make a vertical yellow line (col coord unchanged)
   	    -------------------------------------------------- */
   	 a[100][191] = YELLOW; a[100][192] = YELLOW; a[100][193] = YELLOW;
   	 a[100][194] = YELLOW; a[100][195] = YELLOW; a[100][196] = YELLOW;
   	 a[100][197] = YELLOW; a[100][198] = YELLOW; a[100][199] = YELLOW;
   	 a[100][200] = YELLOW; a[100][201] = YELLOW; a[100][202] = YELLOW;
   	 a[100][203] = YELLOW; a[100][204] = YELLOW; a[100][205] = YELLOW;
   	 a[100][206] = YELLOW; a[100][207] = YELLOW; a[100][208] = YELLOW;
   	 a[100][209] = YELLOW; a[100][210] = YELLOW; a[100][211] = YELLOW;
    
   	 /* -----------------------------------------------------
   	    Make a horizontal yellow line (row coord unchanged)
   	    ----------------------------------------------------- */
   	 a[96][201] = YELLOW; a[95][201] = YELLOW; a[94][201] = YELLOW;
   	 a[99][201] = YELLOW; a[98][201] = YELLOW; a[97][201] = YELLOW;
   	 a[101][201] = YELLOW; a[102][201] = YELLOW; a[103][201] = YELLOW;
   	 a[104][201] = YELLOW; a[105][201] = YELLOW; a[106][201] = YELLOW;
   
   	 pic.draw(a);   // Draw the picture in a[][]
      }
   }
