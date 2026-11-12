package methodExample;

import java.util.Scanner;

public class MethodBasic {
	Scanner sc = new Scanner(System.in);

	// return type nameOfTheMethod{
	// }

	void sumofTwoNumbers() {
		int a = 5;
		int b = 7;
		int c = a + b;
		System.out.println("Sum = " + c);

	}

	// method that returns int value
	int diffTwoNumbers() {
		int a = 5;
		int b = 7;
		int c = b - a;
		return c;

	}

//Method which returns a boolean value
	boolean isCarAvailable() {
		boolean isHondaCarAvailable = true;
//		boolean isToyotaCarAvailable=false;

		if (isHondaCarAvailable) {
			return true;
		}

		return false;
	}

	String getName() {

		return "Singh";
	}
}
