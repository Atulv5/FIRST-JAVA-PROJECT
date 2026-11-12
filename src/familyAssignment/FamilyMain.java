package familyAssignment;

import java.util.Scanner;

public class FamilyMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FamilyInfo atul = new FamilyInfo("Atul", "Student", 35, "Son", true, true);
		FamilyInfo rajinder = new FamilyInfo("Rajinder", "Gas Station Owner", 70, "Father", false, true);
		FamilyInfo ankit = new FamilyInfo("Ankit", "IT", 41, "Son", true, true);
		FamilyInfo saroj = new FamilyInfo("Saroj", "Housewife", 64, "Mother", false, false);
		FamilyInfo michael = new FamilyInfo("Michael", "PSW Worker", 34, "Brother", true, true);

		FamilyInfo[] verma = { atul, rajinder, ankit, saroj,michael };

		String again = "yes";

		while (again.equalsIgnoreCase("yes")) {

			System.out.println("Please Enter the Name of the person that you would like to know about:");
			String fName = sc.next();
			System.out.println("Please confirm their role in the family: ");
			String fRoles = sc.next();
			System.out.println("Can They speak english fluently? True or False");
			boolean isFluent = sc.nextBoolean();
			boolean conditionsFound= false;

			for (int i = 0; i < verma.length; i++) {
				if (fName.equalsIgnoreCase(verma[i].firstName) && fRoles.equalsIgnoreCase(verma[i].role)
						&& isFluent == verma[i].isFluentInEnglish) {
					System.out.println("The Person's first name is: " + verma[i].firstName);
					System.out.println("Their Age is: " + verma[i].age);
					System.out.println("Their role in the family is: " + verma[i].role);
					System.out.println("Are they learning programming? " + verma[i].isLearningProgramming);
					System.out.println("Are they Fluent in English? " + verma[i].isFluentInEnglish);
					System.out.println("The family member's occupation is: " + verma[i].jobRole);
					conditionsFound=true;
					break;
				}

				if(conditionsFound) {
					System.out.println("The information does not match our records");
				}

			}
			System.out.println("Would you like to search for another person? yes/no");
			again = sc.next();
		}
		System.out.println("Thank you for using our family program!");
		sc.close();
	}

}
