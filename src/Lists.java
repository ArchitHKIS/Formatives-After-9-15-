import java.util.*;

public class Lists {
	public static void main(String[] args) {
		ArrayList<String> texts = new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		boolean b = true;
		while (b == true) {
			System.out.println("Enter something");
			String s = input.nextLine();
			texts.add(s);
			System.out.println("Add more elements?");
			String t = input.nextLine();
			if (t.equals("yes") || t.equals("y")) {
				b = true;
			} else {
				b = false;
			}
		}
		System.out.println(texts);
		System.out.println("Remove an element");
		int tt = input.nextInt();
		texts.remove(tt);
		System.out.println(texts);
	} 
}
