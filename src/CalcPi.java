import java.util.*;
import java.io.*;

public class CalcPi {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		NewCalcPi bobo = new NewCalcPi();
		// Prompt the user to enter input
		System.out.println("Enter number of terms");
		double i = input.nextDouble(); // value of i user entered
		System.out.println(bobo.cPi(i));
		System.out.println(Math.PI);

	}
}
