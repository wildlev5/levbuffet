/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a number ");
		int number = sc.nextInt();
		System.out.println("Here are the next 5 numbers!");
		int a = number + 1;
		int b = number + 2;
		int c = number + 3;
		int d = number + 4;
		int e = number + 5;
		System.out.println(number+"," + a+"," +  b+","  + c+","  + d+"," + e );
		System.out.println("Here are the next 5 multiples of " + number + "!");
		int f = number*2;
		int g = number*3;
		int h = number*4;
		int i = number*5;
		int j = number*6;
		System.out.println(number+"," + f+"," + g+"," + h+"," + i+"," + j);
		System.out.println("Here is " + number + " divided by 100!");
		double k = number/100.0;
		System.out.println(k);
		System.out.println("Here is " + number + " divided by 10!");
		double l = number/10.0;
		System.out.print(l);
		


	}
}
