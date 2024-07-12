package assignments_java;

public class Student {

	public static void main(String[] args) {
		String studentName = new String("satya");
		System.out.println("Student name :" + studentName);
		int[] studentRollNumber = { 18 };
		System.out.println("student Roll number :" + studentRollNumber[0]);
		int English = 60;
		System.out.println("English = " + English);
		int Maths = 70;
		System.out.println("Maths = " + Maths);
		int Science = 80;
		System.out.println("Science = " + Science);
		int total = English + Maths + Science;
		System.out.println("Total : " + total);
		float averageOfMarks = total / 3f;
		System.out.println("Average : " + averageOfMarks);
		char gradeOfStudent;
		if (averageOfMarks >= 65) {
			gradeOfStudent = 'A';
		} else if (averageOfMarks < 65 && averageOfMarks > 60) {
			gradeOfStudent = 'B';
		} else {
			gradeOfStudent = 'C';
		}
		System.out.println("gradeOfStudent : " + gradeOfStudent);

	}
}
