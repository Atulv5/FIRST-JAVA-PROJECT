package garageTracker;

public class GarageOperators {
    int totalFloors = 5;

    int totalSpacesPerFloor = 50;

    int occupiedSpaces;
    int availableSpaces;
    int totalOccupiedSpaces;
    int totalParkingSpaces;
    int totalAvailableSpaces;
    
    void checkGarage () {

    for (int floor = 1; floor <= totalFloors; floor++) {

        
        if (floor == 1) {
            occupiedSpaces = 32;
        } 
        else if (floor == 2) {
            occupiedSpaces = 40;
        } 
        else if (floor == 3) {
            occupiedSpaces = 35;
        } 
        else if (floor == 4) {
            occupiedSpaces = 38;
        } 
        else if (floor == 5) {
            occupiedSpaces = 35;
        }

        
        availableSpaces = totalSpacesPerFloor - occupiedSpaces;

        
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
