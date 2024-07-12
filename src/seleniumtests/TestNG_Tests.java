package seleniumtests;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Tests {
	@Test
	public static void login() {
		Reporter.log("Login is Successfull", true);
	}

	@Test

	public void CreateTicket() {
		Reporter.log("Created ticked Successfully", true);

	}

}
