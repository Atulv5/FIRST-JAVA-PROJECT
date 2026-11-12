package methodExample;

import java.util.Scanner;

public class MethodExampleMain {

	public static void main(String[] args) {
		MethodBasic method = new MethodBasic();
		Scanner sc = new Scanner(System.in);

		method.sumofTwoNumbers();

		int value = method.diffTwoNumbers();
		System.out.println("Multiplied value is " + value * 10);

		boolean isAvailable = method.isCarAvailable();

		System.out.println("The car is available " + isAvailable);

		String lastName = method.getName();
		System.out.println("Full name is Manvir " + lastName);

		// Parameterised Method
		MethodParameters mp = new MethodParameters();

		int sum = mp.sumofTwoNumbers(5, 10);
		System.out.println("Sum= " + sum);

		System.out.println("Please Enter First Name:");
		String name = sc.next();
		String lName = mp.getLastName(name);
		System.out.println("The last name " + lName);

		System.out.println("Please Enter Brand of Car:");
		String brand = sc.next();
		boolean isbrandAvailable = mp.isBrandAvailable(brand);
		System.out.println("The requested brand is available: " + isbrandAvailable);

		MethodDemo md = new MethodDemo();

		System.out.println("Please Enter Your Age:");
		int age = sc.nextInt();
		System.out.println("Are you a citizen? True or False:");
		boolean isCitizen = sc.nextBoolean();
		boolean isEligible = md.isEligibleToVote(age, isCitizen);
		System.out.println("This person is aged " + age + " and is allowed to vote: " + isEligible);

		sc.close();

	}

}
