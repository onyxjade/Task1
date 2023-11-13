// Java Program to Find the Largest of three Numbers
// Using Collections.max() method

import java.util.*;

class task6 {

	public static void main(String[] args)
	{
		int a, b, c;
		// Considering random integers three numbers
		a = 5;
		b = 15;
		c = 29;
		ArrayList<Integer> x = new ArrayList<>();
		x.add(a);
		x.add(b);
		x.add(c);

		// Printing the largest number
		System.out.println(Collections.max(x)
						+ " is the largest number.");
	}
}
