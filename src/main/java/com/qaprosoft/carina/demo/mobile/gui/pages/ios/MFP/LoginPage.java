package com.qaprosoft.carina.demo.mobile.gui.pages.ios.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.DashboardPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.LoginPageBase;
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
    public boolean isLoginButtonPresent() {
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
    public void clickLoginButton() {
        throw new NotImplementedException("Not Implemented");
    }

    @Override
    public DashboardPageBase loginToAccount(String email, String password) {
        throw new NotImplementedException("Not Implemented");
    }
}
