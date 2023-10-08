package program;

public class Course {
	Teacher teacher;
	String name;
	String code;
	String prefix;
	double note;
	double oralExamNote;
	
	
	Course(String name, String code, String prefix){
		this.name = name;
		this.code = code;
		this.prefix = prefix;
		this.note = 0.0;
		this.oralExamNote = 0.0;
	}
	
	
	void addTeacher(Teacher teacher) {
		if(teacher.branch.equals(this.prefix)) {
			this.teacher = teacher;
			System.out.println("------------------");
			System.out.println("The teacher added.");
			printTeacher();
		}else{
			System.out.println("Öğretmen ve Ders bölümleri uyuşmuyor!");
		}
	}
	
	void printTeacher() {
		this.teacher.print();
	}
	
}
