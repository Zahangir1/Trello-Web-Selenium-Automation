package testCase;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.DriverSetup;
import locators.Add_Card_TC004;
import loginPage.SignUp_TC001;

public class Add_Card_Test_TC004 extends DriverSetup {
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
		Thread.sleep(2000);
		signup.mail();
		Thread.sleep(2000);
		signup.enterPassword("Demo@mail123");
		Thread.sleep(2000);
		signup.clickOnLoginBtn();
		Thread.sleep(10000);
		System.out.println("Successfully Login");
		
		Add_Card_TC004 card = new Add_Card_TC004(driver);
		card.my1stBoard();
		Thread.sleep(2000);
		card.add_a_List();
		Thread.sleep(2000);
		card.enterListTitle("To Do");
	    Thread.sleep(2000);
	    card.addList();
	    Thread.sleep(2000);
	    card.cancelList();
	    Thread.sleep(2000);
	    card.add_a_Card();
	    Thread.sleep(2000);
	    card.enterTitleForCard("My First Card");
	    Thread.sleep(2000);
	    card.addCardBtn();
	    Thread.sleep(4000);
		
	}

	@Test
	public void addCardVerify() throws InterruptedException {
/*		Add_Card_TC004 card = new Add_Card_TC004(driver);
		card.my1stBoard();
		Thread.sleep(2000);
		card.add_a_List();
		Thread.sleep(2000);
		card.enterListTitle("To Do");
	    Thread.sleep(2000);
	    card.addList();
	    Thread.sleep(2000);
	    card.cancelList();
	    Thread.sleep(2000);
	    card.add_a_Card();
	    Thread.sleep(2000);
	    card.enterTitleForCard("My First Card");
	    Thread.sleep(2000);
	    card.addCardBtn();
	    Thread.sleep(4000);
*/	    
	}
	
}
