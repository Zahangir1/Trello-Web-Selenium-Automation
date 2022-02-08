package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Add_Card_TC004 {
	WebDriver driver = null;

	public Add_Card_TC004(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickOnTestCaseWriting() {
		driver.findElement(By.xpath("//span[contains(text(),'Test Case Writing')]")).click();
	}
	
	public void clickBoard() {
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/div[2]/div[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[2]")).click();
	}
	
	public void my1stBoard() {
		driver.findElement(By.xpath("//div[contains(text(),'My First Board')]")).click();
	}
	
	public void add_a_List() {
		driver.findElement(By.xpath("//span[@class='placeholder']")).click();
	}
	
	public void enterListTitle(String text5) {
		driver.findElement(By.xpath("//input[@placeholder='Enter list title…']")).sendKeys(text5);
	}
	
//	public void enterlistTitle1() {
//		driver.findElement(By.xpath("//input[@placeholder='Enter list title…']")).sendKeys(Keys.ENTER);
//	}
	
	public void addList() {
		driver.findElement(By.xpath("//input[@value='Add list']")).click();
	}
	
	public void cancelList() {
		driver.findElement(By.xpath("//a[@aria-label='Cancel list editing']")).click();
	}
	
	public void add_a_Card() {
		driver.findElement(By.xpath("//a[@class='open-card-composer js-open-card-composer']")).click();
	} 
	
	public void enterTitleForCard(String text6) {
		driver.findElement(By.xpath("//textarea[@placeholder='Enter a title for this card…']")).sendKeys(text6);
	}
	
//	public void enterTitleText(String text7) {
//		driver.findElement(By.xpath("//textarea[@placeholder='Enter a title for this card…']")).sendKeys(text7);
//	}
//	
	public void addCardBtn() {
		driver.findElement(By.xpath("//input[@value='Add card']")).click();
	}
}
