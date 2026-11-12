package stringsExample;

public class StringArrayExample {

	public static void main(String[] args) {

		String codeSentence = "Your OTP is 3252. It is valid for 1 hour";

		var code = codeSentence.split(" ")[3].replace(".", "");

		System.out.println(code);

		// Trim
		var name = "Manvir Singh Parmar";

		var name2 = " Manvir Singh Parmar";

		var resultOfNameComparison = name.equals(name2.trim());
		System.out.println(resultOfNameComparison);

		// Index of

		var myName = "Manvir";
		var replacedName = myName.replaceAll("[a-zA-Z]", "*");

		int index = myName.indexOf("M");

		replacedName.replace("*", "M");
		
		var myCharArray=myName.toCharArray();

		// Specific Split Array replace for single value in a Array
		// var removedDot=splitArray[3].replace(".", "");
		// System.out.println(removedDot);

	}
}
