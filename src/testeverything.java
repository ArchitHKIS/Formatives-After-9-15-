import java.util.*;
import java.math.*;

public class testeverything {
	public static void main(String[] args) 
		{
		BigInteger bi = BigInteger.valueOf(20);
		BigInteger di = bi.pow(1000000);
		//System.out.println(di);
		System.out.println(di.bitLength());
		}
	}

