import java.util.*;

public class testeverything {
	public static void main(String[] args) {
		int k, b, f;
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name:");
		String name = input.nextLine();
		String nameL = name.toLowerCase();
		int stringlength = nameL.length();
		String reverseName = "";
		for (int i = stringlength - 1; i >= 0; i--) {
			reverseName += nameL.substring(i, i + 1);
		}
		System.out.println(reverseName);
		System.out.println(b);
	}
}
