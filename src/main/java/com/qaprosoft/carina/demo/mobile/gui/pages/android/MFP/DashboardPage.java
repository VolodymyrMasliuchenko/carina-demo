package com.qaprosoft.carina.demo.mobile.gui.pages.android.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.AccountInfoPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.DashboardPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = DashboardPageBase.class)
public class DashboardPage extends DashboardPageBase {

    @FindBy(xpath = "//android.view.View[@content-desc='User avatar']")
    private ExtendedWebElement userAvatar;

    @FindBy(xpath = "//android.view.View[@content-desc='Calories card']")
    private ExtendedWebElement dashboardCard;

    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    public boolean isPageOpened() {
        return dashboardCard.isElementPresent();
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
