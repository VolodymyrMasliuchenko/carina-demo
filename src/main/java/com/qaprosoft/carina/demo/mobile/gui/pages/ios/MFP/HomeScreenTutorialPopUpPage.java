package com.qaprosoft.carina.demo.mobile.gui.pages.ios.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.DashboardPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.HomeScreenTutorialPopUpPageBase;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = HomeScreenTutorialPopUpPageBase.class)
public class HomeScreenTutorialPopUpPage extends HomeScreenTutorialPopUpPageBase {
    public HomeScreenTutorialPopUpPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isClosePopUpButtonPresent() {
        throw new NotImplementedException("Not implemented");
    }

    @Override
    public boolean isLaunchQuickTipsButtonPresent() {
        throw new NotImplementedException("Not implemented");
    }

    @Override
    public DashboardPageBase clickClosePopUpButton() {
        throw new NotImplementedException("Not implemented");
    }
}
