package com.qaprosoft.carina.demo.mobile.gui.pages.ios.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.AccountInfoPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.DashboardPageBase;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = DashboardPageBase.class)
public class DashboardPage extends DashboardPageBase {
    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isUserAvatarPresent() {
        throw new NotImplementedException("Not implemented");
    }

    @Override
    public AccountInfoPageBase clickUserAvatar() {
        throw new NotImplementedException("Not implemented");
    }
}
