package saucedemo.cucumber.stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Product {
    WebDriver driver;
    String baseUrl = "https://www.saucedemo.com/";
    String username = "standard_user";
    String password = "secret_sauce";
    @Given("Login to Saucedmo")
    public void loginToSaucedmo() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions opt = new ChromeOptions();
        driver = new ChromeDriver(opt);
        driver.manage().window().maximize();
        driver.get(baseUrl);
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();
    }

    @When("User Click a Product Image")
    public void userClickAProductImage() {
        driver.findElement(By.id("item_4_img_link")).click();
    }

    @Then("Product Detail page Displayed")
    public void productDetailPageDisplayed() {
        driver.findElement(By.id("back-to-products"));
        driver.close();
        driver.quit();
    }

    @When("User Click a Product Title")
    public void userClickAProductTitle() {
        driver.findElement(By.id("item_4_title_link")).click();
    }
}
