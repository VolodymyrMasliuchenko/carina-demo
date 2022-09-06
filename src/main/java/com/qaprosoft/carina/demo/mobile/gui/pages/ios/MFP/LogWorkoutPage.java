package com.qaprosoft.carina.demo.mobile.gui.pages.ios.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.LogWorkoutPageBase;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = LogWorkoutPageBase.class)
public class LogWorkoutPage extends LogWorkoutPageBase {
    public LogWorkoutPage(WebDriver driver) {
        super(driver);
    }
}
