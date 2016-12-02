import java.awt.Frame;
import java.awt.image.*;
import java.awt.*;
import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;

public class ArrayTest {
public static void main(String[] argsx){
	/*int[][] numbers = new int[2][2];
	//2d array with 4 individual elements
	numbers[0][0] = 1;
	// values are added to array as such ^^
	for(int i = 0; i<2; i++){
		for(int b = 0; b<2; b++){
			numbers[i][b] = 1;
			System.out.println(numbers[i][b]);
			//prints the arrays values
		}
	}*/
	
	 Canvas pic = new Canvas();        // Make a canvas (2 dim array)
     Frame f = new Frame( "My image" );    // Create a window

     f.add("Center", pic);                 // Put the canvas in the window
     f.setSize(400,300);                   // We make a 400x300 picture
     f.setVisible(true);                   // Make window visible

     /* ----------------------------------------------------
        Draw a picture stored in a 2-dimensional array
	 ---------------------------------------------------- */
     int[][] a = new int[400][300];        // This array hold the picture

     // You will need write statements here to store the 
     // correct pixel codes into the variable a first....

     pic.draw(a);    // This method call will display the picture
                     // stored in the variable a to the screen
}
}
 