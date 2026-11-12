package superMarketBilling;

public class Product {
	int productId;
	String productName;
	double unitPrice;
	int availableStock;
	Category Category;

	public Product(int id, String name, double price, Category category, int stock) {
		productId = id;
		productName = name;
		unitPrice = price;
		Category = category;
		availableStock = stock;

		productName = productName.replace("_", " ");
		productName = productName.replaceAll("[^a-zA-Z0-9 ]", "");

	}

}
