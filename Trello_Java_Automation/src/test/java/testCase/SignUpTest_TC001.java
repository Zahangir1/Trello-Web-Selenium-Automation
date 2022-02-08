package testCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.DriverSetup;
import loginPage.SignUp_TC001;

public class SignUpTest_TC001 extends DriverSetup {
	String baseUrl = "https://trello.com/";

	@Test
	public void signUpVerify() throws InterruptedException {

		driver.get(baseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(5000);

		/*
		 * driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
		 * Thread.sleep(2000);
		 * driver.findElement(By.xpath("//input[@id='user']")).sendKeys(
		 * "demomail342@gmail.com"); Thread.sleep(2000);
		 * driver.findElement(By.xpath("//input[@id='login']")).click();
		 * Thread.sleep(2000);
		 * driver.findElement(By.xpath("//input[@id='password']")).sendKeys(
		 * "Demo@mail123"); Thread.sleep(2000);
		 * driver.findElement(By.xpath("//span[contains(text(),'Log in')]")).click();
		 * Thread.sleep(10000);/ System.out.println("Successfully Login");
		 */

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
		Thread.sleep(20000);
		System.out.println("Successfully Login");

	}

}
