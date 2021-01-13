package MyPackage;

import java.util.*;
public class Program2 {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		int digit;
		System.out.print("Enter the Digit = ");
		digit = sr.nextInt();
		int first,last;
		first = digit/100;
		last = digit%10;
		System.out.println("First digit is "+first);
		System.out.println("Last digit is "+last);
		
		sr.close();
	}

}
