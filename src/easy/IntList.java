package easy;

/*
 * This file defines the IntList class needed for the problem.
 * Functions:
 * -- IntList() : this is the default constructor for IntList class.
 * -- IntList(int x): this constructor accepts an integer x as argument and set the value of this IntList to x.
 * -- build(int n): this helper function accepts an integer n as argument and return a IntList within length == n, to be used directly
 * 					without needs to create a class object first, I set it as static.
 */

public class IntList {
	int val;
	IntList next;
	
	IntList() {}	// Default constructor
	
	IntList(int x) {
		val = x;
	}
	
	public static IntList build(int n) {
		if (n == 0) return null;
		if (n < 1) {
			throw new IllegalArgumentException("The input integer should not be negative.");		// If the input is less than 0, it will throw a exception, just in case.
		}
		
		IntList head = new IntList();
		IntList copy = head;
		
		while (n - 1 > 0) {
			IntList temp = new IntList(n);
			copy.next = temp;
			copy = copy.next;
			n--;
		}
		return head;
	}
}
