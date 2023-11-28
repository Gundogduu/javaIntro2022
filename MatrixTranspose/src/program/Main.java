package program;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] array = new int[2][3];
		System.out.println("Matrix: ");
		String[] inputs = {};
		for(int i = 0; i < 2; i++) {
			inputs = scanner.nextLine().split(" ");
			for(int j = 0; j < 3; j++) {
				array[i][j] = Integer.valueOf(inputs[j]);	
			}
		}
		
		System.out.println("Transpose: ");
		for(int l = 0; l < 3; l++) {
			for(int p = 0; p < 2; p++) {
				System.out.print(array[p][l] + " ");
			}
			System.out.println();
			
		}
	}

}
