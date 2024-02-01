package uk.co.heartbingo.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import uk.co.heartbingo.pages.HomePage;

import static uk.co.heartbingo.browserfactory.ManageBrowser.driver;

public class MySteps {
    @When("I open the URL")
    public void iOpenTheURL() {
    }

    @And("I click on Sign Up button")
    public void iClickOnSignUpButton() {
        new HomePage().clickOnSignUpButton();

    }

    @And("I click on continue button")
    public void iClickOnContinueButton() {
        new HomePage().clickOnContinueButton();
    }

//    @And("I enter the FirstName {string}")
//    public void iEnterTheFirstName(String firstName) {
//        new HomePage().enterFirstName(firstName);
//    }
//
//    @Then("I enter lastname {string}")
//    public void iEnterLastname(String lastName) {
//        new HomePage().enterLastName(lastName);
//    }

    @And("I accept cookies")
    public void iAcceptCookies() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", driver.findElement(By.id("onetrust-accept-btn-handler")));
    }

    @And("I enter the firstName {string}")
    public void iEnterTheFirstName(String firstname) {
        new HomePage().enterFirstName(firstname);
    }


    @Then("I enter lastName {string}")
    public void iEnterLastName(String lastname) {
        new HomePage().enterLastName(lastname);
    }
}