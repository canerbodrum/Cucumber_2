package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.*;
import org.apache.commons.lang3.RandomStringUtils;

public class _02_CountrySteps {
    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();

    @And("Navigate to country page")
    public void navigateToCountryPage() {
        ln.clickFunction(ln.setup);
        ln.clickFunction(ln.parameters);
        ln.clickFunction(ln.countries);
    }

    @When("create a country")
    public void createACountry() {
        String ulkeAdi = RandomStringUtils.randomAlphanumeric(8); // 4 harf
        String ulkeKodu= RandomStringUtils.randomNumeric(4); // 4 rakam
        dc.clickFunction(dc.addButton);
        dc.sendKeysFunction(dc.nameInput, ulkeAdi);
        dc.sendKeysFunction(dc.codeInput, ulkeKodu);
        dc.clickFunction(dc.saveButton);


    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {

        dc.verifyContainsTextFunction(dc.successMessage, "success");
    }

    @When("create a country name as {string} code as {string}")
    public void createACountryNameAsCodeAs(String names, String codes) {
        dc.clickFunction(dc.addButton);
        dc.sendKeysFunction(dc.nameInput, "names");
        dc.sendKeysFunction(dc.codeInput, "codes");
        dc.clickFunction(dc.saveButton);
    }
}
