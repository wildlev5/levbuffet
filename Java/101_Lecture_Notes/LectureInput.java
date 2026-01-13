/*
    Lecture note example - Input!!
*/
import java.util.Scanner;
class LectureInput{
    public static void main(String args[]) {
        // Your Code Goes here!
        Scanner sc = new Scanner(System.in);
        
        System.out.println("🍔Welcome to Lev's restaurant🍔");
        System.out.println("Here is our menu:");
        System.out.println("🍔burgers-$2🍔");
        System.out.println("🍗Fried Chicken-$3🍗");
        System.out.println("🐸Frog legs-$67🐸");
        System.out.println("What's the name for the order?");
        String name = sc.nextLine();
        System.out.println("How many burgers?");
        int item1 = sc.nextInt();
        System.out.println("How many order of Fried Chicken?");
        int item2 = sc.nextInt();
        System.out.println("How many order of frog legs?");
        int item3 = sc.nextInt();
        System.out.println("How much would you like to tip?");
        double tip = sc.nextDouble();
        System.out.println("------------------------------");
        System.out.println(name + "s  Receipt");
        double price1 = item1*2.0;
        double price2 = item2*3.0;
        double price3 = item3*67.0;
        System.out.println(item1 + "x Cheeseburger = $" + price1);
        System.out.println(item2 + "x Fried Chicken = $" + price2);
        System.out.println(item3 + "x Frog Legs = $" + price3);
        double total = price1 + price2 + price3 + tip;
        System.out.println("----------------------------");
        System.out.println("The Grand Total is - $" + total);
        
        
        
	}
}
