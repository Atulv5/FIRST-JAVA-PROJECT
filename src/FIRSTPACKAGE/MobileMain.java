package FIRSTPACKAGE;

public class MobileMain {

	//Instantiating a class
	public static void main(String[] args) {
		MobilePhone iPhone = new MobilePhone(); 
	//Assigning values to the variable	 
		iPhone.brandName = "IPhone";
		iPhone.modelNumber = 12;
		iPhone.screenSizeInInches = 6.1;
		iPhone.isCameraPresent = true;
		//Call or method or invoking the method
		iPhone.makeCalls();
		iPhone.sendTextMessage();
		iPhone.takingPictures();
	System.out.println("*************************************");
		//Instantiating a class
		MobilePhone samsung = new MobilePhone();
		samsung.brandName = "Samsung";
		samsung.modelNumber = 22;
		samsung.screenSizeInInches = 6.2;
		samsung.isCameraPresent = true;
		samsung.makeCalls();
		samsung.sendTextMessage();
		samsung.takingPictures();
	}

}
