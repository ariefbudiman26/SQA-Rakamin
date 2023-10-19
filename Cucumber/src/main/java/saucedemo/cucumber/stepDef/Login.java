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

public class Login {
    WebDriver driver;
    String baseUrl = "https://www.saucedemo.com/";

    @Given("Login page saucedemo")
    public void loginPageSaucedemo() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions opt = new ChromeOptions();
        driver = new ChromeDriver(opt);
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @When("User enter valid Username")
    public void userEnterValidUsername() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
    }

    @And("User enter valid Password")
    public void userEnterValidPassword() {
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }

    @And("Click Login Button")
    public void clickLoginButton() {
        driver.findElement(By.id("login-button")).click();
    }

    @Then("Home Page should be Displayed")
    public void homePageShouldBeDisplayed() {
        driver.findElement(By.id("inventory_container"));
    }

    @When("User enter invalid Username")
    public void userEnterInvalidUsername() {
        driver.findElement(By.id("user-name")).sendKeys("ariepbudiman");
    }

    @And("User enter invalid Password")
    public void userEnterInvalidPassword() {
        driver.findElement(By.id("password")).sendKeys("12345");
    }

    @Then("Error Message Displayed")
    public void errorMessageDisplayed() {
        driver.findElement(By.className("error-button"));
        driver.close();
        driver.quit();
    }
}
