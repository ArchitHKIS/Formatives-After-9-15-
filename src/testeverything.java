import java.math.*;

public class testeverything {
	public static void main(String[] args) {
		BigInteger bi = BigInteger.valueOf(20);
		int x = 0;
		int y = 0;
		for (int i = 0; i < 4; i++) {
			if (Math.random() >= 0.5) {
				x = -10;
			} else {
				x = 10;
			}

			if (Math.random() >= 0.5) {
				y = -10;
			} else {
				y = 10;
			}
			System.out.println(x + " and " + y);
		}
	}
}
