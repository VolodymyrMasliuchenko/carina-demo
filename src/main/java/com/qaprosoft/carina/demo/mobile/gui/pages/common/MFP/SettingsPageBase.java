package com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP;

import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.MFP.Enums.SettingOptions;
import org.openqa.selenium.WebDriver;

public abstract class SettingsPageBase extends AbstractPage implements IMobileUtils {
    public SettingsPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract AbstractPage clickSettingsOption(SettingOptions option);

    public abstract MoreMenuPageBase clickBackButton();


}
