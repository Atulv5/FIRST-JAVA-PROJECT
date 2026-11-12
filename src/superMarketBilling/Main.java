
package superMarketBilling;

public class Main {

	public static void main(String[] args) {

		// Declaring Products

		Product freshMilk = new Product(101, "Fresh Milk!!", 4.00, Category.DAIRY, 20);

		Product brownBread = new Product(102, "Brown@@Bread", 3.50, Category.BAKERY, 15);

		Product appleJuice = new Product(103, "Apple###Juice", 5.00, Category.BEVERAGES, 10);

		Product riceBag = new Product(104, "Rice_Bag", 12.00, Category.GROCERY, 8);

		// Declaring Customers

		Customer rahul = new Customer("Rahul Sharma", true, "C1001");

		Customer john = new Customer("John", false, "C1002");

		BillGenerator bill = new BillGenerator();

		// Purchases

		System.out.println("Rahul's Purchase");

		ShoppingCart cart1 = new ShoppingCart();

		cart1.addProduct(freshMilk, 3);
		cart1.addProduct(brownBread, 2);
		cart1.addProduct(appleJuice, 1);
		cart1.addProduct(riceBag, 2);

		bill.generateBill(rahul, cart1);

		// SCENARIO A
		System.out.println("");
		System.out.println("");
		System.out.println("");

		System.out.println("INSUFFICIENT STOCK");

		ShoppingCart cart2 = new ShoppingCart();

		cart2.addProduct(appleJuice, 15);

		bill.generateBill(rahul, cart2);

		System.out.println("");

		// SCENARIO B -
		System.out.println("");
		System.out.println("");
		System.out.println("");

		System.out.println("Regular Customer");
		System.out.println("John's Purchase");

		ShoppingCart cart3 = new ShoppingCart();

		cart3.addProduct(freshMilk, 2);

		bill.generateBill(john, cart3);

	}

}
