package HomeModule;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericutility.BaseClass;
import genericutility.PropertyMainUtility;

public class TC_ID extends BaseClass {
	@Test 
	public void TestCaseDiscription() throws IOException {
		WebElement email=driver.findElement(By.id("Email"));
		WebElement password=driver.findElement(By.id("Password"));
		WebElement login=driver.findElement(By.xpath("//input[@value='Log in']"));
		String username=PropertyMainUtility.PropertyReader("username");
		email.sendKeys(username);
		password.sendKeys(PropertyMainUtility.PropertyReader("password"));
		/*JavaScriptExcecutorUtility.EnteringDataToELementsUsingJavaScript(email, "hcsm166");
				 JavaScriptExcecutorUtility.EnteringDataToELementsUsingJavaScript(password, "demo1223234");
				  JavaScriptExcecutorUtility.clickingOnELementUsingJavaScript(login);*/
		login.click();
		//assert.equals(arg0)
		
		
		
	}

}
