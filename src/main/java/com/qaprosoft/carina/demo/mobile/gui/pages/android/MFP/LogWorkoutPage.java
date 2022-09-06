package com.qaprosoft.carina.demo.mobile.gui.pages.android.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.LogWorkoutPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = LogWorkoutPageBase.class)
public class LogWorkoutPage extends LogWorkoutPageBase {

    @FindBy(xpath = "//android.widget.TextView[@text='Log Workout']")
    private ExtendedWebElement logWorkoutPageTitle;

    public LogWorkoutPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return logWorkoutPageTitle.isElementPresent(3);
    }
}
