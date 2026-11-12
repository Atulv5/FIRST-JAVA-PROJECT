package motelRoomBooking;

import java.util.Scanner;

public class MotelMain {

	public static void main(String[] args) {
		Room roomBasic = new Room("Basic", true, 100);
		Room roomDelxue = new Room("Deluxe", true, 200);
		Room roomLuxury = new Room("Luxury", true, 300);

		Room[] allRoomsOfBlossom = { roomBasic, roomDelxue, roomLuxury };

		Motel blossom = new Motel("Blossom", 5, allRoomsOfBlossom);
		
		Room roomCBasic = new Room("Basic", true, 100);
		Room roomCDelxue = new Room("Deluxe", true, 200);
		Room roomCLuxury = new Room("Luxury", true, 300);

		Room[] allRoomsOfCherry = { roomCBasic, roomCDelxue, roomCLuxury };
		Motel cherry = new Motel("Cherry", 5, allRoomsOfCherry);
		
		Motel[] allMotels= {blossom,cherry};
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Which Motel would you like to book?");
		String motelBook=sc.next();
		for (int i = 0; i < allMotels.length; i++) {
			if (motelBook.equals(allMotels[i].nameOfMotel)) {
				System.out.println("Motel is available, please tell us which room you'd want to book");
				String roomType=sc.next();
				if (allMotels[i].room[i].type.equals(roomType)) {
					System.out.println("Rooms can be booked, can we have your name?");
					String nameofCustomer=sc.next();
					String id=sc.next();
					GuestDetails details= new GuestDetails(nameofCustomer, id,allMotels[i].room[i]);
					System.out.println("The room "+ allMotels[i]+" Has been assigned to"+details.nameOfGuest);
					
				}
				
			}
			
		}
		sc.close();
	}

}
