package com.qaprosoft.carina.demo.mobile.gui.pages.ios.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.LogWorkoutPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.PlansTaskPageBase;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = LogWorkoutPageBase.class)
public class LogWorkoutPage extends LogWorkoutPageBase {
    public LogWorkoutPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public PlansTaskPageBase clickCheckmarkIcon() {
        throw new NotImplementedException("Not implemented for IOS");
    }

    @Override
    public boolean isWorkoutLoggedMessagePresent() {
        throw new NotImplementedException("Not implemented for IOS");
    }
}
