package com.qaprosoft.carina.demo.mobile.gui.pages.ios.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.LoginPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.HomeScreenTutorialPopUpBase;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = LoginPageBase.class)
public class LoginPage extends LoginPageBase {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isEmailInputFieldPresent() {
        throw new NotImplementedException("Not Implemented");
    }

    @Override
    public boolean isPasswordInputFieldPresent() {
        throw new NotImplementedException("Not Implemented");
    }

    @Override
    public boolean isSubmitButtonPresent() {
        throw new NotImplementedException("Not Implemented");
    }

    @Override
    public boolean isForgotPasswordButtonPresent() {
        throw new NotImplementedException("Not Implemented");
    }

    @Override
    public boolean isContinueWithFacebookPresent() {
        throw new NotImplementedException("Not Implemented");
    }

    @Override
    public String getEmailInputFieldText() {
        throw new NotImplementedException("Not Implemented");
    }

    @Override
    public void typeEmail(String email) {
        throw new NotImplementedException("Not Implemented");
    }

    @Override
    public void typePassword(String password) {
        throw new NotImplementedException("Not Implemented");
    }

    @Override
    public HomeScreenTutorialPopUpBase clickSubmitButton() {
        throw new NotImplementedException("Not Implemented");
    }

    @Override
    public HomeScreenTutorialPopUpBase loginToAccount(String email, String password) {
        throw new NotImplementedException("Not Implemented");
    }
}
