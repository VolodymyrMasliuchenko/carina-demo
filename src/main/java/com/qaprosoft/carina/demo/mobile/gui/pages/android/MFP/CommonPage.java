package com.qaprosoft.carina.demo.mobile.gui.pages.android.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.*;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums.BottomMenu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CommonPageBase.class)
public class CommonPage extends CommonPageBase {

    @FindBy(xpath = "//*[contains(@resource-id,'com.myfitnesspal.android:id/bottomNavigationBar')]//*[contains(@text, '%s')]")
    private ExtendedWebElement bottomMenuIcon;

    @FindBy(xpath = "//*[contains(@text, '%s')]")
    private ExtendedWebElement elementWithText;

    public CommonPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isUserLoggedIn() {
        DashboardPageBase dashboardPage = initPage(getDriver(), DashboardPageBase.class);
        Assert.assertTrue(dashboardPage.isUserAvatarPresent(), "User isn't logged in");
        return true;
    }

    @Override
    public AbstractPage openBottomMenuItem(BottomMenu menu) {
        bottomMenuIcon.format(menu.getOptionAndroid()).click();
        return initPage(getDriver(), menu.getPage());
    }

    @Override
    public boolean isElementBottomMenuPresent(BottomMenu menu) {
        return bottomMenuIcon.format(menu.getOptionAndroid()).isElementPresent();
    }

    @Override
    public boolean isItemByTextPresent(String item) {
        return  elementWithText.format(item).isElementPresent();
    }

    @Override
    public boolean isItemByTextChecked(String item) {
        return elementWithText.format(item).isChecked();
    }

}
