import java.util.Scanner;

public class Management_Sys {
	static int[] unit_price = { 0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 }; // price information
	static int[] unit_stock = { 0, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 }; // unit present stock
	static boolean flag = true; // loop breaker

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to our stock management system.");
		while (flag) {
			System.out.print("select menu : (1. view unit price, 2. add purchasing product, 3.view total price) > ");
			int menu = scanner.nextInt();
			switch (menu) {
			case 1:
				view_unit_price();
				break;
			case 2:
				add_purchasing_unit();
				break;
			case 3:
				total_price();
				break;
			}
			System.out.println();
		}
	}

	public static void view_unit_price() {
		System.out.printf("what is the unit type?(1-10) : ");
		Scanner scanner = new Scanner(System.in);
		int unit = scanner.nextInt();
		System.out.println("type " + unit + " price is " + unit_price[unit] + "$");
	}

	public static void add_purchasing_unit() {
		System.out.printf("What are you going to buy? Please enter type : ");
		Scanner scanner = new Scanner(System.in);
		int unit = scanner.nextInt();
		System.out.printf("How many will you buy? : ");
		int purchase = scanner.nextInt();
		System.out.println("The type of item you want to purchase is a "+unit+" and currently there is "+unit_stock[unit]+" stock of this type");
		if(unit_stock[unit]<purchase) {
			System.out.println("the product is out of stock");
		}
		unit_stock[unit]+=purchase;
		System.out.println("The stock after the purchase became "+unit_stock[unit]);
	}

	public static void total_price() {
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			sum += unit_stock[i] * unit_price[i];
		}
		System.out.println("total price is " + sum + "$");
		System.out.println("Good Bye!");
		flag = false;
	}
}
