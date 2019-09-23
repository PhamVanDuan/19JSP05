package homework;

import java.util.Scanner;

import javax.swing.SizeRequirements;

public class Lab5 {
	public static void main(String[] args) {
		System.out.println("Your option: ");
		System.out.println("1. Create new employee.");
		System.out.println("2. Show the existing employee.");
		System.out.println("3. Exit");
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your choice: ");
		int number = input.nextInt();
		
		Employee[] employees = new Employee[100];
		employees[0] = new Employee(1, "duan1", 7, 1000);
		employees[1] = new Employee(2, "duan2", 8, 2000);
		employees[2] = new Employee(3, "duan3", 9, 3000);
		employees[3] = new Employee(4, "duan4", 10, 4000);
		employees[4] = new Employee(1, "duan5", 7, 1000);
		
		int i = 5;
			
		switch(number) {
		case 1:
			System.out.print("Enter id: ");
			int id = input.nextInt();
			System.out.print("Enter name: ");
			String name = input.next();
			System.out.print("Enter age: ");
			int age = input.nextInt();
			System.out.print("Enter salary: ");
			double salary = input.nextDouble();
			
			employees[i] = new Employee(id, name, age, salary);
			i++;
			break;
			
		case 2:
			for (int j = 0; j < employees.length ; j++) {
				if (employees[j] != null) {
					System.out.println("Employee " + j + ": ");
					System.out.print(employees[j].id + "\t");
					System.out.print(employees[j].name + "\t");
					System.out.print(employees[j].age + "\t2");
					System.out.print(employees[j].salary + "\n");
				}
			}
			break;
		case 3:
			break;
		default:
			break;
		}
		
	}

}
