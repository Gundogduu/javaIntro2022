package program;

import java.util.Arrays;

public class Main {

	static boolean isFind(int[] arr, int value) {
		for(int item : arr) {
			if(item == value) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int nonEmptyIndex = 0;
		int startIndex = 0;
		int repeat = 0;
		int[] array = {10,20,20,10,10,20,5,20};
		int[] nonRepeatNumbers = new int[array.length];
		int[] repeats = new int[array.length];
		
		System.out.print("Dizi: ");
		System.out.println(Arrays.toString(array));
		System.out.println("Tekrar Sayıları");
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				if(!isFind(nonRepeatNumbers, array[i])) {
					nonRepeatNumbers[startIndex++] = array[i];	
				}
			}
		}
		
		startIndex = 0;
		for(int k = 0; k < array.length; k++) {
			for(int l = 0; l < array.length; l++) {
				if(nonRepeatNumbers[k] == array[l]) {
					repeat++;
				}	
			}
			if(!isFind(repeats, repeat)) {
				repeats[startIndex++] = repeat;
			}
			repeat = 0;
		}
		for(int value = 0; value < nonRepeatNumbers.length; value++) {
			if(nonRepeatNumbers[value] != 0) {
				System.out.println(nonRepeatNumbers[value] + " sayisi " + repeats[value] + " kere tekrar edildi");
			}
		}
	}
}
