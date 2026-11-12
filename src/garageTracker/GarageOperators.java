package garageTracker;

public class GarageOperators {

	int totalFloors = 5;

	int totalSpacesPerFloor = 60;
	int occupiedSpaces;
	int availableSpaces;
	int totalOccupiedSpaces;
	int totalParkingSpaces;
	int totalAvailableSpaces;
	int carsToRemove;
	{

	}

	void checkGarage() {

		for (int floor = 1; floor <= totalFloors; floor++) {

			if (floor == 1) {
				occupiedSpaces = 42;

			} else if (floor == 2) {
				occupiedSpaces = 50;
			} else if (floor == 3) {
				occupiedSpaces = 45;
			} else if (floor == 4) {
				occupiedSpaces = 38;
			} else if (floor == 5) {
				occupiedSpaces = 45;
			}
			// Remove 5 cars from each floor
//            occupiedSpaces = occupiedSpaces - 5;

			// Remove cars in multiples of 3 based on floor number
			// Floor 1 = 3, Floor 2 = 6, Floor 3 = 9, etc.
			int carsToRemove = floor * 3;

			occupiedSpaces = occupiedSpaces - carsToRemove;
//			availableSpaces = totalSpacesPerFloor - occupiedSpaces + 5;

			totalOccupiedSpaces = totalOccupiedSpaces + occupiedSpaces;
			totalParkingSpaces = totalParkingSpaces + totalSpacesPerFloor;
			totalAvailableSpaces = totalAvailableSpaces + availableSpaces;

			System.out.println("Floor " + floor);
			System.out.println("Total Spaces: " + totalSpacesPerFloor);
			System.out.println("Occupied: " + occupiedSpaces);
			System.out.println("Available: " + availableSpaces);
			System.out.println("-------------------");
		}
		System.out.println("Garage Summary");
		System.out.println();
		System.out.println("Total Parking Spaces: " + totalParkingSpaces);
		System.out.println("Total Occupied Spaces: " + totalOccupiedSpaces);
		System.out.println("Total Available Spaces: " + totalAvailableSpaces);
	}

}

//Remove 5 cars from each floor
//Remove Cars Multiple of 3 from each floor i.e. floor1=3,floor2=6