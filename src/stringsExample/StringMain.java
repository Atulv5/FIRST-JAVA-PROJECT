package stringsExample;

public class StringMain {

	public static void main(String[] args) {
	StringEx ex =new StringEx();
	String v1=ex.first;
	String v2=ex.second;
	//comparison using equal method
	boolean isSame=	v1.equals(v2);
	System.out.println(isSame);
	
	//compare but ignore the case
	boolean isSame1=v1.equalsIgnoreCase(v2);
	System.out.println(isSame1);
	
	//Contains
	String [] nameArray=ex.names;
	int counter=0;
	for (int i = 0; i < nameArray.length; i++) {
		if(nameArray[i].contains("Kaur")) {
			counter++;
			
		}
	}
	System.out.println("Count: "+counter);
	
	//Contains & Replace
	String[] color=ex.colors;
	for (int i = 0; i < nameArray.length; i++) {
		if(nameArray[i].contains("Kaur")) {
		nameArray[i]=nameArray[i].replaceAll("Kaur", "Singh");
		}
		
		}
	String replace = ex.first.replaceAll("ABC", "abc");
	System.out.println(replace);
	
	for (int i = 0; i < nameArray.length; i++) {
		System.out.println(nameArray[i]);
	}
	
	
	//value of
	boolean val= "Manvir Singh parmar".contains("Singh");
	System.out.println(val);
	String name= String.valueOf(val);
	System.out.println(name);
	
	double num=22.5;
	String.valueOf(num);
	
	int a=5;
	int b=10;
	int c=15;
	
	String valA=String.valueOf(a);
	String valB=String.valueOf(b);
	String valC=String.valueOf(c);

	System.out.println("The variable a,b,c with values "+valA+" "+valB+" "+valC+" is "+(a+b+c) );
}
}