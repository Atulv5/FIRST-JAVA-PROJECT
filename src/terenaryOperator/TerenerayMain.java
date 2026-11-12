package terenaryOperator;

public class TerenerayMain {

	public static void main(String[] args) {
		
		var num1=30;
		var num2=60;
		var result=0;
		
//		if (num1>num2) {
//			result=num1+num2;
//		}else {
//			result=num2-num1;
//		}
		
		//Ternary Operator does same as above if statement for conditions
		result=
			//first conditions
			num1>num2?num1+num2:
			//second conditions
			num1==num2?num1*num2:
				//default
				num2/num1;
		System.out.println(result);
		}
	}


