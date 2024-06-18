package javatests;

public class ForeachLoopTest {

	public static void main(String[] args) {
		String message = "It's a great day Today";
		String[] words = message.split(" ");

		for (String word : words) {
			System.out.println(word);

		}

		int numbers[] = { 1, 2, 3, 4, 5 };

		for (int number : numbers) {
		System.out.println(number);
	}
		}

}
