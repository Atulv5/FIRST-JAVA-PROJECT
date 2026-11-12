package javaCoding;

public class JavaCodingOperators {
	String[] employees = { "John", "Alice", "Bob", "David", "Emma", "Mike" };
	int[] scores = { 85, 42, 91, 76, 55, 68 };

	void LowestValue() {
		int lowest = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] < scores[lowest]) {
				lowest = i;
			}
		}
		System.out.println("The Lowest Value in the array is: " + scores[lowest]);
	}

//first question
	void topPerformer() {
		int max = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] > scores[max]) {
				max = i;

			}
		}
		System.out.println("The top performer is: " + employees[max] + " and their score was: " + scores[max]);
	}

//second question
	void countEmployees() {
		int count = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= 60) {
				count++;
			}
		}
		System.out.println("The Number of Employees that have passed is: " + count);

	}

//Third Question
	void averageScore() {
		int total = 0;
		for (int i = 0; i < scores.length; i++) {
			total += scores[i];

		}
		double average = total / scores.length;
		System.out.println("The average score was: " + average);

	}

//Fourth question
	void eligibleEmployees() {
		System.out.println("Employees that are in that range are: ");
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= 70 && scores[i] <= 90) {
				System.out.println(employees[i] + " - " + scores[i]);
			}
		}
	}

//fifth question
	void improveScores() {
		System.out.println("These Employees need improvement: ");
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] < 50 || (scores[i] >= 50 && scores[i] <= 59)) {
				System.out.println(employees[i] + " - " + scores[i]);
			}
		}
	}

//sixth question
	void secondHighest() {
		int highest = 0;
		int secondHighest = 0;

		for (int i = 0; i < scores.length; i++) {
			if (scores[i] > highest) {
				secondHighest = highest;
				highest = scores[i];
			} else if (scores[i] > secondHighest && scores[i] < highest) {
				secondHighest = scores[i];

			}
		}
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] == secondHighest) {
				System.out.println("The Second highest employee is: " + employees[i] + " - " + scores[i]);
			}
		}

	}

	String performancePlacement(int score) {
		if (score >= 90 && score <= 100) {
			return "Excellent";
		} else if (score >= 75) {
			return "Good";
		} else if (score >= 60) {
			return "Average";
		} else {
			return "Needs Improvement";

		}
	}

//seventh question
	void performanceImprovement() {
		System.out.println("These are how the employees are doing: ");
		for (int i = 0; i < scores.length; i++) {
			System.out.println(employees[i] + " - " + scores[i] + " - " + performancePlacement(scores[i]));
		}
	}

//eighth question
	void reverseNames() {
		for (int i = employees.length; i <= 0; i--) {
			System.out.println(employees[i] + " - " + scores[i]);
			;

		}
	}

//bonus challenge
	void bonusChallenge() {
		int total = 0;
		int maxScore = scores[0];

		for (int i = 0; i < scores.length; i++) {
			total += scores[i];
			if (scores[i] > maxScore) {
				maxScore = scores[i];
			}

		}
		int average = total / scores.length;
		System.out.println("The Average score is: " + average);
		System.out.println("Highest Score is " + maxScore);
		for (int i = 0; i < employees.length; i++) {
			if (scores[i] > average && scores[i] < maxScore) {
				System.out.println("The employees in between are " + employees[i] + " - " + scores[i]);

			}
		}
	}
}
