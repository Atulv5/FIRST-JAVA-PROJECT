package discountProgram;

import java.util.Scanner;

public class DiscountMainFunction {

	public static void main(String[] args) {
		DiscountOperator discount = new DiscountOperator();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your promo code: ");
		discount.promoCode = input.next();
		discount.promoCodeEntry();
	}

}
