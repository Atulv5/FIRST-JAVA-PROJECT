package tenQuestions;

import java.util.Scanner;

//write a program with a int array, having some integers and input from scanner to see if number is present in array
public class AtulsTest {
	Scanner sc = new Scanner(System.in);
	int j;
	boolean isAvailable;

	int[] numbers = { 1, 3, 5, 7, 8, 9 };

	void checkNumber() {
		System.out.println("Please Enter a number");
		j = sc.nextInt();
		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] == j) {
				System.out.println("The Number is in the array:" + j);
				isAvailable = true;
			}

		}
		if (!isAvailable) {
			System.out.println("The Number is not in the array");
		}
	}
}
