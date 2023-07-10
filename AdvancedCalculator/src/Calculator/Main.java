package Calculator;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int select;
		String menu = "1- Plus\n" 
					+ "2- Minus\n" 
					+ "3- Multiplication\n"
					+ "4- Divide\n"
					+ "5- Power\n"
					+ "6- Factorial\n"
					+ "7- Triangle area and perimeter\n"
					+ "8- Mode\n"
					+ "9- Rectangle area and perimeter\n"
					+ "0- Exit\n";
		System.out.println(menu);
		
		while(true) {
			System.out.print("Please select the action you want to do: ");
			select = scanner.nextInt();
			if(select == 0) {
				System.out.println("Goodbye!");
				break;
			}

			int a = 0;
			int b = 0;
			
			switch (select) {
			case 1:
				System.out.print("Please enter first number: ");
				a = scanner.nextInt();
				System.out.print("Please enter second number: ");
				b = scanner.nextInt();
				System.out.println("Result: " + plus(a,b));
				break;
			case 2:
				System.out.print("Please enter first number: ");
				a = scanner.nextInt();
				System.out.print("Please enter second number: ");
				b = scanner.nextInt();
				System.out.println("Result: " + minus(a,b));
				break;
			case 3:
				System.out.print("Please enter first number: ");
				a = scanner.nextInt();
				System.out.print("Please enter second number: ");
				b = scanner.nextInt();
				System.out.println("Result: " + multiplication(a,b));
				break;
			case 4:
				System.out.print("Please enter first number: ");
				a = scanner.nextInt();
				System.out.print("Please enter second number: ");
				b = scanner.nextInt();
				System.out.println("Result: " + divide(a,b));
				break;
			case 5:
				System.out.print("Please enter first number: ");
				a = scanner.nextInt();
				System.out.print("Please enter second number: ");
				b = scanner.nextInt();
				System.out.println("Result: " + power(a,b));
				break;
			case 6:
				System.out.print("Please enter first number: ");
				a = scanner.nextInt();
				System.out.println("Result: " + factorial(a));
				break;
			case 7:
				System.out.print("Please enter first side length: ");
				a = scanner.nextInt();
				System.out.print("Please enter second side length: ");
				b = scanner.nextInt();
				triangleAreaAndPerimeter(a,b);
				break;
			case 8:
				System.out.print("Please enter first number: ");
				a = scanner.nextInt();
				System.out.print("Please enter second number: ");
				b = scanner.nextInt();
				System.out.println("Result: " + mode(a,b));
				break;
			case 9:
				System.out.print("Please enter short side: ");
				a = scanner.nextInt();
				System.out.print("Please enter long side: ");
				b = scanner.nextInt();
				rectangleAreaAndPerimeter(a,b);
				break;
			default:
				System.out.println("Please try again!");
			}
		}
	}
	
	
	static double plus(double a, double b) {
		double result = a + b;
		return result;
	}
	
	static double minus(double a, double b) {
		double result = a - b;
		return result;
	}
	
	static double multiplication(double a, double b) {
		double result = a * b;
		return result;
	}
	
	static double divide(double a, double b) {
		if(a == 0 || b == 0) {
			System.out.println("the entered numbers must not be zero!");
			return 0;
		}
		double result = a / b;
		return result;

	}
	
	static double power(double a, double b) {
		double result = 1;
		for(int i = 1; i <= b; i++){
			result = result * a;
		}
		return result;
	}
	
	static double factorial(double a) {
		double result = 1;
		for(int i = 1; i <= a; i++) {
			result = result * i;
		}
		return result;
	}
	
	static void triangleAreaAndPerimeter(int a, int b) {
		double hypotenuse = Math.sqrt((a * a) + (b * b));
		int perimeter = a + b + (int)hypotenuse;
		System.out.println("Result-------");
		System.out.println("Perimeter: " + perimeter);
		System.out.println("Area: " + ((a * b) / 2));
		System.out.println("Hypotenuse: " + (int)hypotenuse);
	}
	
	static void rectangleAreaAndPerimeter(int a, int b) {
		System.out.println("Result-------");
		System.out.println("Perimeter: " + (2 * (a + b)));
		System.out.println("Area: " + (a * b));
	}
	
	static double mode(double a, double b) {
		double result = a % b;
		return result;
	}
}
