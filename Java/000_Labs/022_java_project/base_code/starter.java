/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
System.out.println("Slot Machine Rules:");
System.out.println("1. Each player starts with $100.");
System.out.println("2. Input a wager less than your total amount of money.");
System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
      System.out.println(" a. If two numbers match, you double your money.");
      System.out.println(" b. If three numbers match, you triple your money.");
      System.out.println(" c. If none match, you lose your money.");

			String a = ("");
			int c = 100;
			int d = 0;
			int b = 0;
			while(true){
				 	System.out.print("Would you like to play the slots? (Yes/yes/Y/y) : ");
				 	a = sc.nextLine();
				 	if(a.equals("Yes") || (a.equals("yes") || (a.equals("Y") || (a.equals("y"))))){
				 		 System.out.print("You have $" + c + ". How much would you like to wager? ");
				       b = sc.nextInt();
				       sc.nextLine();
				       while(b>c){
				 	System.out.print("You only have $" +c+"! Please enter a smaller number :");
				 	b = sc.nextInt();
				 	sc.nextLine();
				 }
				 		 System.out.println(" ");
				 System.out.println("Great! Let's play!!!");
				 System.out.println("Your rolls are: ");
				 int g = (int)(Math.random()*10 + 1);
				 int e = (int)(Math.random()*10 + 1);
				 int f = (int)(Math.random()*10 + 1);
				 System.out.println("");
				 System.out.println("___________________");
				 System.out.print(" |");
				 System.out.print(" "+g);
				 System.out.print(" |");
				 System.out.print(" "+e);
				 System.out.print(" |");
				 System.out.print(" "+f);
				 System.out.println(" |");
				 System.out.println("___________________");
				 if((g==e) || (g==f) || (e==f)){
				 	System.out.println("");
				 	System.out.println("You won! You're wager has now been doubled!");
				 	d = c-b;
				 	b = b*2;
				 	c = d+b;
				 	System.out.println("You now have $"+(c)+".");
				    }
				    else {
				 		  System.out.println("Didn't win this time, better luck next time!");
				 		  c = c-b;
				 		  System.out.println("");
				 		  System.out.println("You now have $"+c+".");
				 	      }
				 	}
			
	                 
				 		 else if(a.equals("No") || (a.equals("no"))){
				 		System.out.println("Sad to see you go! You still have $"+c+ " left. Come again soon! Thanks!");
				 		break;
				 	    }
				 	else{
				 		System.out.println("that wasn't quite the correct answer. Try again.");
				 		break;
				 		}
				 		if(c==0){
						 	System.out.println("You've run out of money! Thanks for coming! Come back soon!");
				 			break;
				 		}
				 	}
				 	
				 	
					
				 	
				 


			
					
			
		
	}
}
