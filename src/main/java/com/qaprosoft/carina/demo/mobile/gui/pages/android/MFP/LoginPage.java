package com.qaprosoft.carina.demo.mobile.gui.pages.android.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.DashboardPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.HomeScreenTutorialPopUpPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.LoginPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.WelcomePageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = LoginPageBase.class)
public class LoginPage extends LoginPageBase {

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'Log In')]")
    private ExtendedWebElement loginPageTitle;

    @FindBy(id = "com.myfitnesspal.android:id/email_address_edit")
    private ExtendedWebElement emailInputField;

    @FindBy(id = "com.myfitnesspal.android:id/password_edit")
    private ExtendedWebElement passwordInputField;

    @FindBy(id = "com.myfitnesspal.android:id/login_button")
    private ExtendedWebElement loginButton;

    @FindBy(id = "com.myfitnesspal.android:id/forgot_password_button")
    private ExtendedWebElement forgotPasswordButton;

    @FindBy(id = "com.myfitnesspal.android:id/facebook_button")
    private ExtendedWebElement continueWithFacebookButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return loginPageTitle.isElementPresent();
    }

    @Override
    public boolean isEmailInputFieldPresent() {
        return emailInputField.isElementPresent();
    }

    @Override
    public boolean isPasswordInputFieldPresent() {
        return passwordInputField.isElementPresent();
    }

    @Override
    public boolean isLoginButtonPresent() {
        return loginButton.isElementPresent();
    }

    @Override
    public String getEmailInputFieldText() {
        return emailInputField.getText();
    }

    @Override
    public void typeEmail(String email) {
        emailInputField.type(email);
    }

    @Override
    public void typePassword(String password) {
        passwordInputField.type(password);
    }

    @Override
    public void clickLoginButton() {
        loginButton.click();
    }

    @Override
    public DashboardPageBase loginToAccount(String email, String password) {
        //open welcome page
        WelcomePageBase welcomePage = initPage(getDriver(), WelcomePageBase.class);
        Assert.assertTrue(welcomePage.isPageOpened(), "Welcome page isn't opened");
        LoginPageBase loginPage = welcomePage.clickLoginButton();
        Assert.assertTrue(loginPage.isPageOpened(), "Login page isn't opened");
        //check if present
        Assert.assertTrue(loginPage.isEmailInputFieldPresent(), "Email input field isn't present");
        Assert.assertTrue(loginPage.isPasswordInputFieldPresent(), "Password input field isn't present");
        Assert.assertTrue(loginPage.isLoginButtonPresent(), "Submit button isn't present");
        //log in
        loginPage.typeEmail(email);
        loginPage.typePassword(password);
        Assert.assertEquals(loginPage.getEmailInputFieldText(), email, "Email input field isn't typed");
        loginPage.clickLoginButton();
        HomeScreenTutorialPopUpPageBase homeScreenTutorialPopUp = initPage(getDriver(), HomeScreenTutorialPopUpPageBase.class);
        homeScreenTutorialPopUp.clickClosePopUpButton();
        return initPage(getDriver(), DashboardPageBase.class);
    }


}
