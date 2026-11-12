package constructorExample;

import java.util.Scanner;

public class MainConstructor {

	public static void main(String[] args) {

		BankAccount samAcc = new BankAccount("987654", "Sam", 500);

		BankAccount mariaAcc = new BankAccount("978265", "Maria", 1500);

		BankAccount rahulAcc = new BankAccount("987365", "Rahul", 2500);

		BankAccount geetuAcc = new BankAccount("987565", "Geetu", 3500);

		System.out.println(mariaAcc.balance);
		System.out.println(samAcc.balance);
		System.out.println(rahulAcc.balance);
		System.out.println(geetuAcc.balance);
		Scanner sc = new Scanner(System.in);
		String statusOfPerson = sc.next();

		if (statusOfPerson.equals("Student") || statusOfPerson.equals("WP")) {
			System.out.println("Enter the Account");
			String account = sc.next();
			System.out.println("Enter the Name");
			String name = sc.next();
			System.out.println("Enter the Balance");
			double balance = sc.nextInt();
			System.out.println("Enter the Status");
			String status = sc.next();

			BankAccount acc = new BankAccount(account, name, balance, status);

		}
	}

}
