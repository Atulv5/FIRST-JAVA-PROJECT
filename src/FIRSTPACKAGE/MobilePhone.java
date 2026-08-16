package FIRSTPACKAGE;

public class MobilePhone {

	String brandName;
	int modelNumber;
	double screenSizeInInches;
	int storageCapacity;
	String operatingSystem;
	boolean isCameraPresent;

	void makeCalls() {
		System.out.println("Making Calls from " + brandName + modelNumber);
	}

	void sendTextMessage() {
		System.out.println("Sending Text Messages from" + brandName + modelNumber);
	}

	void takingPictures() {
		System.out.println("Taking Pictures from" + brandName + modelNumber);
	}
}
