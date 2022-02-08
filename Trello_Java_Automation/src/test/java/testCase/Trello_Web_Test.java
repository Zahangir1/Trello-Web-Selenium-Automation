package testCase;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.DriverSetup;
import locators.Add_Card_TC004;
import locators.Create_Board_TC003;
import locators.View_Templates_TC002;
import loginPage.SignUp_TC001;

public class Trello_Web_Test extends DriverSetup {
	String baseUrl = "https://trello.com/";

	@Test
	public void signUpVerify() throws InterruptedException {
		driver.get(baseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(3000);

		SignUp_TC001 signup = new SignUp_TC001(driver);
		signup.clickOnLogin();
		Thread.sleep(2000);
		signup.enterEmail("demomail342@gmail.com");
		Thread.sleep(5000);
		signup.mail();
		Thread.sleep(2000);
		signup.enterPassword("Demo@mail123");
		Thread.sleep(2000);
		signup.clickOnLoginBtn();
		Thread.sleep(15000);
		System.out.println("Successfully Login");
	}

}
