package TestDemo;

public class LoopExample {
	

	void countUp() {
		for (int i = 2; i <= 100; i += 2) {
			System.out.println(i + " ");
		}
		System.out.println(" ");
	}
	
	void newCount() {
		int j=1;
		while (j<=100) {
		if (j % 2 == 0)
			;
		System.out.println(j + " ");
		j+=2;
		}
	}
}
