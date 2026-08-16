package conditionalStatement;

import java.util.Scanner;

public class ATMMain {

	public static void main(String[] args) {
		Account suryaAccount = new Account();
		Scanner sc = new Scanner(System.in);
		suryaAccount.balanceAmount = 7850;
		suryaAccount.overDraftAmount = 10000;
		System.out.println("Enter the amount to withdraw");
		suryaAccount.withdrawAmount = sc.nextInt();
		suryaAccount.pinNumber = 1234;
		suryaAccount.enteredPin = sc.nextInt();
		suryaAccount.validatePinandWithdrawCash();
		suryaAccount.atmWithdrawl();

	}

}
