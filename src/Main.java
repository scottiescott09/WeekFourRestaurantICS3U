import java.util.*;

/*******************************
 * Name: Your name Class: ICS3U Date: Friday Sept. 25 Project Name: Restaurant
 * 
 * You will have your first real project this week. You must meet all of the
 * following criteria: Create a restaurant of your choosing Print menu items one
 * at a time, including the price. Ask how many of each item they would like to
 * purchase Must have at least 5 different menu items Calculate the total price
 * If the total is more than $30, take off 10%. If the total is more than $50,
 * take off 20%. Add 13% HST to the total Print out the initial price, any
 * discounts, taxes, and the grand total. Read in a payment amount from the user
 * Calculate the change If the change is negative, state that they still owe you
 * money. This is to be done individually. DO NOT use AI! Feel free to use
 * previous notes, videos, and online resources like w3schools.com Fork the
 * repository, add me (MrZebarth) as a collaborator, clone the repository to
 * your computer, program your solution, and then commit and push the results.
 ********************************/
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// Create a restaurant of your choosing
		System.out.println("Welcome to Drake's Funhouse!\n");
		// Print menu items one at a time, including the price.
		System.out.println("Menu:");
		System.out.println("1. Drake's Water | 1.99$");
		System.out.println("2. Drake's Crazy Fries | 4.99$");
		System.out.println("3. Drake's White Sauce | 0.50$");
		System.out.println("4. Drake's Fun Burger | 6.99$");
		System.out.println("5. Drake's Purple Sprite | 2.50$");
		int Order = in.nextInt();
		if (Order == 1) {
			System.out.println("How many Drake's Water would you like? : ");
			int Amount1 = in.nextInt();
			in.nextLine();
			double tax = 1.13;
			double price = 1.99;
			int quantity = Amount1;
			double fullprice = tax * price * quantity;
				if (fullprice >= 30) {
					double (fullprice/0.10);
				}else if (fullprice >= 50) {
					double (fullprice / 0.20);
			System.out.println("Would you like to go back to the menu?: Y/N ");
			String Menu1 = in.nextLine();
			if (Menu1.equalsIgnoreCase("y")) {
				System.out.println("Menu:");
				System.out.println("1. Drake's Water | 1.99$");
				System.out.println("2. Drake's Crazy Fries | 4.99$");
				System.out.println("3. Drake's White Sauce | 0.50$");
				System.out.println("4. Drake's Fun Burger | 6.99$");
				System.out.println("5. Drake's Purple Sprite | 2.50$");
			} else if (Order == 2) {
				System.out.println("How many Drake's Crazy fries would you like? : ");
				int Amount2 = in.nextInt();
				in.nextLine();
				double tax2 = 1.13;
				double price2 = 4.99;
				int quantity2 = Amount2;
				double fullprice2 = tax2 * price2 * quantity2;
					if (fullprice2 >= 30) {
						double (fullprice2/0.10);
					}else if (fullprice2 >= 50) {
						double (fullprice2 / 0.20);
				System.out.println("Would you like to go back to the menu?: Y/N ");
				String Menu = in.nextLine();
				if (Menu.equalsIgnoreCase("y")) {
					System.out.println("Menu:");
					System.out.println("1. Drake's Water | 1.99$");
					System.out.println("2. Drake's Crazy Fries | 4.99$");
					System.out.println("3. Drake's White Sauce | 0.50$");
					System.out.println("4. Drake's Fun Burger | 6.99$");
					System.out.println("5. Drake's Purple Sprite | 2.50$");
				}
			} else if (Order == 3) {
				System.out.println("How many Drake's white sauce would you like?: ");
				int Amount3 = in.nextInt();
				in.nextLine();
				double tax3 = 1.13;
				double price3 = 0.50;
				int quantity3 = Amount3;
				double fullprice3 = tax3 * price3 * quantity3;
					if (fullprice3 >= 30) {
						double (fullprice3/0.10);
					}else if (fullprice3 >= 50) {
						double (fullprice3 / 0.20);
				System.out.println("Would you like to go back to the menu?: Y/N ");
				String Menu3 = in.nextLine();
				if (Menu3.equalsIgnoreCase("y")) {
					System.out.println("Menu:");
					System.out.println("1. Drake's Water | 1.99$");
					System.out.println("2. Drake's Crazy Fries | 4.99$");
					System.out.println("3. Drake's White Sauce | 0.50$");
					System.out.println("4. Drake's Fun Burger | 6.99$");
					System.out.println("5. Drake's Purple Sprite | 2.50$");

				}
			} else if (Order == 4) {
				System.out.println("How many Drake's Fun burger would you like?: ");
				int Amount4 = in.nextInt();
				in.nextLine();
				double tax4 = 1.13;
				double price4 = 6.99;
				int quantity4 = Amount4;
				double fullprice4 = tax4 * price4 * quantity4;
					if (fullprice4 >= 30) {
						double (fullprice4/0.10);
					}else if (fullprice4 >= 50) {
						double (fullprice4 / 0.20);
					}
				System.out.println("Would you like to go back to the menu?: Y/N ");
				String Menu4 = in.nextLine();
				if (Menu4.equalsIgnoreCase("y")) {
					System.out.println("Menu:");
					System.out.println("1. Drake's Water | 1.99$");
					System.out.println("2. Drake's Crazy Fries | 4.99$");
					System.out.println("3. Drake's White Sauce | 0.50$");
					System.out.println("4. Drake's Fun Burger | 6.99$");
					System.out.println("5. Drake's Purple Sprite | 2.50$");
				}
			}
			} else if (Order == 5) {
				System.out.println("How many Drake's Purple Sprite would you like?: ");
				int Amount5 = in.nextInt();
				in.nextLine();
				double tax5 = 1.13;
				double price5 = 2.50;
				int quantity5 = Amount5;
				double fullprice5 = tax5 * price5 * quantity5;
					if (fullprice5 >= 30) {
						double (fullprice5/0.10);
					}else if (fullprice5 >= 50) {
						double (fullprice5/0.20);
					}
				System.out.println("Would you like to go back to the menu?: Y/N ");
				String Menu5 = in.nextLine();
				if (Menu5.equalsIgnoreCase("y")) {
					System.out.println("Menu:");
					System.out.println("1. Drake's Water | 1.99$");
					System.out.println("2. Drake's Crazy Fries | 4.99$");
					System.out.println("3. Drake's White Sauce | 0.50$");
					System.out.println("4. Drake's Fun Burger | 6.99$");
					System.out.println("5. Drake's Purple Sprite | 2.50$");
					
				
				} else {
					System.out.println("Your total will be: " + fullprice);
				}

			}
		}
}

}
