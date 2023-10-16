package Program;

public class Employee {
	
	String name;
	double salary;
	double workHours;
	int hireYear;
	
	public Employee(String name, double salary, double workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	public double tax() {
		if(this.salary > 1000) {
			return (this.salary * 3) / 100;
		}else {
			return 0.0;
		}
	}
	
	public double bonus() {
		if(this.workHours > 40) {
			double extraHours = (this.workHours - 40) * 30;
			return extraHours;
		}else {
			return 0.0;
		}
	}
	
	public double raiseSalary() {
		int thisYear = 2021;
		if((thisYear - this.hireYear) < 10) {
			return ((this.salary * 5) / 100);
		}else if((thisYear - this.hireYear) > 9 && (thisYear - this.hireYear) < 20) {
			return ((this.salary * 10) / 100);
		}else if((thisYear - this.hireYear) > 19) {
			return ((this.salary * 15) / 100);
		}else {
			return 0.0;
		}
	}
	
	public void printSalary() {
		System.out.println("Name: " + this.name);
		System.out.println("Salary: " + this.salary);
		System.out.println("Work Hours: " + this.workHours);
		System.out.println("Hire Year: " + this.hireYear);
		System.out.println("Tax: " + tax());
		System.out.println("Bonus: " + bonus());
		System.out.println("Raise Salary: " + raiseSalary());
		System.out.println("The Salary with Tax and Bonus: " + (this.salary - tax() + bonus()));
		System.out.println("Total Salary: " + (this.salary - tax() + bonus() + raiseSalary()));
	}
}
