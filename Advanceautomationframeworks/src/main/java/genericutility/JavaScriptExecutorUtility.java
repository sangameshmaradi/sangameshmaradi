package genericutility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutorUtility extends BaseClass {
	public static JavascriptExecutor js = (JavascriptExecutor) driver ;
	public static void clickingOnElementUsingJavaScript(WebElement Element) {
		js.executeAsyncScript("arguments[0].click();", Element);
	}
	public static void EnteringDataToElementsUsingJavaScript(WebElement element,String data) {
		js.executeAsyncScript("arguments[0].value='"+data+"';", element);
		
		
	}
	

}
