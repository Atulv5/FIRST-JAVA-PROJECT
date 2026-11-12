package superMarketBilling;

public enum Category {

	DAIRY("Dairy", 0.05),

	BAKERY("Bakery", 0.10),

	BEVERAGES("Beverages", 0.08),

	GROCERY("Grocery", 0.03),

	FRUITS("Fruits", 0.12);

	String Category;

	double discount;

	private Category(String cat, double disc) {

		Category = cat;

		discount = disc;

	}

	public String getCategory() {

		return Category;

	}

	public double getDiscount() {

		return discount;

	}

}
