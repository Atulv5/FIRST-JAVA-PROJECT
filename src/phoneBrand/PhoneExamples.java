package phoneBrand;

import java.util.Scanner;

public class PhoneExamples {

    Scanner input = new Scanner(System.in);

    String[] samsung = { "S20", "S21", "Flip3", "Fold3" };
    String[] google = { "Google Pixel 6", "Google Pixel 6 Pro", "Google Pixel Pro", "Google Pixel 5" };
    String[] apple = { "Iphone12", "Iphone 12 mini", "Iphone 11", "Iphone 10" };

    String brand;
    String product;
    boolean found;
    int i;

    void checkPhone() {

        System.out.println("Enter a phone brand: Samsung, Google, or Apple");
        brand = input.nextLine();

        if (brand.equals("Samsung")) {

            System.out.println("Available Samsung products:");

            for (i = 0; i < samsung.length; i++) {
                System.out.println(samsung[i]);
            }

            System.out.println("Enter one of the Samsung products:");
            product = input.nextLine();

            found = false;

            for (i = 0; i < samsung.length; i++) {
                if (product.equals(samsung[i])) {
                    found = true;
                }
            }

            if (found) {
                System.out.println("Product selected is : " + product);
            } else {
                System.out.println("Please select a product from the list");
            }

        } else if (brand.equals("Google")) {

            System.out.println("Available Google products:");

            for (i = 0; i < google.length; i++) {
                System.out.println(google[i]);
            }

            System.out.println("Enter one of the Google products:");
            product = input.nextLine();

            found = false;

            for (i = 0; i < google.length; i++) {
                if (product.equals(google[i])) {
                    found = true;
                }
            }

            if (found) {
                System.out.println("Product selected is : " + product);
            } else {
                System.out.println("Please select a product from the list");
            }

        } else if (brand.equals("Apple")) {

            System.out.println("Available Apple products:");

            for (i = 0; i < apple.length; i++) {
                System.out.println(apple[i]);
            }

            System.out.println("Enter one of the Apple products:");
            product = input.nextLine();

            found = false;

            for (i = 0; i < apple.length; i++) {
                if (product.equals(apple[i])) {
                    found = true;
                }
            }

            if (found) {
                System.out.println("Product selected is : " + product);
            } else {
                System.out.println("Please select a product from the list");
            }

        } else {
            System.out.println("Please enter Samsung, Google, or Apple.");
        }
    }
}