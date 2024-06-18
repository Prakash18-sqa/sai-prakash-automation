package javatests;

import java.util.Scanner;

public class LoopTest {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
		System.out.println("Hello there, do you to contionue...? true/false");
		boolean continueLoop = scanner.nextBoolean();
		int printNumber = 0;
		while (continueLoop) {
			System.out.println("the counter value is : " + printNumber);
			continueLoop = scanner.nextBoolean();
			printNumber++;
		}
	}

}
