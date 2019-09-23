package exercise2;
import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your number: ");
		int number = input.nextInt();
		
		switch (number) {
		case 1:
			System.out.print("create emplyee");
			break;
		case 2:
			System.out.print("show the existing employee");
			break;
		case 3:
			System.out.print("exit");
			break;
		default:
			System.out.print("Other number");
			break;
		}
		input.close();	
	}

}
