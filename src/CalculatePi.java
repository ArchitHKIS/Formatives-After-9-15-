import java.math.*;

public class CalculatePi {
	public static void main(String[] args) {
		BigInteger d = BigInteger.valueOf(0);
		BigInteger count = BigInteger.valueOf(1);
		BigInteger gg = BigInteger.valueOf(1);
		BigInteger two = BigInteger.valueOf(2);
		BigInteger four = BigInteger.valueOf(4);
		double pi = 0;
		double denominator = 1;
		for (BigInteger x = BigInteger.valueOf(0); x.compareTo(BigInteger.valueOf(10)) == -1; x.add(BigInteger.ONE)) {
			if (x.mod(BigInteger.valueOf(2)).equals(0)) {
				d = d.add(BigInteger.valueOf((long) (1 / denominator)));
			} else {
				d = d.subtract(BigInteger.valueOf((long) (1 / denominator)));
			}
			denominator = denominator + 2;
		}
		d = d.multiply(four);
		System.out.println(d);
	}
}
