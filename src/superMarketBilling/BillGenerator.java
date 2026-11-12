package superMarketBilling;

import java.text.DecimalFormat;

public class BillGenerator {
	 
	void generateBill(Customer customer, ShoppingCart cart) {

	        // Check for stock

	        if (!cart.checkStock()) {
	        	return;
	        }
	        double purchasePrice = 0;

	        double categoryDiscount = 0;

	        double memberDiscount=0;

	        double postDiscount=0;

	        double finalAmount=0;
	        
	        DecimalFormat df = new DecimalFormat("#.00");


	        // Calculate Price and Discounts

	        for (int i = 0; i < cart.numberOfProducts; i++) {

	            Product product = cart.products[i];

	            int quantity = cart.quantities[i];

	            double amount = product.unitPrice * quantity;

	            double discount = amount * product.Category.getDiscount();

	            purchasePrice = purchasePrice + amount;

	            categoryDiscount = categoryDiscount + discount;

	        }


	        // Calculate amount for categories

	        postDiscount = purchasePrice - categoryDiscount;


	        // Check Membership

	        if (customer.isPremium) {

	            memberDiscount = postDiscount * 0.05;

	        } else {

	            memberDiscount = 0;

	        }


	        // Calculate final amount

	        finalAmount = postDiscount - memberDiscount;


	        System.out.println("====================================");

	        System.out.println("        SUPERMARKET RECEIPT");

	        System.out.println("====================================");

	        System.out.println("Customer: " + customer.nameOfCustomer);

	        if (customer.isPremium == true) {

	            System.out.println("Membership: PREMIUM");

	        } else {

	            System.out.println("Membership: REGULAR");

	        }

	        System.out.println("Product        Qty       Amount");

	        System.out.println("------------------------------------");


	        // Display products

	        for (int i = 0; i < cart.numberOfProducts; i++) {

	            Product product = cart.products[i];

	            int quantity = cart.quantities[i];

	            double amount = product.unitPrice * quantity;

	            System.out.println(product.productName + "          " + df.format(quantity) + "       $" + df.format(amount));	            

	        }


	        System.out.println("------------------------------------");

	        System.out.println("Purchase Price: $" + df.format(purchasePrice));
	        System.out.println("Category Discount: $" + df.format(categoryDiscount));
	        System.out.println("Post Sale Discounts: $" + df.format(postDiscount));
	        System.out.println("Membership Benefit: $" + df.format(memberDiscount));
	        System.out.println("Final Amount: $" + df.format(finalAmount));
	        
	        System.out.println("====================================");

	        cart.updateStock();


	        // Display remaining stock
	        System.out.println("");
	        System.out.println("Remaining Stock:");

	        for (int i = 0; i < cart.numberOfProducts; i++) {

	            System.out.println(cart.products[i].productName
	                    + ": " + cart.products[i].availableStock);
	        }
	        

	    }

	}
	


