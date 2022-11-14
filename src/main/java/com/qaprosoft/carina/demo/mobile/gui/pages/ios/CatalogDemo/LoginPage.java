package com.qaprosoft.carina.demo.mobile.gui.pages.ios.CatalogDemo;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.CatalogDemo.CatalogPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.CatalogDemo.LoginPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.AccountPageBase;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = LoginPageBase.class)
public class LoginPage extends LoginPageBase implements IMobileUtils {

    @ExtendedFindBy(iosClassChain = "**/XCUIElementTypeStaticText[`label == \"Login\"`]")
    private ExtendedWebElement loginPageTitle;

    @ExtendedFindBy(accessibilityId = "Login button")
    private ExtendedWebElement loginButton;

    @ExtendedFindBy(accessibilityId = "bob@example.com-autofill")
    private ExtendedWebElement loginAutofillBobButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return loginPageTitle.isElementPresent(3);
    }

    @Override
    public CatalogPageBase loginUser() {
        loginAutofillBobButton.click(3);
        loginButton.click(3);
        return initPage(CatalogPageBase.class);
    }
}
