package program;

public class Teacher {
	
	String name;
	String branch;
	String phoneNumber;
	
	
	Teacher(String name, String branch, String phoneNumber){
		this.name = name;
		this.branch = branch;
		this.phoneNumber = phoneNumber;
	}
	
	void print() {
		System.out.println("Name: " + name);
		System.out.println("Branch: " + branch);
		System.out.println("Phone Number: " + phoneNumber);
	}
}
