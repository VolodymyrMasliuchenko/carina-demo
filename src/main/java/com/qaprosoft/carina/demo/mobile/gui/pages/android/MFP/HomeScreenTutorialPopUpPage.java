package com.qaprosoft.carina.demo.mobile.gui.pages.android.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.HomePageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.HomeScreenTutorialPopUpBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = HomeScreenTutorialPopUpBase.class)
public class HomeScreenTutorialPopUp extends HomeScreenTutorialPopUpBase {

    @FindBy(xpath = "(//android.widget.Button)[1]")
    private ExtendedWebElement closePopUpButton;

    @FindBy(xpath = "(//android.widget.Button)[2]")
    private ExtendedWebElement launchQuickTipsButton;

    public HomeScreenTutorialPopUp(WebDriver driver) {
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
    public HomePageBase clickClosePopUpButton() {
        HomeScreenTutorialPopUpBase homeScreenTutorialPopUp = initPage(getDriver(), HomeScreenTutorialPopUpBase.class);
        Assert.assertTrue(homeScreenTutorialPopUp.isClosePopUpButtonPresent(), "Close button isn't present");
        closePopUpButton.click();
        return initPage(getDriver(), HomePageBase.class);
    }


}
