package licenseCheck;

public class LicenseOperator {
	int age=20;
	String newLicense;
	int enteredAge;

	void checkLicense() {
		if (age == 16) {
			newLicense = ("G1");
			System.out.println(";This driver can be issued a "+newLicense);
		}
		else if (age==17) {
			newLicense = ("G2");
			System.out.println("This driver can be issued a "+newLicense);
		}
		else if (age>=18) {
			newLicense = ("G");
			System.out.println("This driver can be issued a "+newLicense);
		}
	}

}
