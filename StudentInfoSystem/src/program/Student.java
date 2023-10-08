package program;

public class Student {
	
	Course c1;
	Course c2;
	Course c3;
	String name;
	String studentNumber;
	String classes;
	double average;
	boolean isPass;
	
	Student(String name, String studentNumber, String classes, Course c1, Course c2, Course c3){
		this.name = name;
		this.studentNumber = studentNumber;
		this.classes = classes;
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
		this.average = 0.0;
		this.isPass = false;
	}

	void addBulkExamNote(int note1, int note2, int note3) {
		if(this.c1.note >= 0 && this.c1.note <= 100) {
			this.c1.note = note1;
			System.out.println(c1.name + " note added.");
		}
		if(this.c2.note >= 0 && this.c2.note <= 100) {
			this.c2.note = note2;
			System.out.println(c2.name + " note added.");
		}
		if(this.c3.note >= 0 && this.c3.note <= 100) {
			this.c3.note = note3;
			System.out.println(c3.name + " note added.");
		}
	}
	
	void addBulkOralExamNote(int note1, int note2, int note3) {
		if(this.c1.oralExamNote >= 0 && this.c1.oralExamNote <= 100) {
			this.c1.oralExamNote = note1;
			System.out.println(c1.name + " oral exam note added.");
		}
		if(this.c2.oralExamNote >= 0 && this.c2.oralExamNote <= 100) {
			this.c2.oralExamNote = note2;
			System.out.println(c2.name + " oral exam note added.");
		}
		if(this.c3.oralExamNote >= 0 && this.c3.oralExamNote <= 100) {
			this.c3.oralExamNote = note3;
			System.out.println(c3.name + " oral exam note added.");
		}
	}
	
	void isPass() {
		this.c1.note = (this.c1.note * 0.80) + (this.c1.oralExamNote * 0.20);
		this.c2.note = (this.c2.note * 0.70) + (this.c2.oralExamNote * 0.30);
		this.c3.note = (this.c3.note * 0.60) + (this.c3.oralExamNote * 0.40);
		System.out.println("------------------");
		this.average = (this.c1.note + this.c2.note + this.c3.note) / 3;
		printNote();
		if(this.average > 55) {
			this.isPass = true;
			System.out.println("You are passed the class!");
		}else {
			this.isPass = false;
			System.out.println("You are not passed the class.");
		}
		
	}
	
	void printNote() {
		System.out.println(this.c1.note);
		System.out.println(this.c2.note);
		System.out.println(this.c3.note);
		System.out.println("Your average: " + this.average);
	}
}
