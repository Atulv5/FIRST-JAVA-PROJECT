package loopsExample;

import java.util.Scanner;

public class ForLoopExample {
	Scanner sc = new Scanner(System.in);
	int actualPin;
	int enteredPin;
	boolean isPinValid;


	void validatePin() {
		for (int numOfAttempts = 1; numOfAttempts <= 3; numOfAttempts++) {
		
			System.out.println("Enter your PIN");
			enteredPin = sc.nextInt();
			if (enteredPin == (actualPin)) {
				isPinValid = true;
				System.out.println("Pin is correct");
				break;
			} else {
				isPinValid = false;
				System.out.println("Pin is Incorrect");

			}
			numOfAttempts = 1;

		}
		 
		 }
	void updatePin() {
		 actualPin=sc.nextInt();
	}
}
