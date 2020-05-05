package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {

	public WebDriver driver;

	By addtoCart = By.xpath("//a[@class='btn btn-success btn-lg']");
	By goToCart = By.xpath("//a[@id='cartur']");
	By removeItem = By.xpath("//tr[1]//td[4]//a[1]");
	By proceed = By.xpath("//button[@class='btn btn-success']");
	By name = By.xpath("//input[@id='name']");
	By country = By.xpath("//input[@id='country']");
	By city = By.xpath("//input[@id='city']");
	By card = By.xpath("//input[@id='card']");
	By month = By.xpath("//input[@id='month']");
	By year = By.xpath("//input[@id='year']");
	By purchase=By.xpath("//button[contains(text(),'Purchase')]");
	By completePurchase=By.xpath("//button[@class='confirm btn btn-lg btn-primary']");

	public CartPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement addtoCart() {
		return driver.findElement(addtoCart);
	}

	public void acceptTheAlert() throws InterruptedException {
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
	}

	public WebElement goToCart() {
		return driver.findElement(goToCart);
	}

	public WebElement removeItem() {
		return driver.findElement(removeItem);
	}

	public WebElement proceed() {
		return driver.findElement(proceed);
	}

	public void fillTheForm() throws InterruptedException {
		driver.findElement(name).sendKeys("Ravi Bhatia");
		driver.findElement(country).sendKeys("India");
		driver.findElement(city).sendKeys("New Delhi");
		driver.findElement(card).sendKeys("1234 4567 7890 1234");
		driver.findElement(month).sendKeys("02");
		driver.findElement(year).sendKeys("2020");
		Thread.sleep(2000);
	}
	
	public WebElement purchase() {
		return driver.findElement(purchase);
	}
	
	public WebElement completePurchase() {
		return driver.findElement(completePurchase);
	}

}
