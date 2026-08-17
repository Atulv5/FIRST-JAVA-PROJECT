package discountProgram;

public class DiscountOperator {
	int productPrice = 100;
	String promoCode = "Promo10";
	String enteredPromo;
	int baseDiscount = 50;
	int additionalDiscount=0;
	int finalDiscount=0;
	int discountedValue=0;
	
	void promoCodeEntry() {
	
	if (promoCode == "Promo5") {
	    additionalDiscount = 5;
	}
	else if (promoCode == "Promo10") {
	    additionalDiscount = 10;
	}
	else if (promoCode == "Promo20") {
	    additionalDiscount = 20;}
	}
	void finalPrice() {
 

	finalDiscount = baseDiscount + additionalDiscount;
	discountedValue = productPrice - (productPrice * finalDiscount / 100);
	System.out.println("Your Final Price is "+discountedValue);
	}
	}
	


