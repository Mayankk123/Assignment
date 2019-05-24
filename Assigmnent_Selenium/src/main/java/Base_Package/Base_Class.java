package Base_Package;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base_Class 
{
	public static WebDriver driver;
	public static Properties prop;
	public static JavascriptExecutor jse;
	
	
	public Base_Class()
	{
		try {
			prop = new Properties();
			
			FileInputStream fs = new FileInputStream("C:\\Users\\Concretio\\eclipse-workspace\\Assigmnent_Selenium\\src\\main\\java\\Config_Package\\config_File.properties");
			prop.load(fs);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void init_setup()
	{
		String setbrowser = prop.getProperty("browser");
		
		if(setbrowser.contains("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Concretio\\Desktop\\Selenium Files\\chromedriver.exe");
		      driver=new ChromeDriver();
		}
		
		else if(setbrowser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Concretio\\Desktop\\eclipse\\geckodriver.exe");
            driver=new FirefoxDriver();
		}
		
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 driver.get(prop.getProperty("url"));
	}
	
	public static void scroll()
	{
		  try {
			jse=(JavascriptExecutor)driver;  
		    jse.executeScript("scroll(0,500)");
			  Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	 }

}
