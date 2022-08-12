package com.qaprosoft.carina.demo.mobile.gui.pages.android.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.NewsFeedPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = NewsFeedPageBase.class)
public class NewsFeedPage extends NewsFeedPageBase {

    @FindBy(xpath = "(//android.widget.TextView[@text='Newsfeed'])[1]")
    private ExtendedWebElement newsFeedPageTitle;

    public NewsFeedPage(WebDriver driver) {
        super(driver);
    }

    public boolean isPageOpened() {
        return newsFeedPageTitle.isElementPresent();
    }

}
