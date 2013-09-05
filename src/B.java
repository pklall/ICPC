import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int numLines = in.nextInt();

		int num = 1;
		while (in.hasNextInt()) {
			int val = in.nextInt();
			
			int result = wSum(val);
			System.out.printf("%d %d %d\n", num, val, result);
			num++;
		}
	}
	
	public static int wSum(int n){
		int sum = 0;
		for(int k = 1; k <= n; k++){
			int right = 0;
			for(int i = 1; i <= k+1; i++){
				right += i;
			}
			sum += k*right;
		}
		return sum;
	}
}
