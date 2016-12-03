import java.math.*;

public class testeverything {
	public static void main(String[] args) {
		//BigInteger bi = BigInteger.valueOf(20);
		BigInteger k = BigInteger.valueOf(2);
		BigInteger j = BigInteger.valueOf(2);
		System.out.println(k);
		for(int i = 0; i< 100000000; i++){
			k = k.multiply(j);
			System.out.println(k);
		}
		System.out.println(k.bitLength());
	}
}
