package javatests;

public class student {

	private static int subjectEnglish;
	private static int subjectMaths;
	public static void main(String[] args) {

		String studentName = "satya";
		System.out.println(studentName);
		int studentRollNumber = 18;
		System.out.println(studentRollNumber);

		int English = 60;
		int Math = 75;
		int Science = 80;
		String studentPassStatus;
		studentPassStatus = getstudentPassStatus(English, Math, Science);
		System.out.println("studentPassStatus : " + studentPassStatus);
		int totalOfSubjectMarks = getTotalOfSubjectMarks(subjectEnglish, subjectMaths,Science);

		/*
		 * int total = subjectEnglish+subjectMaths+subjectScience;
		 * System.out.println(total); float avg = total/3f; System.out.println(avg);
		 */

	}

	public static String getstudentPassStatus(int english, int math, int science) {
		String studenPassStatus = (math > 35 && science > 35 && english > 35) ? "Passed" : "Failed";

		return studenPassStatus;
	}
	public static int getTotalOfSubjectMarks (int subjectEnglish, int subjectMaths, int subjectScience) {
	int totalOfSubjectMarks = subjectEnglish+subjectMaths+subjectScience;
	System.out.println(totalOfSubjectMarks);
	return totalOfSubjectMarks;
}
}
