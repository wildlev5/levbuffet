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
		System.out.println("Please type in a word");
		String word = sc.nextLine();
		
		if(word.equals("Chicken"))
		{
		System.out.println("    _//");
		System.out.println("    /._.\\");
		System.out.println("    \\  \\/  /");
		System.out.println("_/        \\");
		System.out.println("\\-        )");
		System.out.println("\\         /");
		System.out.println("____________");
		System.out.println("|          |");
		System.out.println("|          |");
		}
		else if(word.equals("Pumpkin"))
		{
			System.out.println(" _/_");
			System.out.println("/^,^\\");
			System.out.println("\\\\_//");
		}
		else if(word.equals("face"))
		{
			System.out.println("¯\\_(ツ)_/¯");
		}
		else
		{
			System.out.println("invalid.");
		}
	}

}