package com.qaprosoft.carina.demo.mobile.gui.pages.ios.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.CommonPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.HomeScreenTutorialPopUpBase;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = CommonPageBase.class)
public class CommonPage extends CommonPageBase {
    public CommonPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void checkUsername(HomeScreenTutorialPopUpBase homeScreenTutorialPopUp, String username) {
        throw new NotImplementedException("Not implemented");
    }
}
