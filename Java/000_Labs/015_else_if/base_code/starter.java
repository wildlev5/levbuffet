/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		int a = (int)(Math.random()*1000+1);
		System.out.print("Pick a number between 1 - 1000: ");
		int b = sc.nextInt();
		
		if(a==b)
		{
			System.out.println("Your number was the random number!! The number was " +a +"!");
		}
		
		else if(b>a)
		{
			System.out.println("Your number was bigger than the random number. The number was " +a +".");	
		}
		else
		{
			System.out.println("Your number was smaller than the random number. The number was " +a +".");
		}
		
		
		
		System.out.print("I love to learn coding remotely."); 
	}
}
