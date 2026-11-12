package enumExample;

public class Seat {
	boolean isBooked;
	int price;
	SeatType type;

	public Seat(boolean isSeatBooked, int seatPrice, SeatType typeOfSeat) {
		isBooked = isSeatBooked;
		price = seatPrice;
		type = typeOfSeat;

	}

	public enum SeatType {

		ECONOMY("economy", 800), 
		BUSINESS("business", 1500), 
		FIRST_CLASS("First Class", 2500);

		String nameOfTheSeatType;
		int priceOfSeat;

		SeatType(String name, int price) {
			nameOfTheSeatType = name;
			priceOfSeat = price;

		}

		String getName() {
			return nameOfTheSeatType;
		}

		int getPrice() {
			return priceOfSeat;

		}
	}

}
