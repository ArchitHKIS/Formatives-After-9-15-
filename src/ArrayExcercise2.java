import java.util.concurrent.ThreadLocalRandom;

public class ArrayExcercise2 {
	public static void main(String[] args) {
		int[][] bobo = new int[10][8];
		for (int i = 0; i < bobo.length; i++) {
			for (int b = 0; b < bobo[i].length; b++) {
				bobo[i][b] = ThreadLocalRandom.current().nextInt(50, 100);
			}
		}
		ArrayExcercise2.printArray(bobo);
		ArrayExcercise2.findSmallest(bobo);
		ArrayExcercise2.findLargest(bobo);
	}

	public static void printArray(int[][] hi) {
		for (int i = 0; i < hi.length; i++) {
			for (int b = 0; b < hi[0].length; b++) {
				System.out.print(hi[i][b] + " ");
			}
			System.out.println("");
		}
	}

	public static void findSmallest(int[][] theArray) {
		int smallestVal = theArray[0][0]; // use the first element as a
											// reference
		int rIndex = 0;
		int cIndex = 0;
		for (int i = 0; i < theArray.length; i++) {
			for (int j = 0; j < theArray[i].length; j++) {
				if (theArray[i][j] < smallestVal) {
					smallestVal = theArray[i][j];
					rIndex = i;
					cIndex = j;
				}
			}
		}
		System.out.println(
				"The smallest number in this array is : {" + rIndex + ", " + cIndex + ": " + smallestVal + "}");
	}

	public static void findLargest(int[][] theArray) {
		int large = theArray[0][0];
		int row = 0;
		int col = 0;
		for (int i = 0; i < theArray.length; i++) {
			for (int b = 0; b < theArray[0].length; b++) {
				if (theArray[i][b] > large) {
					large = theArray[i][b];
					row = i;
					col = b;
				}
			}
		}
		System.out.println("row: " + row + " column:" + col + ", " + large);
	}
}
