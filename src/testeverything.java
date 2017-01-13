import java.math.*;

public class testeverything {
	public static void main(String[] args) {
		BigDecimal o = BigDecimal.valueOf(0);
		BigDecimal f = BigDecimal.valueOf(4);
		int b = 1;
		for (long i = 1; i < 1000000; i++) {
			BigDecimal d = BigDecimal.valueOf(i);
			if (b == 0) {
				o = o.subtract(f.divide(d, 1000, 1));
				b = 1;

			}
			if (b == 1) {
				o = o.add(f.divide(d, 1000, 1));
				b = 0;
			}
		}
		System.out.println(o);
	}
}