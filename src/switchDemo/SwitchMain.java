package switchDemo;

public class SwitchMain {

	public static void main(String[] args) {
		SwitchExample calculator = new SwitchExample();

		
		
		calculator.num1=10;
		calculator.num2=0;
		calculator.operationRequested = "divide";
		calculator.performOperation();

//		switch (operationRequested) {
//
//		case "add": // if operationRequested=="add"
//			calculator.addTwoNumbers();
//			break;
//		case "subtract": //if operationRequested=="subtract"
//			calculator.subtractTwoNumbers();
//			break;
//		case "multiply":
//			calculator.multiplyTwonumbers();
//			break;
//		case "divide":
//			calculator.divideTwoNumbers();
//			break;
//			
//			default:
//			System.out.println("Invalid Operation");
//		}
	}

}
