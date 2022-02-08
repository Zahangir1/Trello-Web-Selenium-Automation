package testCase;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.DriverSetup;
import locators.View_Templates_TC002;
import loginPage.SignUp_TC001;

public class View_Templates_Test_TC002 extends DriverSetup {
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

	@Test
	public void view_Templates_Verify() throws InterruptedException {
		View_Templates_TC002 templates = new View_Templates_TC002(driver);
		templates.clickOnTemplates();
		Thread.sleep(4000);
		templates.clickOnEducation();
		Thread.sleep(4000);
		templates.clickOn1stTemplates();
		Thread.sleep(5000);
		System.out.println("Successfully open templates");
	}

}
