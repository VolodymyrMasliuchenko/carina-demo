package com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class WelcomePageBase extends AbstractPage {

    public WelcomePageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isWelcomeLogoPresent();

    public abstract boolean isSignUpButtonPresent();

    public abstract boolean isLoginButtonPresent();

    public abstract SignUpPageBase clickSignUpButton();
    public abstract LoginPageBase clickLoginButton();
}
