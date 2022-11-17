package genericutility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenshotUtility extends BaseClass implements iAutoConstants{
	public static String takingScreenshot(String screenshotName) throws IOException {
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		File photo = screenshot.getScreenshotAs(OutputType.FILE);

		String ldt = LocalDateTime.now().toString().replace(':', '-');
		String destination = System.getProperty("user.dir")+ERRORSHORTS+screenshotName+" "+ldt+".png";
		File dest=new File(destination);
		FileUtils.copyFile(photo, dest);
		return destination;
	}
		
	}


