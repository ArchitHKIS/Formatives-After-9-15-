
public class perfectNums {
	public static void main(String[] args){
		boolean b;
		int c = 0;
		for(int i = 2; i < 1000; i++){
			int dd = (int) (Math.pow(2, i) - 1);
			b = isPrime(dd);
			if(b == true){
				System.out.println(i);
				System.out.println(Math.pow(2, i-1)*(Math.pow(2, i) -1 ) );
				c++;
				if(c == 4)
					break;
			}
		}
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
