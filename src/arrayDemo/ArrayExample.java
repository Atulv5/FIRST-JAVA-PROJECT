package arrayDemo;

public class ArrayExample {
	// Store values of same type and nature
	// Store first 5 prime numbers
	// Declare an array

	// type name=value
	int[] primeNumbers = { 2, 3, 5, 7, 11 };

	// length of array= number of elements in array
	// Declaring array 2nd way

	int[] primeNum = new int[5];
	int[] rollNum = new int[50];

	void addValuesToArray() {
		primeNum[0] = 5;
		primeNum[1] = 10;
		primeNum[2] = 9;
		primeNum[3] = 3;
		primeNum[4] = 1;

	}

	void populateRollNumArray() {

		for (int i = 0; i < 50; i++) {

			rollNum[i] = i + 1;
		}
	}
}
