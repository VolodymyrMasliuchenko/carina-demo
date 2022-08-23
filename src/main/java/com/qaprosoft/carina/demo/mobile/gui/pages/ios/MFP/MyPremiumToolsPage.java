package com.qaprosoft.carina.demo.mobile.gui.pages.ios.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums.MoreMenuItems;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums.MyPremiumToolsItems;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.MyPremiumToolsPageBase;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = MyPremiumToolsPageBase.class)
public class MyPremiumToolsPage extends MyPremiumToolsPageBase {
    public MyPremiumToolsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isMyPremiumPageItemNamePresent(MyPremiumToolsItems item) {
        throw new NotImplementedException("Not implemented");
    }

    @Override
    public boolean isMyPremiumPageItemDescriptionPresent(MyPremiumToolsItems item) {
        throw new NotImplementedException("Not implemented");
    }
}
