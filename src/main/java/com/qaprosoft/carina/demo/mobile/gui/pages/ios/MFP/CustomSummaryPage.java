package com.qaprosoft.carina.demo.mobile.gui.pages.ios.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.CustomDashboardPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.CustomSummaryPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.DiaryPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums.CustomSummaryPageItems;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = CustomSummaryPageBase.class)
public class CustomSummaryPage extends CustomSummaryPageBase {
    public CustomSummaryPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public DiaryPageBase submitSettings() {
        throw new NotImplementedException("Not implemented");
    }

    @Override
    public boolean isNutrientByNameChecked(CustomSummaryPageItems customSummaryPageItems) {
        throw new NotImplementedException("Not implemented");
    }

    @Override
    public void checkNutrient(CustomSummaryPageItems customSummaryPageItems) {
        throw new NotImplementedException("Not implemented");
    }
}
