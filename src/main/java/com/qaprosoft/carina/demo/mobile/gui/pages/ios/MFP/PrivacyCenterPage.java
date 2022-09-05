package com.qaprosoft.carina.demo.mobile.gui.pages.ios.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums.PrivacyCenterOptions;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.PrivacyCenterPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.SettingsPageBase;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = PrivacyCenterPageBase.class)
public class PrivacyCenterPage extends PrivacyCenterPageBase {
    public PrivacyCenterPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public AbstractPage clickPrivacyCenterOption(PrivacyCenterOptions option) {
        throw new NotImplementedException("Not implemented for IOS");
    }

    @Override
    public SettingsPageBase clickBackButton() {
        throw new NotImplementedException("Not implemented for IOS");
    }
}
