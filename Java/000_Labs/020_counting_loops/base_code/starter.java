/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your name.");
		String name = sc.nextLine();
		System.out.println("Please enter an integer.");
		int a = sc.nextInt();
		int count = 0;
		while(true){
			System.out.println(count + ". " + name);
			 count = count + 1;
			if(count==a){
				break;
			}
		}

		
	}
}
