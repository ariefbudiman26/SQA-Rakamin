package saucedemo.cucumber.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Checkout {
    WebDriver driver;
    String baseUrl = "https://www.saucedemo.com/";

    String firstName = "Ariep";
    String lastName = "Budiman";
    String postalCode = "28281";

    @Given("User Login to website Saucedemo")
    public void userLoginToWebsiteSaucedemo() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions opt = new ChromeOptions();
        driver = new ChromeDriver(opt);
        driver.manage().window().maximize();
        driver.get(baseUrl);
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }

    @And("User Click Add to cart an Item to Checkout")
    public void userClickAddToCartAnItemToCheckout() {
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    }
    @And("User Click Cart Button")
    public void userClickCartButton() {
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
    }

    @Then("Checkout page Displayed")
    public void checkoutPageDisplayed() {
        driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]")).isDisplayed();
    }

    @And("User Click Checkout Button")
    public void userClickCheckoutButton() {
        driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
    }

    @Then("Checkout Confirmation page Displayed")
    public void checkoutConfirmationPageDisplayed() {
        driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).isDisplayed();
    }

    @And("User Enter First Name")
    public void userEnterFirstName() {
        driver.findElement(By.id("first-name")).sendKeys(firstName);
    }

    @And("User Enter Last Name")
    public void userEnterLastName() {
        driver.findElement(By.id("last-name")).sendKeys(lastName);
    }

    @And("User Enter Postal Code")
    public void userEnterPostalCode() {
        driver.findElement(By.id("postal-code")).sendKeys(postalCode);
    }

    @And("User Click Continue Button")
    public void userClickContinueButton() {
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
    }

    @Then("Checkout Overview page Displayed")
    public void checkoutOverviewPageDisplayed() {
        driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).isDisplayed();
    }

    @When("User Click Finish Button")
    public void userClickFinishButton() {
        driver.findElement(By.xpath("//*[@id=\"finish\"]")).click();
    }

    @Then("Checkout Complete page Displayed")
    public void checkoutCompletePageDisplayed() {
        driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).isDisplayed();
        driver.close();
        driver.quit();
    }

    @And("User Enter Empty First Name")
    public void userEnterEmptyFirstName() {
        driver.findElement(By.id("first-name")).sendKeys(firstName);
    }

    @And("User Enter Empty Last Name")
    public void userEnterEmptyLastName() {
        driver.findElement(By.id("last-name")).sendKeys(lastName);
    }

    @And("User Enter Empty Postal Code")
    public void userEnterEmptyPostalCode() {
        driver.findElement(By.id("last-name")).sendKeys(postalCode);
    }

    @When("Click Continue Button")
    public void clickContinueButton() {
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
    }

    @Then("Message Error Displayed")
    public void messageErrorDisplayed() {
        driver.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[1]/div[4]/h3/button"));
        driver.close();
        driver.quit();
    }
}
