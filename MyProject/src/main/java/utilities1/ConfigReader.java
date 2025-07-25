package utilities1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	 static Properties prop;

	    public static String getProperty(String key) {
	        try {
	            FileInputStream fis = new FileInputStream("src/test/resources/resource1/data.properties");
	            prop = new Properties();
	            prop.load(fis);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return prop.getProperty(key);
	    }
	}

	
	

