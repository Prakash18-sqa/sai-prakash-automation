package javatests;

import java.util.Scanner;

public class ForLoopTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hello there Please enter the values till that number");
		int number=scanner.nextInt();
		for (int counter = 0; counter < number; counter++) {
			System.out.println("The counter value is : " + counter);
		}
			
		}

	}


