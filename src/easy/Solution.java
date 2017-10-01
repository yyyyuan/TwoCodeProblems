package easy;

/*
 * Functions:
 * -- solution(IntList L): this function accepts a IntList object as an argument
 * 						   and return the length of this IntList.
 */

public class Solution {
	public int solution(IntList L) {
		if (L == null) return 0;
		
		int length = 0;
		IntList head = L;
		while (head != null) {
			length++;
			head = head.next;
		}
		return length;
	}
}
