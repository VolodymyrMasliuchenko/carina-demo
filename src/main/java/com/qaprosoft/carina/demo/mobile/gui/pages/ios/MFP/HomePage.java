package com.qaprosoft.carina.demo.mobile.gui.pages.ios.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.AccountInfoPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.HomePageBase;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = HomePageBase.class)
public class HomePage extends HomePageBase {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isUserAvatarButtonPresent() {
        throw new NotImplementedException("Not implemented");
    }

    @Override
    public AccountInfoPageBase clickUserAvatarButton() {
        throw new NotImplementedException("Not implemented");
    }
}
