package tenQuestions;
//Question 3 Write a Java program using an int array to count how many numbers are positive, negative, and zero using if-else conditions.
public class QuestionThreeOperators {
	int []number = {5,-2,8,0,12,-3,-7,-1,3};
	int positive;
	int negative;
	int zero;
	
	void checkNumbers() {
	for (int check : number)	{
		if(check>0) {
			positive++;
		}
		else if(check<0) {
			negative++;
		}
		else {
			zero++;
		}
		}
	System.out.println("The amount of positive numbers is: "+positive);
	System.out.println("The amount of negative numbers is: "+negative);
	System.out.println("The amount of zeroes is: "+zero);
	}
	}

