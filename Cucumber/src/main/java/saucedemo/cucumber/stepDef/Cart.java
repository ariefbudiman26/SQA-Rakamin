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


public class Cart {

    WebDriver driver;
    String baseUrl = "https://www.saucedemo.com/";
    @Given("User Login to Saucedemo")
    public void userLoginToSaucedemo() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions opt = new ChromeOptions();
        driver = new ChromeDriver(opt);
        driver.manage().window().maximize();
        driver.get(baseUrl);
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }

    @When("User Click Add to cart")
    public void userClickAddToCart() {
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    }

    @Then("Cart Badge Displayed")
    public void cartBadgeDisplayed() {
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).isDisplayed();
        driver.close();
        driver.quit();
    }

    @And("User Click Add to cart an Item")
    public void userClickAddToCartAnItem() {
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    }

    @And("The Item clicked label change to Remove")
    public void theItemClickedLabelChangeToRemove() {
        driver.findElement(By.id("remove-sauce-labs-backpack"));
    }

    @When("User Click Remove at Added Item")
    public void userClickRemoveAtAddedItem() {
        driver.findElement(By.id("remove-sauce-labs-backpack")).click();
    }

    @Then("The Added Item label change to Add to Cart")
    public void theAddedItemLabelChangeToAddToCart() {
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        driver.close();
        driver.quit();
    }
}
