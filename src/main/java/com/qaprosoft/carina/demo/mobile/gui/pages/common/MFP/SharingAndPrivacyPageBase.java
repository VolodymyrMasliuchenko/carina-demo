package com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums.SharingAndPrivacyOptions;
import org.openqa.selenium.WebDriver;

public abstract class SharingAndPrivacyPageBase extends AbstractPage {
    public SharingAndPrivacyPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract AbstractPage clickSharingAndPrivacyOption(SharingAndPrivacyOptions option);

    public abstract PrivacyCenterPageBase clickBackButton();


}
