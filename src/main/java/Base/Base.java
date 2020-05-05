package Base;

import static org.junit.Assert.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	public static Logger log = LogManager.getLogger(Base.class.getName());
	public static WebDriver driver;
	public Properties prop;
	public FileInputStream fis;
	// public filePath= "";
	By homePage = By.xpath("//a[@id='nava']");

	public WebDriver initializeDriver() throws IOException {

		prop = new Properties();
		fis = new FileInputStream("src/main/java/Resources/Default.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(prop.getProperty("url"));
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			String Title = driver.getTitle();
			// System.out.println(Title);
			log.info(Title);
			//assertEquals(Title, "STORE");
			// execute in chrome driver

		} else if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();
			// firefox code
		} else if (browserName.equals("IE")) {
//	IE code
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;

	}

	public void closeBrowser() {
		driver.quit();
		driver = null;
	}

	public WebElement goToHomePage() {
		return driver.findElement(homePage);
	}

}
