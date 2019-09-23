package exercise2;

public class Lab3 {
	public static void main(String[] args) {
		long sum = 0;
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("Summary: " + sum);
	}
}
