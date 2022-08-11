package com.qaprosoft.carina.demo.mobile.gui.pages.android.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.AccountInfoPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.HomePageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = HomePageBase.class)
public class HomePage extends HomePageBase {

    @FindBy(xpath = "//android.view.View[@content-desc='User avatar']")
    private ExtendedWebElement userAvatar;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isUserAvatarPresent() {
        return userAvatar.isElementPresent();
    }

    @Override
    public AccountInfoPageBase clickUserAvatar() {
        userAvatar.click();
        return initPage(getDriver(), AccountInfoPageBase.class);
    }
}
