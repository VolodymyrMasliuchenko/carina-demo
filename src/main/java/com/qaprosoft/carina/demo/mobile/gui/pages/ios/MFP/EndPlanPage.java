package com.qaprosoft.carina.demo.mobile.gui.pages.ios.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.EndPlanPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums.EndPlanCheckBoxItems;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.PlansPageBase;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = EndPlanPageBase.class)
public class EndPlanPage extends EndPlanPageBase {
    public EndPlanPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void checkOption(EndPlanCheckBoxItems item) {
        throw new NotImplementedException("Not implemented");
    }

    @Override
    public void uncheckOption(EndPlanCheckBoxItems item) {
        throw new NotImplementedException("Not implemented");
    }

    @Override
    public boolean isOptionChecked(EndPlanCheckBoxItems item) {
        throw new NotImplementedException("Not implemented");
    }

    @Override
    public boolean isOptionUnchecked(EndPlanCheckBoxItems item) {
        throw new NotImplementedException("Not implemented");
    }

    @Override
    public PlansPageBase endPlanAndReturnPlansPage() {
        throw new NotImplementedException("Not implemented");
    }
}
