package com.qaprosoft.carina.demo.mobile.gui.pages.android.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.PlansPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = PlansPageBase.class)
public class PlansPage extends PlansPageBase {

    @FindBy(xpath = "(//android.widget.TextView[@text='Plans'])[1]")
    private ExtendedWebElement plansPageTitle;

    public PlansPage(WebDriver driver) {
        super(driver);
    }

    public boolean isPageOpened() {
        return plansPageTitle.isElementPresent();
    }

}
