package com.qaprosoft.carina.demo.mobile.gui.pages.ios.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums.MoreMenuItems;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.MoreMenuPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.NewsFeedPageBase;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = MoreMenuPageBase.class)
public class MoreMenuPage extends MoreMenuPageBase {
    public MoreMenuPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isMenuItemPresent(MoreMenuItems menu) {
        throw new NotImplementedException("Not implemented");
    }
}
