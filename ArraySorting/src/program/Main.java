package program;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Size of Array n: ");
		int size = scanner.nextInt();
		
		int[] list = new int[size];
		System.out.println("Please enter the elements of the list: ");
		for(int i = 0; i < list.length; i++) {
			System.out.print("Element " + (i+1) + ": ");
			list[i] = scanner.nextInt();
		}
		
		Arrays.sort(list);
		System.out.println("The Sorting: " + Arrays.toString(list));
		
	}

}
