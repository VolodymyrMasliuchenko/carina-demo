package com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class LoginPageBase extends AbstractPage {

    public LoginPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isEmailInputFieldPresent();

    public abstract boolean isPasswordInputFieldPresent();

    public abstract boolean isSubmitButtonPresent();

    public abstract boolean isForgotPasswordButtonPresent();

    public abstract boolean isContinueWithFacebookPresent();

    public abstract String getEmailInputFieldText();

    public abstract void typeEmail(String email);

    public abstract void typePassword(String password);

    public abstract HomeScreenTutorialPopUpBase clickSubmitButton();

    public abstract HomeScreenTutorialPopUpBase loginToAccount(String email, String password);


}
