package learnOperations;

public class operatorsMain {

	public static void main(String[] args) {
		ArithimeticOperators ao = new ArithimeticOperators();
		ao.addTwoNumbers();
		// Assigning the values

		ao.num1 = 8;
		ao.num2 = 10;
		// Invoking the method
		ao.addTwoNumbers();
		ao.subtractTwoNumbers();
		ao.divideTwoNumbers();
		System.out.println("Reassigning the Values");
		// Reassigning/Updating the values

		ao.num1 = 15;
		ao.num2 = 6;

		ao.addTwoNumbers();
		ao.subtractTwoNumbers();
		ao.multiplyTwonumbers();
		ao.divideTwoNumbers();
		ArithimeticOperators ao1 = new ArithimeticOperators();
		ao1.num1 = 45;
		ao1.num2 = 10;
		ao1.divideTwoNumbers();

		AssignmentOperator ao2 = new AssignmentOperator();
		ao2.findAgeAfterFiveYears();
		ao2.findAgeBefore10Years();

	}

}
