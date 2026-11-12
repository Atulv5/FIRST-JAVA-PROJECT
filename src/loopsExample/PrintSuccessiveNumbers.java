package loopsExample;

public class PrintSuccessiveNumbers {
	int number;
	int finalNumber;

	// Print Successive numbers but skip 13
	void printSuccNumbers() {
		while (number <= finalNumber) {
			if (number != 13)
				;
			System.out.println(number);
		}
		{

////			number += 1;
			number++;
			if (number == 13) {
				System.out.println(" ");

			} else {
				System.out.println(number);

				number += 1;
			}
		}
		}

	void printNumbersInReverse() {
		while (finalNumber >= number) {
			System.out.println(finalNumber);
			finalNumber--;
		}
	}
	void printNumbersStopAt13() {
		while (number <= finalNumber) {
			if (number == 13) {
				break;

			}
			System.out.println("");
			number += 1;

		}
	number++;


	}

}