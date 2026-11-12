package constructorExample;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		Book harryPotter = new Book("JK Rowling", "Goblet_of_Fire", false);
		Book famousFive = new Book("Andy Blyton", "On_an_Island", false);
		Book fivePoint = new Book("Chetan Bhagat", "Five_Point_Someone", false);
		Book iceAndFire = new Book("RR Martin", "Ice_and_fire", false);
		Book lordOfTheRings = new Book("JR Tolkien", "Lord_of_the_Rings", false);

		System.out.println("Enter the Name of the Book you want to be issued:");
		String bookName = sc.next();

		Book[] namesOfTheBook = { harryPotter, famousFive, fivePoint, iceAndFire, lordOfTheRings };

		for (int i = 0; i < namesOfTheBook.length; i++) {

			if (namesOfTheBook[i].bookName.equals(bookName) && namesOfTheBook[i].isBookIssued == false) {
				namesOfTheBook[i].isBookIssued = true;
				break;

			}
		}
		

	}

}
