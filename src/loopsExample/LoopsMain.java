package loopsExample;

public class LoopsMain {

	public static void main(String[] args) {
//		WhileLoopDemo loop = new WhileLoopDemo();
////		loop.number = 1;
////		loop.finalNumber = 5;
//		loop.printSuccessiveNumbers();

		PrintSuccessiveNumbers printNumber = new PrintSuccessiveNumbers();
		printNumber.number = 0;
		printNumber.finalNumber = 15;
		printNumber.printSuccNumbers();
		printNumber.printNumbersInReverse();
		printNumber.printNumbersStopAt13();

	}

}
