package javatests;

public class ArrayTest {

	public static void main(String[] args) {
		int studentMarks[] = {70,80,90};
		System.out.println(studentMarks[0]);
		System.out.println(studentMarks[1]);
		System.out.println(studentMarks[2]);
		System.out.println(studentMarks.length);
		for(int studentMarks1 = 0; studentMarks1<3;studentMarks1++) {
			System.out.println("studentMarks : " + studentMarks1);
		}
		String subjectNames[] = {"English", "Math","Science"};
		System.out.println(subjectNames[0]);
		System.out.println(subjectNames[1]);
		System.out.println(subjectNames[2]);
		for(int subjectNames1 = 0; subjectNames1<3;subjectNames1++) {
			System.out.println("studentMarks : " + subjectNames1);
		}
		//boolean subjectPassStatus []= {true,false};		
		
		/*for(int loopCounter = 0; loopCounter<3;loopCounter++) {
			System.out.println("counter : " + loopCounter);
			System.out.println(subjectNames[loopCounter]);
		}
		for(int loopCounter = 0; loopCounter<2;loopCounter++) {
			System.out.println("counter : " + loopCounter);
			System.out.println(subjectPassStatus[loopCounter]);
		}*/
	}

}
