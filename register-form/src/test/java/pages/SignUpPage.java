package pages;

import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import tests.utils.SeleniumUtils;

public class SignUpPage {
    WebDriver driver;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean open(String url) {
        if (driver == null) return false;
        driver.get(url);
        return true;
    }

    @FindBy(id = "username")
    WebElement userNameInput;

    @FindBy(xpath = "//*[@id=\"svelte\"]/div[1]/div[2]/div[2]/div/div/div/form/div[1]/small[2]")
    WebElement userNameErrElement;

    @FindBy(id = "password")
    WebElement passwordInput;

    @FindBy(xpath = "//*[@id=\"svelte\"]/div[1]/div[2]/div[2]/div/div/div/form/div[2]/small[2]")
    WebElement passwordErrorElement;

    @FindBy(id = "password2")
    WebElement confirmPasswordInput;

    @FindBy(xpath = "//*[@id=\"svelte\"]/div[1]/div[2]/div[2]/div/div/div/form/div[3]/small[2]")
    WebElement confirmPasswordErrorElement;

    @FindBy(xpath = "//*[@id=\"Ms\"]")
    WebElement msRadioButton;

    @FindBy(xpath = "//*[@id=\"Mr\"]")
    WebElement mrRadioButton;

    @FindBy(id = "input-first-name")
    WebElement firstNameInput;

    @FindBy(xpath = "//*[@id=\"svelte\"]/div[1]/div[2]/div[2]/div/div/div/form/div[6]/small[2]")
    WebElement firstNameErrorElement;

    @FindBy(id = "input-last-name")
    WebElement lastNameInput;
    @FindBy(xpath = "//*[@id=\"svelte\"]/div[1]/div[2]/div[2]/div/div/div/form/div[7]/small[2]")
    WebElement lastNameErrorElement;

    @FindBy(id = "input-email")
    WebElement emailInput;

    @FindBy(id = "input-dob")
    WebElement dateOfBirthInput;

    @FindBy(id = "input-nationality")
    WebElement nationalityElement;

    @FindBy(id = "terms")
    WebElement termAndConditionCheckbox;

    @FindBy(xpath = "//*[@id=\"svelte\"]/div[1]/div[2]/div[2]/div/div/div/form/div[12]/button")
    WebElement submitButton;

    public void insertValueIntoInputElement(WebElement inputElement, String value) {
        inputElement.clear();
        inputElement.sendKeys(value);
    }

    public void insertUsername(String value) {
        System.out.println("Username input:" + value);
        insertValueIntoInputElement(userNameInput, value);
    }

    public void insertPassword(String value) {
        System.out.println("Password:" + value);
        insertValueIntoInputElement(passwordInput, value);
    }

    public void insertConfirmPassword(String value) {
        System.out.println("Confirm password:" + value);
        insertValueIntoInputElement(confirmPasswordInput, value);
    }

    public void selectGender(String value) {
        if(value.equalsIgnoreCase("ms")) {
            msRadioButton.click();
        }

        if(value.equalsIgnoreCase("mr")) {
            msRadioButton.click();
        }
    }

    public void insertFirstName(String value) {
        insertValueIntoInputElement(firstNameInput, value);
    }

    public void insertLastName(String value) {
        insertValueIntoInputElement(lastNameInput, value);
    }

    public void insertEmail(String value) {
        insertValueIntoInputElement(emailInput, value);
    }

    public void selectDateOfBirth(String value) {
        insertValueIntoInputElement(dateOfBirthInput, value);
        dateOfBirthInput.sendKeys(Keys.ENTER);
    }

    public void selectNationality(String value) {
        Select nationalitySelect = new Select(nationalityElement);
        nationalitySelect.selectByVisibleText(value);
    }

    public void checkTermsAndConditions(boolean value) {
        termAndConditionCheckbox.sendKeys(Keys.SPACE);
    }

    public void registerNewUser(String userName, String password, String confirmPassword,
                                String gender, String firstName, String lastName, String email,
                                String dateOfBirth, String nationality, boolean isTermsAndConditionsChecked
                                ) {
        insertUsername(userName);
        insertPassword(password);
        insertConfirmPassword(confirmPassword);
        selectGender(gender);
        insertFirstName(firstName);
        insertLastName(lastName);
        insertEmail(email);
        selectDateOfBirth(dateOfBirth);
        selectNationality(nationality);
        checkTermsAndConditions(isTermsAndConditionsChecked);
    }

    public boolean checkErr(String expectedErr, String errorType) {
        switch (errorType) {
            case "username":
                String userNameError = "";
                try {
                    userNameError = userNameErrElement.getText();
                } catch (NoSuchElementException e) {

                }
                return expectedErr.equalsIgnoreCase(userNameError);
            case "password":
                String passwordError = "";
                try {
                    passwordError = passwordErrorElement.getText();
                } catch (NoSuchElementException e) {

                }
                return expectedErr.equalsIgnoreCase(passwordError);
            case "confirmPassword":
                String confirmPasswordError = "";
                try {
                    confirmPasswordError = confirmPasswordErrorElement.getText();
                } catch (NoSuchElementException e) {

                }
                return expectedErr.equalsIgnoreCase(confirmPasswordError);
            case "firstName":
                String firstNameError = "";
                try {
                    firstNameError = firstNameErrorElement.getText();
                } catch (NoSuchElementException e) {

                }
                return expectedErr.equalsIgnoreCase(firstNameError);
            case "lastName":
                String lastNameError = "";
                try {
                    lastNameError = lastNameErrorElement.getText();
                } catch (NoSuchElementException e) {

                }
                return expectedErr.equalsIgnoreCase(lastNameError);
            case "email":
                String email = emailInput.getAttribute("value");
                System.out.println("TEST" + SeleniumUtils.isEmailValid(email) + "email: " + emailInput.getAttribute("value"));
                return SeleniumUtils.isEmailValid(email);

            default:
                return false;
        }
    }
}
