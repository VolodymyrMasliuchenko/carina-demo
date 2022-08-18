package com.qaprosoft.carina.demo.mobile.gui.pages.ios.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.CommonPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums.BottomMenu;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = CommonPageBase.class)
public class CommonPage extends CommonPageBase {
    public CommonPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isUserLoggedIn() {
        throw new NotImplementedException("Not implemented");
    }

    @Override
    public AbstractPage openBottomMenuItem(BottomMenu menu) {
        throw new NotImplementedException("Not implemented");
    }

    @Override
    public boolean isElementBottomMenuPresent(BottomMenu menu) {
        throw new NotImplementedException("Not implemented");
    }

    @Override
    public boolean isItemByTextPresent(String item) {
        throw new NotImplementedException("Not implemented");
    }

    @Override
    public boolean isItemByTextChecked(String item) {
        throw new NotImplementedException("Not implemented");
    }
}
