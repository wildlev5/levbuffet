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
		System.out.println("What is your name?");
		String a = sc.nextLine();
		System.out.println("What is your title? Ex: Slayer of Dragons");
		String b = sc.nextLine();
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue? ");
		String c = sc.nextLine();
		
		if(c.equals("wizard") || a.equals("Wizard"))
		{
			System.out.println("You've chosen the Wizard! Excelsior!");	
		}
		else if(c.equals("warrior") || a.equals("Warrior"))
		{
			System.out.println("You've chosen the Warrior! For honor!");
		}
		else if(c.equals("rogue") || a.equals("Rogue"))
		{
			System.out.println("You've chosen the Rogue! How cunning!");
		}
		else
		{
			System.out.println("You've decided not to chose a role. Rerun program.");
		}
		
		System.out.println("                                                         ");
		System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, and Charisma. Spend them wisely.");
		System.out.print("Strength (1-10): ");
		int d = sc.nextInt();
		int e = 20-d;
		if(d>10)
		{
		System.out.print("Please input a smaller value. Strength (1-10): ");
		d = sc.nextInt();
		e = 20-d;
		System.out.println("You have " + (e) + " left to spend.");
		System.out.println("");
		}
		else
		{
		System.out.println("You have " + (e) + " left to spend.");
		System.out.println("");
		}
		System.out.print("Dexterity (1-10): ");
		int pop = sc.nextInt();
		int lop = e-pop;
		if((pop>10) || (lop<0))
		{
		System.out.print("Please input a smaller value. Dexterity (1-10): ");
		pop = sc.nextInt();
		lop = e-pop;
		System.out.println("You have " + (lop) + " left to spend.");
		System.out.println("");
		}
		else
		{
		System.out.println("You have " + (lop) + " left to spend.");
		System.out.println("");
		}
		System.out.print("Intelligence (1-10): ");
		int f = sc.nextInt();
		int g = lop-f;
		if((f>10) || (g<0))
		{
		System.out.print("Please input a smaller value. Intelligence (1-10): ");
		f = sc.nextInt();
		g = lop-f;
		System.out.println("You have " + (g) + " left to spend.");
		System.out.println("");
		}
		else
		{
		System.out.println("You have " + (g) + " left to spend.");
		System.out.println("");
		}
		System.out.print("Charisma (1-10): ");
		int h = sc.nextInt();
		int i = g-h;
		if((h>10) || (i<0))
		{
		System.out.print("Please input a smaller value. Charisma (1-10): ");
		h = sc.nextInt();
		i = g-h;
		System.out.println("");
		System.out.println("You have " + (i) + " left to spend for next time.");
		}
		else
		{
		System.out.println("");
		System.out.println("You have " + (i) + " left to spend for next time.");
		}
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("You are " +a+ ", the " +b+  " of CVHS.");
		System.out.println("You're a " +c+ " with the following stats!");
		System.out.println("Strength - " + d);
		System.out.println("Dexterity - " + pop);
		System.out.println("Intelligence - " + f);
		System.out.println("Charisma - " + h);
		System.out.print("Good luck on your quest " +a+ "!");
	
	
	
		
		
		
		
		
		
		
		                                                        
		
		
	
		
		
		
		

	}
}


	
