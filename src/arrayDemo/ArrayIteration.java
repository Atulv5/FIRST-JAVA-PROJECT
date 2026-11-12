package arrayDemo;

import java.util.Scanner;

public class ArrayIteration {

	int[] numArray = { 1, 2, 3, 4, 5 };
	String[] names = new String[5];
	Scanner sc = new Scanner(System.in);

	void printNumArray() {
		for (int i = 0; i < numArray.length; i++) {
			System.out.println("Element at index " + i + " : " + numArray[i]);
		}

	}

	void populateNameArray() {

		for (int i = 0; i < names.length; i++) {
			System.out.println("Enter Name: " + (i + 1));
			names[i] = sc.next();

		}

	}

	void printNames() {
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i] + " ");
		}
	}

	// find the entered name if present in the array
	void findName() {
		String enteredName;
		System.out.println("Please enter name:");
		enteredName = sc.next();
		for (int i = 0; i < names.length; i++) {
			if (enteredName.equals(names[i])) {
				System.out.println("name is present in the array");
			}
			else {
				System.out.println("Name is not in array");
				break; 	
			}
		}
	}
}
