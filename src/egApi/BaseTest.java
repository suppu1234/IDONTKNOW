package egApi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class BaseTest {
	
	public BaseTest() throws IOException
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\Su\\workspace\\RestApi\\src\\configeration\\config.properties");
	
	Properties prop=new Properties();
	
	prop.load(fis);
	
	String url = prop.getProperty("URL");
	System.out.println(url);
	
	
	
	
	
	}

}
