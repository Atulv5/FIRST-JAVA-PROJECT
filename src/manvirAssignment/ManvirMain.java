package manvirAssignment;

import java.util.Scanner;

public class ManvirMain {

	public static void main(String[] args) {
ManvirOperators assignment = new ManvirOperators();
Scanner sc = new Scanner(System.in);
System.out.println("Please Enter your Grade");
assignment.scoreInput = sc.nextInt();
System.out.println("Did you Have a Sports Quota? Enter True or False: ");
assignment.sportsQuota=sc.nextBoolean();
System.out.println("What was your attendance percentage");
assignment.attendance=sc.nextInt();


assignment.scoreOutput();
	}

}
