package methodExample;

public class Laptop {

	String brandName;
	double price;

	public Laptop(String bName, double laptopPrice) {
		brandName = bName;
		price = laptopPrice;
	}

	public double getTotalprice() {
		double totalPrice = price+calculateHST(price) + calculateCess(price);
		return totalPrice;
	}

	public double calculateHST(double price) {
		double tax = price * 0.13;
		return tax;
	}

	public double calculateCess(double price) {
		double cess = price * 0.02;
		return cess;
	}

}
