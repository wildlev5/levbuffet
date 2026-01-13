/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		
		int a = (int)(Math.random()*1000 + 1);
		System.out.print("Please enter a number 1-1000: ");
		int b = sc.nextInt();
		while(b!=a){
			
			if(b<a){
			System.out.println("Your number was too low, guess again.");
			b = sc.nextInt();
			}
			else if(b>a){
				System.out.println("Your number was too high, guess again.");
				b = sc.nextInt();
			}
			
		}
			
			System.out.println("You got the number!!! Congrats!");
				
				
			
			
		
	
		
		


	
		}
	}

		
	

