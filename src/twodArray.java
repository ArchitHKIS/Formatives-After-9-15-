
public class twodArray {
public static void main(String[] args){
	int[][] a2dArray = new int[100][100]; 
   /* a2dArray[0][0] = 1;
    a2dArray[0][1] = 2;
    a2dArray[0][2] = 3;
    a2dArray[0][3] = 4;
    a2dArray[1][0] = 5;
    a2dArray[1][1] = 6;
    a2dArray[1][2] = 7;
    a2dArray[1][3] = 8;
    a2dArray[2][0] = 9;
    a2dArray[2][1] = 10;
    a2dArray[2][2] = 11;
    a2dArray[2][3] = 12;*/
	int counter = 1;
	for(int r = 0; r < a2dArray.length;r++){
	  for(int c = 0; c < a2dArray[r].length; c++){
		 System.out.println("a2dArray[" + r + "][" + c + "]: "+counter);
		  a2dArray[r][c] = counter;
		 counter++;
	  }
  }
	System.out.println(a2dArray[99][99]);
}
}