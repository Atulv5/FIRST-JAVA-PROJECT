package TestDemo;

import java.util.Scanner;

public class StringMain {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String named;
////		System.out.println("Please Print Students Name");
//		
//		StringDemo atul = new StringDemo();
//		atul.name="Atul";
//		atul.Grade="Grade 12";
//		atul.studentNumber=sc.nextInt();
////		atul.displaystudent();
//		
//		StringDemo manvir = new StringDemo();
//		manvir.name="Manvir";
//		manvir.Grade="Grade 11";
//		manvir.studentNumber=sc.nextInt();
//		
////		manvir.displaystudent();
		
		
//		StringDemo students = new StringDemo();
//		System.out.println("Please Print Students Name");
//		students.enteredName=sc.next();
//		System.out.println("Please Print Students Number");
//		students.enteredNumber=sc.nextInt();
//		System.out.println("Please Print Students Grade");
//		students.enteredGrade=sc.next();
//		students.enterInfo();
		
		System.out.println("Please enter a Name: ");
		named = sc.next();
		
		switch (named) {
		case "Atul":
		case "atul":
			System.out.println("The Name is Atul");
			break;
		case "Manvir":
		case "manvir":
		System.out.println("The Name is Manvir");
		break;
		case "Rebecca":
		case "rebecca":
			System.out.println("The Name is Rebecca");
			break;
		case "Jemma":
		case "jemma":
			System.out.println("The Name is Jemma");
			break;
			
		default:
			System.out.println("The Name is Invalid");
		}
		
	}

}
