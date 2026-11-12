package advancedForLoop;

public class AdvanceForLoop {

	public static void main(String[] args) {

		String[] names = { "Manvir", "Manpreet", "Blessy", "Geethu" };
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		for (String name : names) {
			System.out.println(name);
		}
		int[] rollNumber = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int i = 0; i < rollNumber.length;) {
			i=i+2;
			System.out.println(rollNumber[i]);
			if(i>rollNumber.length) {
				break;
			}
		}
		for (int rollNo : rollNumber) {
			System.out.println(rollNo);
		}
	}
}
