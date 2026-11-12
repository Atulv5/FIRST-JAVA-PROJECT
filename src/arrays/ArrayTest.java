package arrays;

import java.util.Arrays;

//write a program to remove all numbers divisible by both 3 and 5 from an int array and print remaining numbers
public class ArrayTest {
	int[] numbers = { 1, 15, 30, 18, 5, 66, 7, 8, 9, 10 };

	void divisibleNumbers() {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 3 == 0 && numbers[i] % 5 == 0) {
				System.out.println(numbers[i]);
			}

		}

	}

}
