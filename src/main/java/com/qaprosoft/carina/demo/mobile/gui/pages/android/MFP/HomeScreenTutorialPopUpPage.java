package com.qaprosoft.carina.demo.mobile.gui.pages.android.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.DashboardPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.HomeScreenTutorialPopUpPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = HomeScreenTutorialPopUpPageBase.class)
public class HomeScreenTutorialPopUpPage extends HomeScreenTutorialPopUpPageBase {

    @FindBy(xpath = "(//android.widget.Button)[1]")
    private ExtendedWebElement closePopUpButton;

    @FindBy(xpath = "(//android.widget.Button)[2]")
    private ExtendedWebElement launchQuickTipsButton;

    public HomeScreenTutorialPopUpPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isClosePopUpButtonPresent() {
        return closePopUpButton.isElementPresent();
    }

    @Override
    public boolean isLaunchQuickTipsButtonPresent() {
        return launchQuickTipsButton.isElementPresent();
    }

    @Override
    public DashboardPageBase clickClosePopUpButton() {
        HomeScreenTutorialPopUpPageBase homeScreenTutorialPopUp = initPage(getDriver(), HomeScreenTutorialPopUpPageBase.class);
        Assert.assertTrue(homeScreenTutorialPopUp.isClosePopUpButtonPresent(), "Close button isn't present");
        closePopUpButton.click();
        return initPage(getDriver(), DashboardPageBase.class);
    }


}
