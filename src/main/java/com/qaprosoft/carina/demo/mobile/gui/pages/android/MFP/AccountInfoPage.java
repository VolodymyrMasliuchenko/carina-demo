package com.qaprosoft.carina.demo.mobile.gui.pages.android.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.AccountInfoPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = AccountInfoPageBase.class)
public class AccountInfoPage extends AccountInfoPageBase {

    @FindBy(id = "com.myfitnesspal.android:id/toolbarUsername")
    private ExtendedWebElement accountUsername;

    public AccountInfoPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getAccountUsername() {
        return accountUsername.getText();
    }


}
