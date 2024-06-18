package javatests;

public class SwitchCaseTest {

	public static void main(String[] args) {
		int dayNumber = 8;
		String dayName;
		switch (dayNumber) {
		case 1 :
			dayName = "Sunday";
			break;
		case 2 :
			dayName = "Monday";
		break;
		case 3 :
			dayName = "TuesDay";
			break;
		case 4 :
			dayName = "WednesDay";
			break;
		case 5 :
			dayName = "ThursDay";
			break;
		case 6 :
			dayName = "Friday";
			break;
		case 7 :
			dayName = "SaturDay";
			break;
			default :
				dayName = "invalidDay";
		}
		System.out.println("DayName : " + dayName);	
	}

}
