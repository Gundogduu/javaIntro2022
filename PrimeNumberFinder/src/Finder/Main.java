package Finder;

public class Main {
	
	public static void main(String[] args) {
		
		for(int n = 2; n<=100; n++) {
			boolean isPrime = true;
			for(int d = 2; d<n; d++) {
				if(n%d == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				System.out.print(n + " ");
			}	
		}	
	}

}
