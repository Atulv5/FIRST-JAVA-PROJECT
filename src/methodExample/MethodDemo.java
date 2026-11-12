package methodExample;

public class MethodDemo {

	boolean isEligibleToVote(int age, boolean isCitizen) {
		if (age >= 18 && isCitizen) {
			return true;
		} else {
			return false;
		}
	}
	
}
