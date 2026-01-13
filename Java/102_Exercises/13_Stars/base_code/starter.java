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
		System.out.print("Please enter an integer: ");
		int stars = sc.nextInt();
		int a = 0;
		String b = new String("");
		while(a<stars){
			b = (b+"*");
			System.out.println(b);
			a = a + 1;
			}
	}
}
