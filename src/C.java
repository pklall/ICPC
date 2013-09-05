import java.util.Scanner;


public class C {
	public static void main(String [] args) {
		
		Scanner kb = new Scanner(System.in);
		
		int runs = Integer.parseInt(kb.nextLine());
		
		for(int i=0; i<runs; i++) {
			int stackSize = Integer.parseInt(kb.nextLine());
			
			String s1 = kb.nextLine();
			String s2 = kb.nextLine();
			String goal = kb.nextLine();
			doWork(i+1, s1, s2, goal);
		}
		
	}
	
	public static void doWork(int caseNum, String s1, String s2, String goal) {
		Scanner kb = new Scanner(System.in);
//		System.out.println("in do work: "+s1+", "+s2);
		
		String shuffled = s1+s2;

		String s11 = shuffled.substring(0, shuffled.length()/2);
		String s22 = shuffled.substring(shuffled.length()/2);
		
		shuffled = shuffle(s11, s22);
		
		String firstShuffle = "" + shuffled;
		
		int n = 1;
		
		while(!shuffled.equals(goal)) {
			s11 = shuffled.substring(0, shuffled.length()/2);
			s22 = shuffled.substring(shuffled.length()/2);
			
			shuffled = shuffle(s11, s22);
			n++;
			
			if (shuffled.equals(firstShuffle)) {
				n = -1;
				break;
			}
		}
		
		System.out.println(caseNum + " " + n);
		
		/*
		String s11 = shuffled.substring(0, shuffled.length()/2);
		String s22 = shuffled.substring(shuffled.length()/2);
		
		shuffled = shuffle(s11, s22);

		while(!shuffled.equals(goal)) {
			s11 = shuffled.substring(0, shuffled.length()/2);
			s22 = shuffled.substring(shuffled.length()/2);
			
			shuffled = shuffle(s11, s22);
			n++;
			
			if(shuffled.equals(s1+s2) && !shuffled.equals(goal)) {
				n=-1;
				break;
			}
			
		}
		
		System.out.println(caseNum+" "+n);
		*/
	}
	
	public static String shuffle(String s1, String s2) {
		//System.out.println("shuffling "+s1+" and "+s2);
		
		String out = "";
		for(int i=0; i<s2.length(); i++) {
			out += s2.charAt(i);
			out += s1.charAt(i);
		}
		
		//System.out.println(n+" result: "+out+"\n");
		
		return out;
	}

}
