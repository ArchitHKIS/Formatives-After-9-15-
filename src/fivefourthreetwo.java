import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class fivefourthreetwo {
	public static void main(String[] args){
	BigInteger bi = BigInteger.valueOf(20);
	Scanner input = new Scanner(System.in);
	//BigInteger di = bi.pow(1000000);
	//System.out.println(di);
	//System.out.println(di.bitLength());
	System.out.println("Number of random numbers");
	int ipt = input.nextInt();
	/*int[] lobo = new int[ipt];
	for(int i = 0; i < lobo.length; i++){
		lobo[i] = ThreadLocalRandom.current().nextInt(1, ipt + 1);
		for(int d = 0; d <= i; d++){
			if(lobo[i] == lobo[d]){
				lobo[i] = ThreadLocalRandom.current().nextInt(1, ipt + 1);	
			}else{
				lobo[i] = lobo[i];
			}
		}
	}
	for(int b = 0; b < lobo.length; b++){
		System.out.print(lobo[b]+", ");*/
	ArrayList<Integer> ints = new ArrayList<Integer>();
    for (int i=0; i<ipt; i++) {
        ints.add(new Integer(i+1));
    }
    Collections.shuffle(ints);
    for (int i=0; i<ipt; i++) {
        System.out.print(ints.get(i)+", ");
    }
	
	}
}
