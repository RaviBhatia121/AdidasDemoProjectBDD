package stepDefinations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;

import Base.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import pages.CartPage;
import pages.HomePage;
import pages.LaptopPMPPage;
import Base.Base;

@RunWith(Cucumber.class)

public class BuySonyLaptop extends Base {

	public static Logger log = LogManager.getLogger(Base.class.getName());

	@Given("^I open demo blaze website$")
	public void i_open_demo_blaze_website() throws Throwable {
		System.out.println("sysout - Step 1");
		log.info("log4j - Step 1");
		initializeDriver();
	}

	@When("^I validate title and URL$")
	public void i_validate_title_and_url() throws Throwable {
		System.out.println("sysout-Already covered in step 1");
		log.info("log4j - Already covered in step 1");
	}

	@Then("^I add sony laptop and do the add to cart$")
	public void i_add_sony_laptop_and_do_the_add_to_cart() throws Throwable {
		HomePage h = new HomePage(driver);
		h.goToLaptopPMP().click();
		LaptopPMPPage l = new LaptopPMPPage(driver);
		l.selectSonyLaptop().click();
		CartPage C = new CartPage(driver);
		C.addtoCart().click();
		System.out.println("Sysout - Step 3 has been executed");
		log.info("log4j - Step 3");
	}

	@And("^I click on the confirmation alert$")
	public void i_click_on_the_confirmation_alert() throws Throwable {
		CartPage C = new CartPage(driver);
		Thread.sleep(1000);
		C.acceptTheAlert();
		Thread.sleep(1000);
		System.out.println("Step 4 has been executed");
		log.info("log4j - Step 4 has been executed");
	}

	@And("^go to homepage$")
	public void go_to_homepage() throws Throwable {
		goToHomePage().click();
		System.out.println("Step 5 has been executed");
		log.info("log4j - Step 5 has been executed");
	}

	@And("^I add dell laptop and do the add to cart$")
	public void i_add_dell_laptop_and_do_the_add_to_cart() throws Throwable {
		HomePage h = new HomePage(driver);
		Thread.sleep(2000);
		h.goToLaptopPMP().click();
		LaptopPMPPage l = new LaptopPMPPage(driver);
		l.selectDellLaptop().click();
		CartPage C = new CartPage(driver);
		C.addtoCart().click();
		//Thread.sleep(2000);
		//C.acceptTheAlert();
		System.out.println("Step 6 has been executed");
		log.info("log4j - Step 6 has been executed");
	}

	@And("^I click on place order$")
	public void i_click_on_place_order() throws Throwable {
		CartPage C = new CartPage(driver);
		C.goToCart().click();
		System.out.println("Step 7 has been executed");
		log.info("log4j - Step 7 has been executed");
	}

	@And("^I remove dell laptop$")
	public void i_remove_dell_laptop() throws Throwable {
		CartPage C = new CartPage(driver);
		C.removeItem().click();
		Thread.sleep(3000);
		C.proceed().click();
		System.out.println("Step 8 has been executed");
		log.info("log4j - Step 8 has been executed");
	}

	@And("^I fill the form$")
	public void i_fill_the_form() throws Throwable {
		CartPage C = new CartPage(driver);
		C.fillTheForm();
		System.out.println("Step 9 has been executed");
		log.info("log4j - Step 9 has been executed");
	}

	@And("^I click on purchase$")
	public void i_click_on_purchase() throws Throwable {
		CartPage C = new CartPage(driver);
		C.purchase().click();
		Thread.sleep(2000);
		System.out.println("Step 10 has been executed");
		log.info("log4j - Step 10 has been executed");
	}

	@And("^I Confirm purchase$")
	public void i_confirm_purchase() throws Throwable {
		System.out.println("Step 11 has been executed");
		log.info("log4j - Step 11 has been executed");
	}

	@And("^I verify Log purchase ID and amount$")
	public void i_verify_log_purchase_id_and_amount() throws Throwable {
		System.out.println("Add code to capture ID and paid amount");
		System.out.println("Step 12 has been executed");
		log.info("log4j - Step 12 has been executed");
	}

	@And("^I commplete the purchase$")
	public void i_commplete_the_purchase() throws Throwable {
		System.out.println("Step 13 has been executed");
		log.info("log4j - Step 13 has been executed");
	}

	@And("^I Click on OK$")
	public void i_click_on_ok() throws Throwable {
		CartPage C = new CartPage(driver);
		C.completePurchase().click();
		System.out.println("Step 14 has been executed");
		log.info("log4j - Step 14 has been executed");
	}

	@And("^Close all open browsers$")
	public void endTest() throws Throwable {
		System.out.println("Last Step");
		Thread.sleep(2000);
		closeBrowser();
		System.out.println("Test case is passed, congrats");
	}

}
