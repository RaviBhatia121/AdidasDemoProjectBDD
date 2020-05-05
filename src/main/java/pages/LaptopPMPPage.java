package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LaptopPMPPage {

	public WebDriver driver;

	By sonyLaptop=By.xpath("//a[contains(text(),'Sony vaio i5')]");
	By dellLaptop=By.xpath("//a[contains(text(),'Dell i7 8gb')]");


	public LaptopPMPPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}


	public WebElement selectSonyLaptop() {
		return driver.findElement(sonyLaptop);
	}
	
	public WebElement selectDellLaptop() {
		return driver.findElement(dellLaptop);
	}

}
