package com.qaprosoft.carina.demo.mobile.gui.pages.android.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.AccountInfoPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.CommonPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.DashboardPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.HomeScreenTutorialPopUpPageBase;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CommonPageBase.class)
public class CommonPage extends CommonPageBase {
    public CommonPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isUserLoggedIn(String username) {
        DashboardPageBase dashboardPage = initPage(getDriver(), DashboardPageBase.class);
        Assert.assertTrue(dashboardPage.isUserAvatarPresent(), "User avatar isn't present");
        AccountInfoPageBase accountInfoPageMyFitnessPal = dashboardPage.clickUserAvatar();
        Assert.assertEquals(accountInfoPageMyFitnessPal.getAccountUsername(), username, "User isn't logged in to account");
        return true;
    }
}
