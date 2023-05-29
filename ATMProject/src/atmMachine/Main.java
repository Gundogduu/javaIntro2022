package atmMachine;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String userName, password;
		Scanner scanner = new Scanner(System.in);
		int right = 3;
		int balance = 0;
		int select;
		
		
		while(right > 0) {
			System.out.println("Welcome to Patika Bank!");
			System.out.print("Please enter your username: ");
			userName = scanner.nextLine();
			System.out.print("Please enter your password: ");
			password = scanner.nextLine();
			
			if(userName.equals("hayri123") && password.equals("abc321")) {
				System.out.println("You have successfully logged in!");
				do {
					System.out.println("1-Withdraw money\n"
							+ "2-Deposit\n"
							+ "3-Balance Inquiry\n"
							+ "4-Exit");
					System.out.print("Please choose the action you want to do: ");
					select = scanner.nextInt();
					switch (select) {
					case 1:
						System.out.print("Amount of money: ");
						int price = scanner.nextInt();
						if(price>balance) {
							System.out.println("Insufficient balance.");
						}else {
							balance -= price;
							System.out.println("The action is successfull. Your current balance is: " + balance);
						}
						break;
					case 2:
						System.out.print("Amount of money: ");
						int amount = scanner.nextInt();
						balance += amount;
						System.out.println("The action is successfull. Your current balance is: " + balance);
						
						break;
					case 3:
						System.out.println("Your total balance: " + balance);
						break;
					}
				}while(select != 4);
				System.out.println("See you again.");
				break;
			}else{
				right--;
				if(right == 0) {
					System.out.println("Your account has been blocked, please contact your bank.");
				}else {
					System.out.println("Wrong username or password. Please try again!");
					System.out.println("Your remaining right: " +right);
				}
			}
		}	
	}
}
