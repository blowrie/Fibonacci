/*
1. The Fibonacci Series Problem
Find the first term greater than 1000 in the sequence: 1 1 2 3 5 8 13 ...
Also find the sum of all the values up to that term.
*/

import java.util.*;

class Untitled {
	public static void main(String[] args) {
		int a, b, c, check, count;
		
		a = 1;
		b = 0;
		check = 0;
		count = 0;
		c = 0;
		
		do {
		if(count % 2 == 0) {
			c = a + b;
			check = c;
		} else {
			b = c + b;
			a = c;
			check = b;
		}	
		
		count++;
		
		System.out.print(check + ", ");
		}while(check < 1000);
	}
}