package testCase;

import java.time.Duration;

//import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.DriverSetup;
import locators.WorkSpace_TC001;
import loginPage.SignUp_TC001;

public class WorkSpaceTest_TC001 extends DriverSetup {
	String baseUrl = "https://trello.com/";

	@Test
	public void signUpVerify() throws InterruptedException {
		driver.get(baseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(3000);

		SignUp_TC001 signup = new SignUp_TC001(driver);
		signup.clickOnLogin();
		Thread.sleep(1000);
		signup.enterEmail("demomail342@gmail.com");
		Thread.sleep(2000);
		signup.mail();
		Thread.sleep(1000);
		signup.enterPassword("Demo@mail123");
		Thread.sleep(1000);
		signup.clickOnLoginBtn();
		Thread.sleep(5000);
		System.out.println("Successfully Login");
		

		/*
		 * driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
		 * Thread.sleep(2000);
		 * driver.findElement(By.xpath("//input[@id='user']")).sendKeys("demomail342@gmail.com"); Thread.sleep(2000);
		 * driver.findElement(By.xpath("//input[@id='login']")).click();
		 * Thread.sleep(2000);
		 * driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Demo@mail123"); Thread.sleep(2000);
		 * driver.findElement(By.xpath("//span[contains(text(),'Log in')]")).click();
		 * Thread.sleep(5000); System.out.println("Successfully Login");
		 * 
		 */
	}

	@Test
	public void workSpacesVerify() throws InterruptedException {

		WorkSpace_TC001 workspace = new WorkSpace_TC001(driver);
		workspace.clickOnWorkspace();
		Thread.sleep(2000);
		workspace.enterWorkspaceName("Test Case Writing");
		Thread.sleep(2000);
		workspace.enterWorkspaceName1();
		Thread.sleep(2000);
		workspace.selectOnType();
		Thread.sleep(2000);
		workspace.selectOnType1();
		Thread.sleep(2000);
		workspace.enterWorkSpaceDescription("Effective communication is the most important part of teamwork and involves consistently updating each person and never assuming that everyone has the same information");
		Thread.sleep(2000);
		workspace.submitBtn();
		Thread.sleep(2000);
		System.out.println("WorkSpace Dashboard open successfully");
	}

}
