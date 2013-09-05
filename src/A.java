import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int numLines = in.nextInt();

		int num = 1;
		while (in.hasNextInt()) {
			int val = in.nextInt();

			int numQuarters = val / 25;

			val -= numQuarters * 25;

			int numDimes = val / 10;

			val -= numDimes * 10;

			int numNickels = val / 5;

			val -= numNickels * 5;

			int numPennies = val;

			System.out
					.printf("%d %d QUARTER(S), %d DIME(S), %d NICKEL(S), %d PENNY(S)\n",
							num, numQuarters, numDimes, numNickels, numPennies);

			num++;
		}
	}
}
