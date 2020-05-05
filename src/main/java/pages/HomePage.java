package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	public WebDriver driver;

	By laptop=By.xpath("//a[contains(text(),'Laptops')]");


	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}


	public WebElement goToLaptopPMP() {
		return driver.findElement(laptop);
	}

}
