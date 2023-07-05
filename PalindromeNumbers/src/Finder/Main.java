package Finder;

public class Main {
	
	public static void main(String[] args) {
		isPalindrome(1234321);
		
	}
	
	
	static boolean isPalindrome(int number) {
		int temp = number;
		int reverseNumber = 0;
		int lastNumber;
		
		while(temp != 0) {
			lastNumber = temp % 10;
			reverseNumber = (reverseNumber * 10) + lastNumber;
			temp /= 10;
		}
		 if(number == reverseNumber) {
			 System.out.println(number + " is a Palindrome Number");
			 return true;
		 }else {
			 System.out.println(number + " is not a Palindrome Number");
			 return false;
			 
		 }
	}
}
