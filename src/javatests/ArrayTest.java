package javatests;

public class ArrayTest {

	public static void main(String[] args) {
		int studentMarks[] = {70,80,90,75,86,95};
		/*String subjectNames[] = {"English", "Math","Science"};
		boolean subjectPassStatus []= {true,false};
		System.out.println(studentMarks[0]);
		System.out.println(studentMarks[1]);
		System.out.println(studentMarks[2]);
		
		System.out.println(studentMarks.length);*/
		
		for(int loopCounter = 0; loopCounter<6;loopCounter++) {
		System.out.println("counter : " + loopCounter);
		System.out.println(studentMarks[loopCounter]);
	}
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
