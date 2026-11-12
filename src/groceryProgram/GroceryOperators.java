package groceryProgram;

import java.util.Scanner;

public class GroceryOperators {

	Scanner input = new Scanner(System.in);

	int customers;
	int customerNumber;
	int items;
	int itemNumber;
	int discountRate;

	double price;
	double total;
	double discount;
	double finalAmount;

	boolean freeDelivery;

	void checkDiscount() {

		System.out.println("Enter the number of customers:");
		customers = input.nextInt();

		customerNumber = 1;

		while (customerNumber <= customers ) {

			System.out.println("Customer " + customerNumber);
			System.out.println("Enter the number of items:");
			items = input.nextInt();

			total = 0;
			itemNumber = 1;

		
			while (itemNumber <= items) {

				System.out.println("Enter price of item " + itemNumber + " in dollars:");
				price = input.nextDouble();

				while (price <= 0) {
					System.out.println("Invalid price. Please enter the price again.");
					price = input.nextDouble();
				}

				System.out.println("Item " + itemNumber + " price: $" + price);

				total = total + price;
				itemNumber++;
			}
			System.out.println("Select Discount Rate");
			discountRate = input.nextInt();
			
//			//if (total >= 200) {
//				discountRate.inputInt();
//			} else if (total >= 100) {
//				discountRate;
//			} else if (total >= 50) {
//				discountRat;
//			} else {
//				discountRate;
//			}

			discount = total * discountRate / 100;
			finalAmount = total - discount;

			if (finalAmount >= 75) {
				freeDelivery = true;
			}
					
			

			System.out.println();
			System.out.println("========== RECEIPT ==========");
			System.out.println("Customer number: " + customerNumber);
			System.out.println("Number of items: " + items);
			System.out.println("Original total: $" + total);
			System.out.println("Discount amount: $" + discount);
			System.out.println("Final amount: $" + finalAmount);

			if (freeDelivery) {
				System.out.println("Free delivery available");
			} else {
				System.out.println("Delivery charges will apply");
			}

			System.out.println("=============================");
			System.out.println();

			customerNumber++;
		}

		System.out.println("All customers processed. Checkout closed.");
	
}
}

