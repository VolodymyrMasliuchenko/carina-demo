package com.qaprosoft.carina.demo.mobile.gui.pages.ios.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.EndPlanPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.PlansTaskPageBase;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = PlansTaskPageBase.class)
public class PlansTaskPage extends PlansTaskPageBase {
    public PlansTaskPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void clickAddPlanButton() {
        throw new NotImplementedException("Not implemented");
    }

    @Override
    public void clickClosePopUpButton() {
        throw new NotImplementedException("Not implemented");
    }

    @Override
    public void endPlanIfPresent() {
        throw new NotImplementedException("Not implemented");
    }

    @Override
    public EndPlanPageBase openEndPlanPage() {
        throw new NotImplementedException("Not implemented");
    }
}
