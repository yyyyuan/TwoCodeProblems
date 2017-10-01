package hard;

/*
 * This is the main function for h.txt.
 * Initialize the Solution class object, and it can use the solution defined in the Solution class to solve the problem.
 */

public class Run {
	
	public static void main(String[] args) {
		int[] A = new int[]{0,0,0,0,0,1,2,2,3,5};
		int[] B = new int[]{0,0,0,0,500000,500000,0,0,0,20000};
		
		int[] A1 = new int[]{0,0,0,0,0,0};
		int[] B1 = new int[]{0,0,0,0,0,0};
		
		int[] A2 = new int[100000];
		int[] B2 = new int[100000];
		
		int[] A3 = new int[]{0,1,2,2,3,5};
		int[] B3 = new int[]{500000,500000,0,0,0,20000};
		
		A2[99999] = 5;
		B2[99999] = 20000;

		// Build a Solution object here.
		Solution s = new Solution();
		
        System.out.println(s.solution(A, B));
        System.out.println(s.solution(A1, B1));
        System.out.println(s.solution(A2, B2));
        System.out.println(s.solution(A3, B3));


	}
}
