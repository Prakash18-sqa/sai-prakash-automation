package javatests;

public class stringTest {

	public static void main(String[] args) {
		String message = "It's a great day Today";
		System.out.println(message);
		System.out.println("Length of the message : " + message.length());
		System.out.println("char at 18 position : " + message.charAt(18));
		System.out.println("substring of (0,16) : " + message.substring(0, 16));

		String weather = " cool weather";
		message = message.concat(weather);
		System.out.println(message);
		System.out.println("Position of char 'c' : " + message.indexOf('c'));

		String messageInLowerCase = message.toLowerCase();
		System.out.println("messsage In Lower Case :" + messageInLowerCase);

		String messageInUpperCase = message.toUpperCase();
		System.out.println("message In Upper Case :" + messageInUpperCase);

		boolean areMessagesEqualsInCase = messageInLowerCase.equals(messageInUpperCase);
		System.out.println("Are Messages In Case : " + areMessagesEqualsInCase);

		boolean areMessageEqualInIgnoreCase = messageInLowerCase.equalsIgnoreCase(messageInUpperCase);
		System.out.println("Are Message Equal In Ignore Case : " + areMessageEqualInIgnoreCase);

		String studentName = "SATYA";
		System.out.println("Student Name : " + studentName.toLowerCase());
		System.out.println("Student Name : " + studentName.toUpperCase());

		String S = "S";
		String atya = "atya";
		S = S.concat(atya);
		System.out.println("Student Name : " + S);

		String studentName1 = " Prakash ";
		System.out.println("'" + studentName1.trim() + "'");
		System.out.println("'" + studentName1 + "'");

		String[] messageInwords = message.split(" ");
		System.out.println(messageInwords[0]);
		System.out.println(messageInwords[1]);
		System.out.println(messageInwords[2]);

		message = message.replace("cool", "with great");
		System.out.println(message);
	}

}
