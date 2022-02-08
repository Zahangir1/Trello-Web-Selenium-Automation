package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Create_Board_TC003 {
	WebDriver driver = null;

	public Create_Board_TC003(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickOnTestCaseWriting() {
		driver.findElement(By.xpath("//span[normalize-space()='Test Case Writing']")).click();
	}

	public void clickOnCreateNewBoard() {
		driver.findElement(By.xpath("")).click();
	}
	
	public void createBoard() {
		driver.findElement(By.xpath("//button[contains(text(),'Create your first board')]")).click();
	}
	public void typeTitle(String text3) {
		driver.findElement(By.xpath("//input[@placeholder='Add board title']")).sendKeys(text3);
	}

	public void selectWorkSpace() {
		driver.findElement(By.xpath("//button[normalize-space()='Workspace visible']")).click();
	}

	public void selectPrivate() {
		driver.findElement(By.xpath("//div[normalize-space()='Private']")).click();
	}

	public void selectGreenColor() {
		driver.findElement(By.xpath("//button[@title='green']")).click();
	}

	public void createBorad() {
		driver.findElement(By.xpath("//button[normalize-space()='Create board']")).click();
	}
	
}
