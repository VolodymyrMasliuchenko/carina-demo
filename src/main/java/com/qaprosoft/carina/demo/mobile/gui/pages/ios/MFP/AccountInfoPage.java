package com.qaprosoft.carina.demo.mobile.gui.pages.ios.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.AccountInfoPageBase;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = AccountInfoPageBase.class)
public class AccountInfoPage extends AccountInfoPageBase {
    public AccountInfoPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getAccountUsername() {
        throw new NotImplementedException("Not implemented");
    }
}
