package newProgram;

import java.util.Scanner;

public class NewOperators {
	
Scanner sc = new Scanner(System.in);

int num;

void checkNumber() {
System.out.println("Enter the number to Be Divided:");

num= sc.nextInt();
if (num % 15 == 0) {
    System.out.println("Number is divisible by 15");
}else if (num % 3 == 0) {
        System.out.println("Number is divisible by 3");
    } else if (num % 5 == 0) {
        System.out.println("Number is divisible by 5");
    } else {
        System.out.println("Number is not divisible by 3, 5, or 15");
    }

}
}

//if (divisbleNumber<=1) {
//	finalNumber=divisbleNumber/first;
//	
//}
//else if (divisbleNumber<=5) {
//	finalNumber=divisbleNumber/second;
//}
//else if(divisbleNumber<=15) {
//	finalNumber=divisbleNumber/third;
//
//}
//System.out.println("The Final Number should be:"+finalNumber);
//
//}
//
//}


//Write a program to Identify if a number is divisible by 3 or by 5 or by 15

//variables, operators, if else conditions