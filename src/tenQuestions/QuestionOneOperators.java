package tenQuestions;

public class QuestionOneOperators {
	int[] numbers = { 5, 9, 12, 50, 25, 62, 8, 30, 15 };
	String[] name = { "Manvir", "Atul", "Raj", "Sanjit", "Ankit", "KamalPreet" };
	int[] grades = { 75, 45, 60, 33, 88, 91 };
	int largest;
	int[] salaries = { 45000, 50000, 65200, 99850, 44520, 66520, 22000 };
	String[] products = { "Apple", "Game", "Computer", "Phone", "Chips", "Storage" };
	int[] prices = { 2, 30, 152, 105, 5, 25 };

	// Question One Write a Java program using an int array to print all numbers
	// greater than 10 AND less than 50.
	void onlyNumbers() {
		for (int number : numbers) {
			if (number > 10 && number < 50) {
				System.out.println(number);
			}
		}
	}

	// Question Two Write a Java program using an int array to print all numbers
	// that are even OR greater than 20.
	void greaterThan() {
		for (int number : numbers) {
			if (number >= 20) {
				System.out.println(number);
			}
		}

	}

	// Question 4 Write a Java program using an int array to print all numbers that
	// are divisible by 2 AND divisible by 3.
	void dividedNumber() {
		for (int number : numbers) {
			if (number % 2 == 0 && number % 3 == 0) {
				System.out.println(number);
			}

		}

	}

	// Question 5 Write a Java program using an int array to print all numbers that
	// are less than 10 OR greater than 50.
	void reverseOne() {
		for (int number : numbers) {
			if (number > 10 && number < 50) {
				System.out.println(number);
			}
		}
	}

	// Question 6 Write a Java program using a String array containing names. Use a
	// loop to print every name in the array. If the index is 0 OR 2, print "Special
	// Position"; otherwise print "Normal Position".
	void checkNames() {
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
			if (i == 0 || i == 2) {
				System.out.println("Special Position");
			} else {
				System.out.println("Normal Position");
			}
		}
	}

	// Question Seven Write a Java program using a String array of student names and
	// an int array of marks. Use the same index to print each student's name and
	// marks. If marks are 50 or above, print "Pass"; otherwise print "Fail".

	void checkGrades() {
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i] + " recieved: " + grades[i]);
			if (grades[i] >= 50) {
				System.out.println("Pass! Congratulations");
			} else {
				System.out.println("Failed - You are Here for Another Year");
			}
		}

	}

	// Question 8 Write a Java program using an int array to find the largest
	// number. Use a loop and if condition. Do not use any built-in methods.
	void largestNumber() {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > largest) {
				largest = numbers[i];
			}
		}
		System.out.println("The biggest number in the array is: " + largest);
	}

	// Question 9 Write a Java program using a String array of employee names and an
	// int array of salaries. If salary is greater than 50000 AND less than 80000,
	// print "Medium Salary". If salary is 80000 or above, print "High Salary".
	// Otherwise print "Low Salary".
	void salary() {
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i] + " has recieved $" + salaries[i]);
			if (salaries[i] > 50000 && salaries[i] < 80000) {
				System.out.println("You have recieved a medium Salary");
			} else if (salaries[i] >= 80000) {
				System.out.println("You have recieved a high Salary");
			} else {
				System.out.println("You have recieved a low Salary");

			}
		}
	}

	// Question 10 Write a Java program using a String array of product names and an
	// int array of prices. Loop through both arrays. If the price is less than 20
	// OR greater than 100, print "Special Price". Otherwise print "Normal Price".
	void productCheck() {
		for (int i = 0; i < products.length; i++) {
			System.out.println(products[i] + " The Price is: " + prices[i]);
			if (prices[i] < 20 || prices[i] > 100) {
				System.out.println("Special Price");
			} else {
				System.out.println("Normal Price");
			}
		}
	}
}
