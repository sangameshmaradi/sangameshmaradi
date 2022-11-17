package genericutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyMainUtility {
	public static String PropertyReader(String KeyValue) throws IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/property.fileproperty");
		Properties property=new Properties();
		property.load(fis);
		String value=property.getProperty(KeyValue);
		return KeyValue;
		
	}

}
