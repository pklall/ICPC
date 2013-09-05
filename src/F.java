import java.util.Scanner;

public class F {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int numLines = in.nextInt();

		int num = 1;
		while (in.hasNextInt()) {
			int n = in.nextInt();
			
			int total = 0;
			for (int x = 1; x <= n; x++) {
				for (int y = 1; y <= x; y++) {
					if (coprime(x, y)) {
						total++;
					}
				}
			}
			
			total *= 2;
			
			total += 1;
			
			System.out.printf("%d %d %d\n", num, n, total);
			
			
			num++;
		}
	}
	
	public static int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}
	
	public static boolean coprime(int x, int y) {
		int g = gcd(x, y);
		return (g == 1);
	}
}
