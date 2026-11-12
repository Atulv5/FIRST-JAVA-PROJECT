package methodExample;

public class MethodParameters {
	// method which accepts parameters and returns value

	int sumofTwoNumbers(int a, int b) {
		return a + b;
	}

	String getLastName(String firstName) {

		switch (firstName.toLowerCase()) {
		case "Munni":
		case "munni":
			return "Badnaam";

		case "Sheela":
		case "sheela":

			return "Jawan";

		case "Atul":
		case "atul":
			return "Verma";

		case "Manvir":
		case "manvir":

			return "Singh";
		}
		return null;
	}

	boolean isBrandAvailable(String brandName) {
		switch (brandName.toLowerCase()) {
		case "toyota":

			return true;
		case "honda":

			return true;

		case "nissan":

			return true;

		case "tesla":

			return true;

		}
		return false;

	}

}
