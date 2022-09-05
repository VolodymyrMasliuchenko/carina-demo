package com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.android.MFP.PrivacyCenterPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums.PrivacyCenterOptions;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums.SettingOptions;
import org.openqa.selenium.WebDriver;

public abstract class PrivacyCenterPageBase extends AbstractPage {
    public PrivacyCenterPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract AbstractPage clickPrivacyCenterOption(PrivacyCenterOptions option);

    public abstract SettingsPageBase clickBackButton();


}
