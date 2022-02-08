package loginPage;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SignUp_TC001 {
	WebDriver driver = null;

	public SignUp_TC001(WebDriver driver) {
		this.driver = driver;
	}

	/*
	 * public static By login = By.xpath("//a[contains(text(),'Log in')]"); public
	 * static By email = By.xpath("//input[@id='user']"); public static By loginBtn
	 * = By.cssSelector("loginBtn"); public static By password =
	 * By.xpath("//input[@id='password']"); public static By loginBtn1 =
	 * By.xpath("//span[contains(text(),'Log in')]");
	 */

	public void clickOnLogin() {
		// driver.findElement(signUp).sendKeys(Keys.RETURN);
		// driver.findElement(login).click();
		driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();

	}

	public void enterEmail(String text) {
		// driver.findElement(email).sendKeys(text);
		driver.findElement(By.xpath("//input[@id='user']")).sendKeys(text);
	}

	public void mail() {
		// driver.findElement(email).click();
		driver.findElement(By.xpath("//input[@id='login']")).click();

	}

	public void enterPassword(String text1) {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(text1);
	}

	public void clickOnLoginBtn() {
		driver.findElement(By.xpath("//span[contains(text(),'Log in')]")).click();
	}

}
