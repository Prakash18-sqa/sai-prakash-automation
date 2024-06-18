package javatests;

public class ConditionalStatementTest {

	public static void main(String[] args) {
		String myName = "Satya";
		System.out.println("Student Name : " + myName);
		int myRollNumber = 18;
		System.out.println("Roll No : " +  myRollNumber);
		int subjectEnglish = 70;
		int subjectMaths = 65;
		int subjectScience = 80;
		String studentPassStatus;
		studentPassStatus = (subjectMaths>35 && subjectScience>35 && subjectEnglish>35) ? "Passed": "Failed";//ternary operator
		System.out.println("studentPassStatus : " + studentPassStatus);
		
		/*
		int total = subjectEnglish+subjectMaths+subjectScience;
		System.out.println("Total Subject Marks : " + total);
		float averageOfMarks = total/3f;
		System.out.println( "Average Of Marks : " + averageOfMarks);
		
		boolean isStudentGradeA = averageOfMarks > 70;
		System.out.println("IsStudentGrade 'A' : " + isStudentGradeA);
		
		
		char gradeOfStudent;
		if(averageOfMarks>=65) {
			gradeOfStudent='A';
		}else if (averageOfMarks < 65 && averageOfMarks>60) {
			gradeOfStudent = 'B';
		}else {
			gradeOfStudent = 'C';
			
			System.out.println("gradeOfStudent : " + gradeOfStudent);
			
		}
		*/
		 

	}

}
