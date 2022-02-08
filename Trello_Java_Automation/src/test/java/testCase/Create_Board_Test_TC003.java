package testCase;

import java.time.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.DriverSetup;
import locators.Create_Board_TC003;
import loginPage.SignUp_TC001;

public class Create_Board_Test_TC003 extends DriverSetup {
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
		Thread.sleep(10000);
		System.out.println("Successfully Login");
		
		Create_Board_TC003 board = new Create_Board_TC003(driver);
//		board.clickOnTestCaseWriting();
//		Thread.sleep(4000);
		board.clickOnCreateNewBoard();
		Thread.sleep(4000);
		board.createBoard();
		Thread.sleep(4000);
		board.typeTitle("My First Board");
		Thread.sleep(4000);
		board.selectWorkSpace();
		Thread.sleep(4000);
		board.selectPrivate();
		Thread.sleep(4000);
		board.selectGreenColor();
		Thread.sleep(4000);
		board.createBorad();
		Thread.sleep(5000);
		System.out.println("Create Board open successfully"); 
	
	}
	
//   @Test
//	public void createBoardVerify() throws InterruptedException {
//    	Create_Board_TC003 board = new Create_Board_TC003(driver);
//		board.clickOnTestCaseWriting();
//		Thread.sleep(4000);
//		board.clickOnCreateNewBoard();
//		Thread.sleep(4000);
//		board.createBoard();
//		Thread.sleep(4000);
//		board.typeTitle("My First Board");
//		Thread.sleep(4000);
//		board.selectWorkSpace();
//		Thread.sleep(4000);
//		board.selectPrivate();
//		Thread.sleep(4000);
//		board.selectGreenColor();
//		Thread.sleep(4000);
//		board.createBorad();
//		Thread.sleep(5000);
//		System.out.println("Create Board open successfully"); 
//	}

}
