package superMarketBilling;

public class ShoppingCart {
	Product[] products = new Product[4];

	int[] quantities = new int[4];

	int numberOfProducts = 0;

	public ShoppingCart() {

		numberOfProducts = 0;

	}

	// Add product to shopping cart
	public void addProduct(Product product, int quantity) {

		if (numberOfProducts < products.length) {

			products[numberOfProducts] = product;

			quantities[numberOfProducts] = quantity;

			numberOfProducts++;

		}
	}

	// Check Stock
	boolean checkStock() {

		for (int i = 0; i < numberOfProducts; i++) {

			if (quantities[i] > products[i].availableStock) {

				System.out.println("Purchase Incomplete.");

				System.out.println("Not enough " + products[i].productName + " for purchase.");

				System.out.println("Available amount: " + products[i].availableStock);

				return false;

			}

		}

		return true;

	}

	// Update stock
	void updateStock() {

		for (int i = 0; i < numberOfProducts; i++) {

			products[i].availableStock = products[i].availableStock - quantities[i];

		}

	}

//	void resetStock() {
//		for (int i = 0; i < numberOfProducts; i++) {
//
//			products[i] = null;
//			quantities[i] = 0;
//
//		}
//
//		numberOfProducts = 0;
//
//	}

}
