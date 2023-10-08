package program;

public class Main {

	public static void main(String[] args) {
		Teacher teacher1 = new Teacher("Hasan Hoca", "TRH", "5553455566");
		Teacher teacher2 = new Teacher("Samet Hoca", "FZK", "5433234423");
 		Course tarih = new Course("Tarih", "101", "TRH");
 		Course fizik = new Course("Fizik", "102", "FZK");
 		Teacher teacher = new Teacher("Atahan Hoca", "MAT", "54335464645");
 		Course matematik = new Course("Matematik", "193", "MAT");
		tarih.addTeacher(teacher1);
		fizik.addTeacher(teacher2);
		matematik.addTeacher(teacher);
		
		Student student1 = new Student("Hayri", "4567", "8", tarih, fizik, matematik);
		student1.addBulkExamNote(30, 30, 30);
		student1.addBulkOralExamNote(90, 90, 90);
		student1.isPass();
	}

}
