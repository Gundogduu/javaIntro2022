package program;

import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		
		int[] list = {3,24,22,21,43,76,3,75,53};
		System.out.println(Arrays.toString(list));
		
		for(int i = 0; i < list.length; i++) {
			if(list[i] % 2 == 0) {
				System.out.print(list[i] + ", ");
			}
		}
		System.out.print(" are even numbers on the list");
	}
}
