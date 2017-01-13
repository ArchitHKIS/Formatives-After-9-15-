import java.util.ArrayList;
import java.math.*;
import java.util.*;

public class FindGCF {
	public static void main(String[] args) {
		int a = 99;
		// use L or F for floats at the end of the value to take them as long or
		// float since they are literal integers
		// otherwise
		Scanner input = new Scanner(System.in);
		System.out.println(isPrime(a));
		
	}

	public static boolean isPrime(int a) {
		boolean b = true;
		for (int i = 2; i < a; i++) {
			if (a % i != 0) {
				b = true;
			} else {
				b = false;
				break;
			}
		}
		return b;

	}
}
