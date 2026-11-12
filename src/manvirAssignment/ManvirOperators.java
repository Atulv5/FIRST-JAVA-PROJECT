package manvirAssignment;

public class ManvirOperators {

	double scoreInput;
	boolean sportsQuota;
	int attendance;

	void scoreOutput() {

		switch (attendance <= 60 ? 0 : 1) {

		case 0:
			System.out.println("You have failed to attend the minimum percentage of Classes: " + attendance);
			break;

		case 1:

			int score = (int) scoreInput;

			switch (score) {

			// Scores 0 - 50 = F
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
			case 11:
			case 12:
			case 13:
			case 14:
			case 15:
			case 16:
			case 17:
			case 18:
			case 19:
			case 20:
			case 21:
			case 22:
			case 23:
			case 24:
			case 25:
			case 26:
			case 27:
			case 28:
			case 29:
			case 30:
			case 31:
			case 32:
			case 33:
			case 34:
			case 35:
			case 36:
			case 37:
			case 38:
			case 39:
			case 40:
			case 41:
			case 42:
			case 43:
			case 44:
			case 45:
			case 46:
			case 47:
			case 48:
			case 49:
			case 50:

				// Sports Quota applies to 30 - 49.5
				if (sportsQuota == true && scoreInput >= 30 && scoreInput <= 49.5) {

					scoreInput = scoreInput + (scoreInput * 0.1);

					System.out.println("You have recieved the Grade of D due to Sports Quota " + "and final score is "
							+ scoreInput);

				} else {
					System.out.println("You have recieved the grade of F");
				}
				break;

			// Grade D: 51 - 59
			case 51:
			case 52:
			case 53:
			case 54:
			case 55:
			case 56:
			case 57:
			case 58:
			case 59:
				System.out.println("You have recieved the Grade of D");
				break;

			// Grade C: 60 - 69
			case 60:
			case 61:
			case 62:
			case 63:
			case 64:
			case 65:
			case 66:
			case 67:
			case 68:
			case 69:
				System.out.println("You have recieved the Grade of C");
				break;

			// Grade B: 70 - 79
			case 70:
			case 71:
			case 72:
			case 73:
			case 74:
			case 75:
			case 76:
			case 77:
			case 78:
			case 79:
				System.out.println("You have recieved the Grade of B");
				break;

			
			case 80:
			case 81:
			case 82:
			case 83:
			case 84:
			case 85:
			case 86:
			case 87:
			case 88:
			case 89:
			case 90:
			case 91:
			case 92:
			case 93:
			case 94:
			case 95:
			case 96:
			case 97:
			case 98:
			case 99:
			case 100:
				System.out.println("You have recieved the Grade of A");
				break;

			default:
				System.out.println("Invalid score");
				break;
			}

			break;
		}
	}
}


////take an input from user and print the grades on a scoring algorithm
////if a student is from sports quota, they should not get f if their score is above 30 but less than 50
////add attendance percentage if it is less than 60% even sports quota should fail
////if somebody has a sportsquota, they will get an additional 10%
//
//	void scoreOutput() {
//		if (attendance <= 60) {
//			System.out.println("You have failed to attend the minimum percentage of Classes: " + attendance);
//		} else if (scoreInput >= 30 && scoreInput <= 49.5 && sportsQuota == true) {
//			scoreInput=(scoreInput+(scoreInput*0.1));
//			System.out.println("You have recieved the Grade of D due to Sports Quota and final score is " + scoreInput);
//		} else if (scoreInput >= 0 && scoreInput <= 49) {
//			System.out.println("You have recieved the grade of F");
//		} else if (scoreInput >= 50 && scoreInput <= 59) {
//			System.out.println("You have recieved the Grade of D");
//		} else if (scoreInput >= 60 && scoreInput <= 69) {
//			System.out.println("You have recieved the Grade of C");
//		} else if (scoreInput >= 70 && scoreInput <= 79) {
//			System.out.println("You have recieved the Grade of B");
//		} else if (scoreInput >= 80 && scoreInput <= 100) {
//			System.out.println("You have recieved the Grade of A");
//		}
//
//	}
