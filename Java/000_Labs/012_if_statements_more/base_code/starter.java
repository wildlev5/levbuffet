/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.print("Please input yor first number here:");
		int a = sc.nextInt();
		System.out.print("Please input yor second number here:");
		int b = sc.nextInt();
		boolean z = (a!=b);
		if(z)
		{
			System.out.println("Your numbers are different!");
		}
		boolean y = (a==b);
		if(y)
		{
			System.out.println("Your numbers are the same!");
		}
		
		System.out.print("I love to learn coding remotely.");
		
	}
}
