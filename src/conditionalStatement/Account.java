package conditionalStatement;

public class Account {

	double balanceAmount;

	int withdrawAmount;

	int overDraftAmount;

	int pinNumber;

	int enteredPin;

	// If customer has enough balance (balanceAmount>= withdrawAmount)
	// (OR) ||
	// if customer has enough overdraft (overdraft>=withdrawAmount)

	void atmWithdrawl() {

		if (balanceAmount >= withdrawAmount || overDraftAmount >= withdrawAmount) {
			System.out.println("Customer can withdraw cash");
		} else {
			System.out.println("Not Enough Balance");
		}
	}

	void validatePinandWithdrawCash() {
			if (pinNumber==enteredPin);
			System.out.println("The Pin is correct, Enjoy your cash");
			if (balanceAmount >= withdrawAmount || overDraftAmount >= withdrawAmount) {
				System.out.println("Customer can withdraw cash");
			} else {
				System.out.println("Not Enough Balance");
			} else {
				System.out.println("Invalid Pin");
			}
				

}

}