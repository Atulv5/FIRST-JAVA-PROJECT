package FIRSTPACKAGE;

public class MobilePhone {

	String brandName;
	int modelNumber;
	double screenSizeInInches;
	int storageCapacity;
	String operatingSystem;
	boolean isCameraPresent;
	String phoneType;

	void makeCalls() {
		System.out.println("Making Calls from " + brandName + " " +phoneType+modelNumber);
	}

	void sendTextMessage() {
		System.out.println("Sending Text Messages from " + brandName + " "+phoneType+modelNumber);
	}

	void takingPictures() {
		System.out.println("Taking Pictures from " + brandName + " "+phoneType+modelNumber);
	}
}
