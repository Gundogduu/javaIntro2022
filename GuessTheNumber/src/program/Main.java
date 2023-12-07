package program;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int number = (int) (Math.random() * 100);
		int right = 4;
		int[] wrongAnswer = new int[5];
		int index = 0;
		boolean isWin = false;
		boolean isWrong = false;
		while(right >= 0) {
			System.out.print("Say one number: ");
			int input = scanner.nextInt();
			if(input == number) {
				System.out.println("Congrats! You won! The number was " + number);
				isWin = true;
				isWrong = false;
				break;
			}else if(input < 0 || input > 100) {
				System.out.println("Please enter a number at the range of 0 to 100");
				continue;
			}else{
				System.out.println("You entered wrong number. Your remaining right is " + (right--));
				wrongAnswer[index++] = input;
				isWrong = true;
				isWin = false;
			}
		}
		
		
		if(!isWin) {
			System.out.println("Game Over!");
			if(isWrong) {
				System.out.println("Your wrong answers: ");
				for(int value : wrongAnswer) {
					if(value > 0) {
						System.out.print(value + ", ");
					}	
				}
			}
		}
	}
}
