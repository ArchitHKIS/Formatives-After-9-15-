import java.util.concurrent.ThreadLocalRandom;

public class ArrayExcercise {
	public static void main(String[] args) {
		int[][] bobo = new int[3][4];
		for (int i = 0; i < bobo.length; i++) {
			for (int b = 0; b < bobo[0].length; b++) {
				bobo[i][b] = ThreadLocalRandom.current().nextInt(1, 10);
			}
		}
		for (int i = 0; i < bobo.length; i++) {
			for (int b = 0; b < bobo[0].length; b++) {
				System.out.print(bobo[i][b] + " ");
			}
			System.out.println("");
	}
}
}