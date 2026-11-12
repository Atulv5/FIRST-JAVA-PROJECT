package TestDemo;

public class StringDemo {
	String name;
	int studentNumber;
	String Grade;
	String enteredName;
	int enteredNumber;
	String enteredGrade;
	

	
	
	void displaystudent() {
		if (studentNumber==111666)
		System.out.println("The information about this student is" +name+" and student number is "+studentNumber+" and the grade is "+Grade);
	
	else if (studentNumber==123456)
		System.out.println("The information about this student is "+name+" and student number is "+studentNumber+" and the grade is "+Grade);
	else {
		System.out.println("Student is not in the system");
	}
	
	

}
	void enterInfo() {
		System.out.println("The Students info that was entered is " +enteredName+" "+enteredNumber+" "+enteredGrade);
	}
}
