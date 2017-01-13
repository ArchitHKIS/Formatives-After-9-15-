
public class GCF {
	public static void main(String[] args) {
		System.out.println(FindGcf(57,  7));
		System.out.println(recur(57,7));
	}

	public static int FindGcf(int a, int b) {
		while (a != b) {
			if (a > b) {
				a -= b;
			} else {
				b -= a;
			}
		}
		return a;
	}
	public static int recur(int a, int b){
		if(a == b){
			return a;
		}
		if( a > b){
			a = a - b;
			recur(a, b);
		}else{
			b = b - a;
			recur(a,b);
		}
	return 0;
	}
}
