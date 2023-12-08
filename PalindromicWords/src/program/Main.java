package program;

import java.util.Scanner;

public class Main {
	
	static boolean isPalindoromic(String input) {
		for(int i = 0, j = input.length() - 1; i < input.length(); i++, j--) {
			if(input.charAt(i) != input.charAt(j)) {
				return false;
			}			
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		if(isPalindoromic(input)) {
			System.out.println("The word is a palindromic word.");
		}else {
			System.out.println("The word is not a palindromic word.");
		}
	}
}
