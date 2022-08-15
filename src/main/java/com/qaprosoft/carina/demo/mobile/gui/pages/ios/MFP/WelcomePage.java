package com.qaprosoft.carina.demo.mobile.gui.pages.ios.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.LoginPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.SignUpPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.WelcomePageBase;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = WelcomePageBase.class)
public class WelcomePage extends WelcomePageBase {
    public WelcomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isWelcomeLogoPresent() {
        throw new NotImplementedException("Not implemented");
    }

    @Override
    public boolean isSignUpButtonPresent() {
        throw new NotImplementedException("Not implemented");
    }

    @Override
    public boolean isLoginButtonPresent() {
        throw new NotImplementedException("Not implemented");
    }

    @Override
    public SignUpPageBase clickSignUpButton() {
        throw new NotImplementedException("Not implemented");
    }

    @Override
    public LoginPageBase clickLoginButton() {
        throw new NotImplementedException("Not implemented");
    }
}
