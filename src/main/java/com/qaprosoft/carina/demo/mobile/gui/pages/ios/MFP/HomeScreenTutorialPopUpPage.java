package com.qaprosoft.carina.demo.mobile.gui.pages.ios.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.HomePageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.HomeScreenTutorialPopUpBase;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = HomeScreenTutorialPopUpBase.class)
public class HomeScreenTutorialPopUp extends HomeScreenTutorialPopUpBase {
    public HomeScreenTutorialPopUp(WebDriver driver) {
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
    public HomePageBase clickClosePopUpButton() {
        throw new NotImplementedException("Not implemented");
    }
}
