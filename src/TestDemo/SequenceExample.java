package TestDemo;

import java.util.Scanner;

public class SequenceExample {
	Scanner sc = new Scanner(System.in);

	void sequenceOne() {
		int sum = 0;
		while (sum <= 100) {
			System.out.println("enter a number");
			sum += sc.nextInt();

		}
		System.out.println("Done: " + sum);
	}

	void divisor() {
		System.out.println("Enter a Number:");
		int n = sc.nextInt();
		boolean isPrime = true;
		for (int i = 2; i <= n / 2; i++)
			if (n % i == 0) {
				isPrime = false;
				System.out.println("Not Prime");
				break;
			}
		System.out.println(isPrime ? "Prime" : "not Prime");

	}

}