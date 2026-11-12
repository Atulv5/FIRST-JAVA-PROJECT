package motelRoomBooking;

public class Room {
	String type;
	boolean isAvailable;
	double price;
	
	public Room(String roomType,boolean canbeBooked,double cost) {
		type=roomType;
		isAvailable=canbeBooked;
		price=cost;
	}

}
