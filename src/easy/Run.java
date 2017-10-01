package easy;

/*
 * This is the main function for e.txt.
 * Initialize the Solution class object, and it can use the solution defined in the Solution class to solve the problem.
 */

public class Run {
		
	public static void main(String[] args) {
		
		IntList test = new IntList();
		IntList test1 = IntList.build(3);
		
		IntList test2 = test1;
		while (test2 != null) {
			test2 = test2.next;
		}
		
		IntList test3 = IntList.build(5000);
		
		// Build a Solution object here.
		Solution s = new Solution();
		
		System.out.println(s.solution(test));
		System.out.println(s.solution(test1));
		System.out.println(s.solution(test2));
		System.out.println(s.solution(test3));


	}
}
