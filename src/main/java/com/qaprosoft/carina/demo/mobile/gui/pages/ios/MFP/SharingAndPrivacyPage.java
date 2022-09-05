package com.qaprosoft.carina.demo.mobile.gui.pages.ios.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums.SharingAndPrivacyOptions;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.PrivacyCenterPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.SharingAndPrivacyPageBase;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = SharingAndPrivacyPageBase.class)
public class SharingAndPrivacyPage extends SharingAndPrivacyPageBase {
    public SharingAndPrivacyPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public AbstractPage clickSharingAndPrivacyOption(SharingAndPrivacyOptions option) {
        throw new NotImplementedException("Not implemented for IOS");
    }

    @Override
    public PrivacyCenterPageBase clickBackButton() {
        throw new NotImplementedException("Not implemented for IOS");
    }
}
