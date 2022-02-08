package testCase;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.DriverSetup;

public class WafiLife extends DriverSetup {
	String baseUrl = "https://www.wafilife.com/";

	@Test
	public void dropDown() throws InterruptedException {
		driver.get(baseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
//		driver.findElement(By.xpath("https://www.wafilife.com/")).click();
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[2]/div[1]/div[1]/div[2]/ul[1]/div[1]/div[1]/div[8]/li[1]/div[1]/div[1]/a[2]/div[2]/img[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='body-wrapper']//button[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[contains(text(),'অর্ডার সম্পন্ন করুন')]")).click();
        Thread.sleep(2000);
        
		WebElement dropdown = driver.findElement(By.id("billing_state"));
		//select[@id='billing_state']
		Select sel = new Select(dropdown);
		
/*
		sel.selectByVisibleText("Dhaka");
		//sel.selectByValue("10");
		//sel.selectByIndex(13);
		WebElement firstElement = sel.getFirstSelectedOption();
		System.out.println(firstElement);
		
		List<WebElement> alldistrictOptions = sel.getOptions();
		for (WebElement webElement : alldistrictOptions) {
			System.out.println(webElement.getText());
		}
*/
		
		List<WebElement> alldistrictOptions = sel.getOptions();
		for(WebElement webElement : alldistrictOptions) {
			if(webElement.getText().equals("Chattogram")) {
				webElement.click();
				Thread.sleep(4000);
				break;
			}
		
		}

		
	}
}