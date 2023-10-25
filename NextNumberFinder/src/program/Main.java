package program;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] list = {56, 34, 1, 8, 101, -2, -33};
		Arrays.sort(list);
		
		System.out.print("Please enter a number: ");
		int number = scanner.nextInt();
		int nextBig = 0;
		int nextSmall = 0;
		
		for(int i = 0; i < list.length; i++) {
			if(list[i] < number) {
				nextSmall = list[i];
			}
		}
		
		for(int i = 0; i < list.length; i++) {
			if(list[i] > number) {
				nextBig = list[i];
				break;
			}
		}
		
		System.out.println(nextSmall + " is next small value to " + number);
		System.out.println(nextBig + " is next big value to " + number);
	}
}
