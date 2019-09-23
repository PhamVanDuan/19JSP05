/**
 * 
 */
package exercise;
import java.util.Scanner;

public class MainEmployee {
	public static void main(String[] args) {
		
		//Job job1 = new Job(1, "HR");
		Employee employee1 = new Employee(1, "Nguyen Van A", 3000, new Job(1, "HR"));
		Employee employee2 = new Employee(2, "Nguyen Van B", 4000, new Job(2, "BA"));
		Employee employee3 = new Employee(3, "Nguyen Van C", 5000, new Job(3, "Tester"));
		Employee employee4 = new Employee(4, "Nguyen Van D", 6000, new Job(4, "Developer"));
		Employee employee5 = new Employee(5, "Nguyen Van A", 7000, new Job(5, "CEO"));
		
//		Scanner input = new Scanner(System.in); // remember: close tranh leak memory
//		System.out.print("Enter a size of array: ");
//		// nhap string co space thi dung nextLine()
//		int number = input.nextInt();
		int number = 5;			
		Employee[] employees = new Employee[number];
		
		employees[0] = employee1;
		employees[1] = employee2;
		employees[2] = employee3;
		employees[3] = employee4;
		employees[4] = employee5;
		
		System.out.println("ID    Name \t    Salary \t Job");
		for (int i = 0; i < number; i++) {
			System.out.print(employees[i].id + "\t");
			System.out.print(employees[i].name + "\t");
			System.out.print(employees[i].salary + "\t\t");
			System.out.print(employees[i].job.jobName + "\n");
		}
		
//		input.close();
	}
}
