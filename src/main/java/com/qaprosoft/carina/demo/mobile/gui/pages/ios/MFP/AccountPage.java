package com.qaprosoft.carina.demo.mobile.gui.pages.ios.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.AccountPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums.AccountPageNavbarItems;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = AccountPageBase.class)
public class AccountPage extends AccountPageBase {
    public AccountPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getAccountUsername() {
        throw new NotImplementedException("Not implemented");
    }

    @Override
    public AbstractPage openNavbarItem(AccountPageNavbarItems item) {
        throw new NotImplementedException("Not implemented");
    }
}
