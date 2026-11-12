package loopsExample;

import java.util.Scanner;

public class LoopsTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Input how many times you want to do the Loop");
//		int max = sc.nextInt();
		System.out.println("Number would you like to have Multiplication Table of up to 10?  ");
		int start = sc.nextInt();
		
		
		for (int i = start; i <= 10; i++) {
			System.out.println(" ");
			for (int j = 1; j <= 10; j++) {
				System.out.print((i * j) + " ");
			}
			System.out.println();
		}
//		System.out.println("Happy New Year");
	}

}
