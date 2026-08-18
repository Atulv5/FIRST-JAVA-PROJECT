package licenseCheck;

import java.util.Scanner;

public class LicenseMainCode {

	public static void main(String[] args) {
		LicenseOperator inputAge = new LicenseOperator();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Age");
		inputAge.age = sc.nextInt();
		System.out.println("Enter your Current License");
		inputAge.currentLicense = sc.next();
		
		inputAge.checkLicense();


	}

}
