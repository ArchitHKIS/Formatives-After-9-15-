import java.util.*;
public class locatechar {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter string");
		String bobo = input.nextLine();
		char[] dodo = bobo.toCharArray();
		System.out.println("Enter a char to be found in the string");
		String ding = input.nextLine();
		char[] dong = ding.toCharArray();
		for(int i = 0; i < bobo.length(); i++){
			if(dodo[i] == dong[0]){
				System.out.println(i);
			}
		}
	}
}
