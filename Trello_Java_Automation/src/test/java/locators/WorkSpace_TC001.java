package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.input.Input;
import org.openqa.selenium.support.ui.Select;

public class WorkSpace_TC001 {
	WebDriver driver = null;

	public WorkSpace_TC001(WebDriver driver) {
		this.driver = driver;
	}

	//Xpath declare
	// By type = By.xpath("//div[contains(text(),'Choose…')]");

	public void clickOnWorkspace() {
		// driver.findElement(wspace).click();
		driver.findElement(By.xpath("//span[contains(text(),'Create a Workspace')]")).click();
	}

	public void enterWorkspaceName(String text) {
		// driver.findElement(spaceName).sendKeys(text2);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/input[1]")).sendKeys(text);
	}

	public void enterWorkspaceName1() {
		// driver.findElement(spaceName).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/input[1]")).sendKeys(Keys.TAB);

	}

	public void selectOnType() throws InterruptedException {
		// driver.findElement(type).click();
		////div[@data-test-id='header-create-team-type-input']
		//driver.findElement(By.xpath("//div[@class='nch-select _2RUB_6xy0LOMWG css-2b097c-container']")).click();
		
		WebElement dropdown = driver.findElement(By.id("header-create-team-type-input"));
		Select sel = new Select(dropdown);
		
		List<WebElement> options = sel.getOptions();
		for(WebElement webElement : options) {
			if(webElement.getText().equals("Marketing")) {
				webElement.click();
				Thread.sleep(4000);
				break;
			}
		
		}
		
		
	}

	public void selectOnType1() {
		// driver.findElement(typeSelect).click();
		driver.findElement(By.xpath("//div[@class='nch-select _2RUB_6xy0LOMWG css-2b097c-container']")).sendKeys(Keys.TAB);
		
	}

	public void enterWorkSpaceDescription(String text3) {
		// driver.findElement(description).sendKeys(text3);
		driver.findElement(By.xpath("//textarea[@id='1638125769410-create-team-org-description']")).sendKeys(text3);

	}
	
	public void submitBtn() {
		driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
	}
	

}
