package com.qaprosoft.carina.demo.mobile.gui.pages.ios.MFP;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums.NewsFeedSharingCheckboxItems;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.NewsFeedSharingPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.SharingAndPrivacyPageBase;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = NewsFeedSharingPageBase.class)
public class NewsFeedSharingPage extends NewsFeedSharingPageBase {
    public NewsFeedSharingPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void selectCheckboxItem(NewsFeedSharingCheckboxItems item) {
        throw new NotImplementedException("Not implemented for IOS");
    }

    @Override
    public void deselectCheckboxItem(NewsFeedSharingCheckboxItems item) {
        throw new NotImplementedException("Not implemented for IOS");
    }

    @Override
    public boolean isCheckboxItemSelected(NewsFeedSharingCheckboxItems item) {
        throw new NotImplementedException("Not implemented for IOS");
    }

    @Override
    public SharingAndPrivacyPageBase clickBackButton() {
        throw new NotImplementedException("Not implemented for IOS");
    }
}
