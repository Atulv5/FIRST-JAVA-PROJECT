package licenseCheck;

public class LicenseOperator {
	int age;
	String currentLicense;
	String licenseAvailable;

	void checkLicense() {
		if (age < 16) {
			System.out.println("We can't issue you a license, age too low");
		} else if (age >= 16 && currentLicense.equals("G1")) {
			licenseAvailable = "G1";
			System.out.println("The person can get a " + licenseAvailable);
		} else if (age >= 16 && currentLicense.equals("G2")) {
			licenseAvailable = "G2";
			System.out.println("The person can get a " + licenseAvailable);
		} else if (age >= 16 && currentLicense.equals("G")) {
			licenseAvailable = "G";
			System.out.println("The person can get a " + licenseAvailable);
		} else {
			System.out.println("Invalid License! Please re-enter a proper license designation");
		}
		System.out.println("Thank you for using our license verification system");
	}
}
