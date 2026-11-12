package manvirAssignment;

import java.util.Scanner;

//write a program for to print numbers from 10 to 1
//write a program to print all even numbers from 1 to 100
//write a program to print the factorial of a number

public class ManvirLoopsTwoOperators {
	int i;
	int v;
	int factor=1;
	Scanner sc = new Scanner(System.in);

	void numbersInReverse() {
		for (i = 10; i >= 1; i--) {
			System.out.println(i);
		}

	}

	void allEvenNumbers() {
		for (int j = 1; j <= 100; j++) {
			if (j % 2 == 0) {
				System.out.println(j);
			}

		}
	}

	// 4 =
	void factorialNumbers() {
		System.out.println("Ask for Number: ");
		v=sc.nextInt();
		for (i = 1; i <=v ; i++) {

			factor = factor * i;

		}
		System.out.println(factor);
	}
}