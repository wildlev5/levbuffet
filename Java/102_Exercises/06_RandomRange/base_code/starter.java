/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 2 numbers to create a range for your random number");
		System.out.print("Please enter an integer:");
		int a = sc.nextInt();
		System.out.print("Please enter another integer(bigger than the first):");
		int b = sc.nextInt();
		boolean y = (a<b);
		if(y)
		{
		System.out.println("Your range is " + a + " to " + b);
		System.out.println("Here are 5 numbers generated in that range.");
		System.out.print((int)(Math.random()*(b-a)+a));
		System.out.print(",");
		System.out.print((int)(Math.random()*(b-a)+a));
		System.out.print(",");
		System.out.print((int)(Math.random()*(b-a)+a));
		System.out.print(",");
		System.out.print((int)(Math.random()*(b-a)+a));
		System.out.print(",");
		System.out.println((int)(Math.random()*(b-a)+a));
		}
		boolean z = (a>=b);
		if(z)
		{
		System.out.println("The second number you entered was not bigger than the first.");
		System.out.print("Enter another number that is bigger than the first one you entered:");
		int c = sc.nextInt();
			System.out.println("Your range is " + a + " to " + c);
		System.out.println("Here are 5 numbers generated in that range.");
		System.out.print((int)(Math.random()*(c-a)+a));
		System.out.print(",");
		System.out.print((int)(Math.random()*(c-a)+a));
		System.out.print(",");
		System.out.print((int)(Math.random()*(c-a)+a));
		System.out.print(",");
		System.out.print((int)(Math.random()*(c-a)+a));
		System.out.print(",");
		System.out.println((int)(Math.random()*(c-a)+a));
		}
		
		
		System.out.print("I love to learn coding remotely.");
		
	}
}
