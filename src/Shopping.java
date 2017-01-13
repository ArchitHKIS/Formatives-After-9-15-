import java.util.*;

public class Shopping {
	public static void main(String[] args) {
		List<String> shop = new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		boolean b = true;
		while (b == true) {
			System.out.println("Enter item and its price as so: Carrot: $13");
			String s = input.nextLine();
			if (s.equals("r")) {
				System.out.println(shop);
				System.out.println("Remove item #?");
				int re = input.nextInt();
				shop.remove(re);
			}
			if (s.equals("l")) {
				System.out.println(shop);
			} else {
				shop.add(s);
			}
			System.out.println("Add/Remove more elements?");
			String t = input.nextLine();
			if (t.equals("y") || t.equals("yes")) {
				b = true;
			}else{
				b = false;
			}
		}
		System.out.println(shop);
	}
}
