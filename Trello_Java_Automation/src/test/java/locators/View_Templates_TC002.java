package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class View_Templates_TC002 {
	WebDriver driver = null;

	public View_Templates_TC002(WebDriver driver) {
		this.driver = driver;
	}
	public void clickOnTemplates() {
		driver.findElement(By.xpath("//body/div[@id='trello-root']/div[@id='chrome-container']/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/div[1]/ul[1]/div[1]/li[1]/a[1]/span[2]")).click();
	}
	public void clickOnEducation() {
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/div[1]/ul[1]/div[1]/li[1]/ul[1]/li[3]/a[1]/span[1]")).click();
	}
	public void clickOn1stTemplates() {
		driver.findElement(By.xpath("//div[contains(text(),'Remote Class Template')]")).click();
	}
	
	
//	public void selectOnDistrict() {
//		driver.findElement(By.xpath("//span[@id='select2-billing_state-container']")).click();
//	}
}
