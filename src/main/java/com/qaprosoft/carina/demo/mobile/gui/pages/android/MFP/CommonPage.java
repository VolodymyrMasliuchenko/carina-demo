package com.qaprosoft.carina.demo.mobile.gui.pages.android.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.AccountInfoPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.CommonPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.HomePageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.HomeScreenTutorialPopUpBase;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CommonPageBase.class)
public class CommonPage extends CommonPageBase {
    public CommonPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void checkUsername(HomeScreenTutorialPopUpBase homeScreenTutorialPopUp, String username) {
        Assert.assertTrue(homeScreenTutorialPopUp.isClosePopUpButtonPresent(), "Close button isn't present");
        Assert.assertTrue(homeScreenTutorialPopUp.isLaunchQuickTipsButtonPresent(), "Launch quick tips button isn't present");
        HomePageBase homePage = homeScreenTutorialPopUp.clickClosePopUpButton();
        Assert.assertTrue(homePage.isUserAvatarButtonPresent(), "User avatar isn't present");
        AccountInfoPageBase accountInfoPageMyFitnessPal = homePage.clickUserAvatarButton();
        Assert.assertEquals(accountInfoPageMyFitnessPal.getAccountUsername(), username, "User isn't logged in to account");
    }
}
