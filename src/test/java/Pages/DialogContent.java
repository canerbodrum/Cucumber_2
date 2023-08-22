package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class DialogContent extends Parent {
    // POM: Page Object Model


    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "input[formcontrolname='username']")
    public WebElement username;

    @FindBy(css = "[formcontrolname='password']")
    public WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    public WebElement loginButton;

    @FindBy(css = "span[class='mat-mdc-tooltip-trigger logo-text']")
    public WebElement txtTechnoStudy;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'ADD')]//button")
    public WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    public WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']/input")
    public WebElement codeInput;

    @FindBy(xpath = "//ms-save-button[@class='ng-star-inserted']//button")
    public WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement successMessage;

    @FindBy(xpath = "//div[contains(text(),'already exist')]")
    public WebElement alreadyExistMessage;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']/input")
    public WebElement shortName;

    @FindBy(xpath = "//mat-form-field//input[@data-placeholder='Name']")
    public WebElement searchInput;

    @FindBy(xpath = "//ms-search-button//button")
    public WebElement searchButton;

    @FindBy(xpath = "(//ms-delete-button//button)[1]")
    public WebElement deleteImageBtn;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement deleteDialogBtn;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='budgetAccountIntegrationCode']//input")
    public WebElement integrationCodeInput;

    @FindBy(xpath = "//ms-integer-field[@formcontrolname='priority']//input")
    public WebElement priorityInput;

    @FindBy(xpath = "//mat-slide-toggle[@formcontrolname='active']")
    public WebElement toggleButton;

    @FindBy(xpath = "//mat-select//span[text()='Academic Period']")
    public WebElement academicPeriod;

    @FindBy(xpath = "(//mat-option/span)[1]")
    public WebElement academicPeriod1;

    @FindBy(xpath = "(//span[text()='Grade Level'])[1]")
    public WebElement gradeLvl;

    @FindBy(xpath = "(//mat-option//span)[3]")
    public WebElement gradeLvl3;

    public WebElement getWebElement(String strButton) {

        switch (strButton) {
            case "addButton":
                return addButton;
            case "saveButton":
                return saveButton;
            case "nameInput":
                return nameInput;
            case "codeInput":
                return codeInput;
            case "integrationCodeInput":
                return integrationCodeInput;
            case "priorityInput":
                return priorityInput;
            case "toggleButton":
                return toggleButton;
            case "academicPeriod":
                return academicPeriod;
            case "academicPeriod1":
                return academicPeriod1;
            case "gradeLvl":
                return gradeLvl;
            case "gradeLvl3":
                return gradeLvl3;
        }
        return null;
    }

    public void deleteItem(String searchText) {
        sendKeysFunction(searchInput, searchText);
        clickFunction(searchButton);
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"), 0));
        ////fuse-progress-bar/*    bu 0 olana kadar beklet
        clickFunction(deleteImageBtn);
        clickFunction(deleteDialogBtn);
    }


}
