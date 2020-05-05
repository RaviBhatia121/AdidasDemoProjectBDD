package UIAutomation;

import java.io.IOException;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import Base.Base;
import pages.HomePage;
import pages.LaptopPMPPage;

public class Test extends Base {

	public void driverTest() throws IOException {
		driver = initializeDriver();
		driver.get("https://demoblaze.com/index.html");

	}

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		// HomePage h = new HomePage(driver);
		LaptopPMPPage l = new LaptopPMPPage(driver);
		Test d = new Test();
		d.driverTest();
		String Title = driver.getTitle();
		// System.out.println(Title);
		assertEquals(Title, "STORE");
		// Click on Laptop
		driver.findElement(By.xpath("//a[contains(text(),'Laptops')]")).click();
		// Add sony laptop
		driver.findElement(By.xpath("//a[contains(text(),'Sony vaio i5')]")).click();
		// Add to cart
		driver.findElement(By.xpath("//a[@class='btn btn-success btn-lg']")).click();
		// Click OK on alert
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		// Go back to homapage
		driver.findElement(By.xpath("//a[@id='nava']")).click();
		// Select laptop category
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Laptops')]")).click();
		// Select Dell Laptop
		driver.findElement(By.xpath("//a[contains(text(),'Dell i7 8gb')]")).click();
		// Add to cart
		driver.findElement(By.xpath("//a[@class='btn btn-success btn-lg']")).click();
		// Click OK on alert
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		// Go to Cart
		driver.findElement(By.xpath("//a[@id='cartur']")).click();
		Thread.sleep(2000);
		// Remove or delete dell laptop - optimiaze this
		driver.findElement(By.xpath("//tr[1]//td[4]//a[1]")).click();
		Thread.sleep(3000);
		// Place order
		driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
		// Fill the pop up form
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Ravi Bhatia");
		driver.findElement(By.xpath("//input[@id='country']")).sendKeys("India");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Delhi");
		driver.findElement(By.xpath("//input[@id='card']")).sendKeys("1234 4567 7890 1234");
		driver.findElement(By.xpath("//input[@id='month']")).sendKeys("02");
		driver.findElement(By.xpath("//input[@id='year']")).sendKeys("2020");
		Thread.sleep(2000);
		//driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[contains(text(),'Purchase')]")).click();
		Thread.sleep(2000);
		// Capture Id and paid money
		// Click OK
		driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-primary']")).click();
		Thread.sleep(2000);
		driver.quit();
		System.out.println("Test case is passed, congrats");

	}

}
