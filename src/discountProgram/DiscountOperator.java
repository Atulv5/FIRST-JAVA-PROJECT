package discountProgram;

import java.util.Scanner;

public class DiscountOperator {
	int productPrice = 100;
	String promoCode;
	int baseDiscount = 50;
	int additionalDiscount = 0;
	int finalDiscount = 0;
	int discountedValue = 0;

	void promoCodeEntry() {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter your promo code: ");
		promoCode = input.next();

		if (promoCode.equals("Promo5")) {
			additionalDiscount = 5;
		} else if (promoCode.equals("Promo10")) {
			additionalDiscount = 10;
		} else if (promoCode.equals("Promo20")) {
			additionalDiscount = 20;
		} else {
			additionalDiscount = 0;
			System.out.println("Invalid Promo Code");
		}
	}

	void finalPrice() {

		finalDiscount = baseDiscount + additionalDiscount;
		discountedValue = productPrice - (productPrice * finalDiscount / 100);
		System.out.println("Your Final Price is " + discountedValue);
	}
}
