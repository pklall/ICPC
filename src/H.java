import java.util.HashSet;
import java.util.Scanner;


public class H {
	public static void main(String [] args) {
		
		Scanner kb = new Scanner(System.in);
		
		int runs = Integer.parseInt(kb.nextLine());
		
		for(int i=0; i<runs; i++) {
			int stackSize = Integer.parseInt(kb.nextLine());
			
			String result = decompose(stackSize);
			
			System.out.printf("%d %d %s\n", i + 1, stackSize, result);
		}
		
	}
	
	public static String decompose(int n) {
		System.out.println("decompose " + n);
		int base2 = (int) Math.ceil(Math.log(n) / Math.log(2));

		int base3 = (int) Math.ceil(Math.log(n) / Math.log(3));
		
		String ret = "";
		for(int power3 = base3; power3 >= 0; power3--) {
			for(int power2 = base2; power2 >= 0; power2--) {
				long cur = (long) (Math.pow(2, power2) * Math.pow(3, power3));
				if (cur <= n) {
					int residual = (int) (n - cur);
					System.out.printf("n = %d, cur = %d, residual = %d\n", n, cur, residual);
					String rest = "";
					if (residual > 0) {
						rest = decompose(residual);
					}
					return String.format("[%d,%d] ", power2, power3) + rest;
				}
			}
		}
		return "";
	}
}
