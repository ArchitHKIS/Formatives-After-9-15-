
public class randrand {
	int[][] ten = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

	public static void main(String[] args) {
		int[] bob = finder(9);
		
	}

	public static int[] finder(int num) {
		int[] bob = new int[1];
		for (int i = 0; i < ten.length; i++) {
			for (int b = 0; b < ten[i].length; b++)
				if (num == ten[i][b]) {
					bob[0] = i;
					bob[1] = b;
					return bob;
				}
		}
		bob[0] = -1;
		bob[1] = -1;
		return bob;

	}

}
