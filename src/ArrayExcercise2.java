import java.util.concurrent.ThreadLocalRandom;

public class ArrayExcercise2 {
	public static void main(String[] args) {
		int[][] bobo = new int[3][4];
		for (int i = 0; i < bobo.length; i++) {
			for (int b = 0; b < bobo[0].length; b++) {
				bobo[i][b] = ThreadLocalRandom.current().nextInt(0, 10);
			}
		}
		ArrayExcercise2.printArray(bobo);
	}

	public static void printArray(int[][] hi) {
		for (int i = 0; i < hi.length; i++) {
			for (int b = 0; b < hi[0].length; b++) {
				System.out.print(hi[i][b] + " ");
			}
			System.out.println("");
		}
	}
}
