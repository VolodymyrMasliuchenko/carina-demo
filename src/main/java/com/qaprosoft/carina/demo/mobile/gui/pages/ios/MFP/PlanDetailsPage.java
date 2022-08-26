package com.qaprosoft.carina.demo.mobile.gui.pages.ios.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.PlanDetailsPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.PlansPageBase;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = PlanDetailsPageBase.class)
public class PlanDetailsPage extends PlanDetailsPageBase {
    public PlanDetailsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public PlansPageBase startPlan() {
        throw new NotImplementedException("Not implemented");
    }

}
