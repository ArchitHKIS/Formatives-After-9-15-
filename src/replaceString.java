import java.util.*;
public class replaceString {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter string:");
		String bobo = input.nextLine();
		System.out.println("Enter replacing thing");
		String dodo = input.nextLine();
		System.out.println("Enter what it should be replaced with");
		String replace = input.nextLine();
		String dobo = bobo.replaceAll(dodo, replace);
		System.out.println(dobo);
	}
}
