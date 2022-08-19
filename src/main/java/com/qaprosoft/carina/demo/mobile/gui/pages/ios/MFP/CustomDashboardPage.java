package com.qaprosoft.carina.demo.mobile.gui.pages.ios.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.CustomDashboardPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.CustomSummaryPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.DiaryPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums.CustomDashboardItems;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = CustomDashboardPageBase.class)
public class CustomDashboardPage extends CustomDashboardPageBase {
    public CustomDashboardPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public DiaryPageBase chooseDashboardItem(CustomDashboardItems item) {
        throw new NotImplementedException("Not implemented");
    }

    @Override
    public void closePopUp() {
        throw new NotImplementedException("Not implemented");
    }
}
