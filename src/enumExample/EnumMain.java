package enumExample;

import java.util.Scanner;

import enumExample.Flight.FlightType;

public class EnumMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Flight Booking Application");
		Flight airCanadaDomestic = new Flight("Air Canada Domestic", 100, FlightType.DOMESTIC);
		Flight airCanadaInternational = new Flight("Air Canada International", 100, FlightType.INTERNATIONAL);
		Flight airFranceInternational = new Flight("Air France International", 100, FlightType.INTERNATIONAL);
		Flight airFranceDomestic = new Flight("Air France Domestic", 100, FlightType.DOMESTIC);

		Flight[] allFlights = { airCanadaDomestic, airCanadaInternational, airFranceDomestic, airFranceInternational };
		Flight[] filteredFlights = new Flight[2];

		System.out.println("Enter name of Passenger");
		String name = sc.next();

		System.out.println("Enter ID Details");
		String id = sc.next();

		Passenger manvir = new Passenger(name, id, null);

		System.out.println("Which type of flight do you want to book?");
		String typeOfFlight = sc.next();
		FlightType type = null;
		// FlightType type;
		switch (typeOfFlight) {
		case "Domestic":
			type = FlightType.DOMESTIC;
			break;
		case "International":
			type = FlightType.INTERNATIONAL;

		default:
			System.out.println("Not a valid flight");
			break;
		}
		int counter = 0;
		for (int j = 0; j < filteredFlights.length; j++) {
			if (allFlights[j].typeofFlight==type) {
				

			filteredFlights[counter] = allFlights[j];
			counter++;
			}
			if (filteredFlights.length == counter) {
				break;
			}
		}
		System.out.println("The Passenger: "+ name);
		System.out.println("with ID number " +id);
		System.out.println("The type of flight today will be  "+typeOfFlight);
		sc.close();
	}

}
