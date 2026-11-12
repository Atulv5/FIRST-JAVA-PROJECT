package manvirAssignment;

import java.util.Scanner;

//to print the table of any number when input is given via scanner console
public class ManvirLoops {
	Scanner sc = new Scanner(System.in);
	int num1;
	int num2;
	void timesTable() {
		System.out.println("Please enter a number to Multiply");
		num1 = sc.nextInt();
		System.out.println("The times table for " + num1 + " is: ");
		for (int i = 1; i <= 10; i++) {
			System.out.println(num1 + " and " + i + " is equal to:");
			System.out.println(num1 * i);
		}

	}

	void calculateSum() {
		System.out.println("Please enter the number that you'd like to Loop for sum: ");
		num2=sc.nextInt();
		int sum=0;
		System.out.println("The sum for "+num2+" is ");
		
	
		for (int j=1; j<=num2;j++) {
			sum=sum+j;
			
			
		}
		System.out.println("The Sum of the number is: "+sum);
		
}
}