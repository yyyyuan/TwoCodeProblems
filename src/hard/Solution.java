package hard;
/*
 * Functions:
 * -- solution(int[] A, int[] B): this is the solution to the problem, it accepts two arrays as input and ther return the result we need.
 * -- combination(int n): this function accepts an integer n as input, then it calculates the combination result: C(n,2) and return it. 
 */

public class Solution {
	public int solution(int[] A, int[] B) {
		// If the lengths of two arrays are not equal, or length of one of is 0, the result should be 0.
		if (A.length != B.length || A.length == 0 || B.length == 0) return 0;
		
		int count = 0;
		int start = 0, end = A.length - 1;
		int scale = 1000000;		// define the scale as 1,000,000 here, so it's convenient to use and modify.
		
/*
 * Because 0 * 0 >= 0 + 0 is true, so we need to check how many 0s in the array.
 * If there are more than one 0 in the array, then we need to take them into count,
 * o do that I build a function called combination to calculate the C(n, 2).
 */
		for (int i = start; i <= end; i++) {
			if (A[i] == 0 && B[i] == 0) start++;
			else break;
		}
		
		// Add the counts of these 0s' combinations into count.
		count += combination(start);
		if (count >= 1000000000) return count;		// If count is equal to 1,000,000,000, it has no need to move forward and just returns 1,000,000,000 as result.
		

/*
 * For indexes start, end, if C[start] * C[end] >= C[start] + C[end], then all elements from start to end - 1 could also meet the requirement
 * So count += end - start; here (end - start) is the count of number from start to end - 1.
 */
		while (start < end) {
			double num1 = A[start] + (double) B[start] / scale;
			if (num1 > 1) {
				double num2 = A[end] + (double) B[end] / scale;
				if (num1 * num2 > num1 + num2 || num1 * num2 == (num1 + num2)) {
					count += end - start;
					if (count > 1000000000) {
						// If count is greater than 1,000,000,000, I set count = 1,000,000,000 and return it.
						// Because there is no need to calculate more, this is the largest number we could return as requirements said.
						count = 1000000000;
						return count;
					}
					end--;
				}
				else {
					start++;
				}
			}
			else {
				start++;
			}
		}
		
		return count;
	}
	
	// This function is used to calculate C(n, 2).
	private int combination(int n) {
		int sum = 0;
		while (--n >= 0) {
			sum += n;
			if (sum > 1000000000) return 1000000000;		// If sum is greater than 1,000,000,000, it just return 1,000,000,000.
		}
		return sum;
	}
}
