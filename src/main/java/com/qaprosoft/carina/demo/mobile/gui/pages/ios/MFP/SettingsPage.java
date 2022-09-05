package com.qaprosoft.carina.demo.mobile.gui.pages.ios.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums.SettingOptions;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.MoreMenuPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.SettingsPageBase;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = SettingsPageBase.class)
public class SettingsPage extends SettingsPageBase {
    public SettingsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public AbstractPage clickSettingsOption(SettingOptions option) {
        throw new NotImplementedException("Not implemented for IOS");
    }

    @Override
    public MoreMenuPageBase clickBackButton() {
        throw new NotImplementedException("Not implemented for IOS");
    }
}
