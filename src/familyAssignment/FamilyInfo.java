package familyAssignment;

public class FamilyInfo {
	String firstName;
	int age;
	String role;
	boolean isLearningProgramming;
	boolean isFluentInEnglish;
	String jobRole;
	
	public FamilyInfo(String name, String job, int years, String authority, boolean isLearn,boolean isFluent) {
		firstName = name;
		age=years;
		role=authority;
		isLearningProgramming=isLearn;
		isFluentInEnglish=isFluent;
		jobRole=job;
		
	}
}
