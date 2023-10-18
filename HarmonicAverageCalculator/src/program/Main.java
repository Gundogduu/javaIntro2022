package program;

import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		
		int[] list = {1,2,3,4,5};
		double harmonicSerie = 0.0;
		for(double i = 1; i <= list.length; i++) {
			harmonicSerie += (1 / i);
		}
		System.out.print(Arrays.toString(list) + " The harmonic average of this list is ");
		System.out.println(list.length/harmonicSerie);
	}
}
