package Calculator_Application;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		boolean keepCalculating = true;
		
		System.out.println("Welcome to SimpleCalucator.");
		while(keepCalculating) {
			System.out.println("\nSelect an option: ");
			System.out.println("1. Addition (+)");
			System.out.println("2. Subtraction (-)");
			System.out.println("3. Multiplication (*)");
			System.out.println("4. Division (/)");
			System.out.println("5. Exit");
			
			System.out.println("Enter your choice (1-5): ");
			int choice = scanner.nextInt();
			
			if(choice == 5) {
				System.out.println("Thank you for using SimpleCalculator. Goodbye!");
				break;
			}
			
			System.out.println("Enter first number: ");
			double number1 = scanner.nextDouble();
			System.out.println("Enter second number: ");
			double number2 = scanner.nextDouble();
			
			switch(choice) {
			case 1:
				System.out.println("Result: " + number1 + " + " + number2 + " = "+ add(number1, number2));
				break;
			case 2:
				System.out.println("Result: " + number1 + " - " + number2 + " = " + subtract(number1, number2));
				break;
			case 3:
				System.out.println("Result: " + number1 + " * " + number2 + " = " + multiply(number1, number2));
			case 4:
				if (number2 != 0) {
					System.out.println("Result: " + number1 + " / " + number2 + " = " + divid(number1, number2));
				}
				else {
					System.out.println("Error: Division by zero not allowed.");
				}
				break;
			default:
				System.out.println("Invalid choice. Please choose again.");
				break;
			}
			
			System.out.println("\nDo you want to perform another calculation (yes/no): ");
			String response = scanner.next();
			keepCalculating = response.equalsIgnoreCase("yes");
		}
		
		scanner.close();
	}
	
	public static double add(double a, double b) {
		return a + b;
	}
	
	public static double subtract(double a, double b) {
		return a - b;
	}
	
	public static double multiply(double a, double b) {
		return a * b;
	}
	
	public static double divid(double a, double b) {
		return a / b;
	}

}
