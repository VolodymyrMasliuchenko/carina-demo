package com.qaprosoft.carina.demo.mobile.gui.pages.android.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.LoginPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.SignUpPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.WelcomePageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = WelcomePageBase.class)
public class WelcomePage extends WelcomePageBase {

    @FindBy(id = "com.myfitnesspal.android:id/imageLogo")
    private ExtendedWebElement welcomePageLogo;

    @FindBy(id = "com.myfitnesspal.android:id/buttonSignUp")
    private ExtendedWebElement signUpButton;

    @FindBy(id = "com.myfitnesspal.android:id/buttonLogIn")
    private ExtendedWebElement loginButton;

    public WelcomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return welcomePageLogo.isElementPresent();
    }

    @Override
    public boolean isWelcomeLogoPresent() {
       return welcomePageLogo.isElementPresent();
    }

    @Override
    public boolean isSignUpButtonPresent() {
        return signUpButton.isElementPresent();
    }

    @Override
    public boolean isLoginButtonPresent() {
        return loginButton.isElementPresent();
    }

    @Override
    public SignUpPageBase clickSignUpButton() {
        signUpButton.click();
        return initPage(getDriver(), SignUpPageBase.class);
    }

    @Override
    public LoginPageBase clickLoginButton() {
        loginButton.click();
        return initPage(getDriver(), LoginPageBase.class);
    }
}
