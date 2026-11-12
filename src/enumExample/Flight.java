package enumExample;

public class Flight {

	String nameOfFlight;
	int seatsTotal;
	FlightType typeofFlight;

	public Flight(String flightName, int sTotal, FlightType type) {
		nameOfFlight = flightName;
		seatsTotal = sTotal;
		typeofFlight = type;

	}

	public enum FlightType {
		DOMESTIC("Domestic"), 
		INTERNATIONAL("International");

		String typeOfFlight;

		private FlightType(String type) {
			typeOfFlight = type;
		}

		String getTypeOfFlight() {
			return typeOfFlight;
		}

	}
}
